package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.RegRigheChiusureUffQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegRigheChiusureUffFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regRigheChiusureUff.RegRigheChiusureUffResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegRigheChiusureUffQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.RegRigheChiusureUffQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.RegRigheChiusureUffRepository;
import com.retexspa.xr.ms.main.core.queries.BaseSort;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import com.retexspa.xr.ms.main.core.responses.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegRigheChiusureUffQueryServiceImpl implements RegRigheChiusureUffQueryService {
    @Autowired
    private RegRigheChiusureUffRepository regRigheChiusureUffRepository;

    @Autowired
    private RegRigheChiusureUffQueryMapper regRigheChiusureUffQueryMapper;

    @Override
    public Page<RegRigheChiusureUffQueryEntity> searchQueryRegRigheChiusureUff(GenericSearchRequest<RegRigheChiusureUffFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;
                    case "codRiga":
                        break;
                    case "desRigaB":
                        break;
                    case "desRigaL":
                        break;
                    case "flgCancellato":
                        break;
                    case "dataCancellazione" :
                        break;
                    case "version":
                        break;
                    default:
                        throw new IllegalArgumentException("Order by is not correct");
                }
                Sort.Order sort = new Sort.Order(
                        (baseSort.getOrderType() != null
                                ? (baseSort.getOrderType().equalsIgnoreCase("ASC") ? Sort.Direction.ASC
                                : Sort.Direction.DESC)
                                : Sort.Direction.ASC),
                        (baseSort.getOrderBy() != null ? baseSort.getOrderBy() : "codRiga"));

                sorts.add(sort);
            }
        }
        if (sorts.size() == 0) {
            sorts.add(new Sort.Order(Sort.Direction.ASC, "codRiga"));
        }

        Pageable pageable = PageRequest.of(query.getPage(), query.getLimit(), Sort.by(sorts));

        List<Specification<RegRigheChiusureUffQueryEntity>> specifications = new ArrayList<>();
        RegRigheChiusureUffFilter filter = RegRigheChiusureUffFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getCodRiga() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("codRiga"), filter.getCodRiga()));
        }

        if (filter.getDesRigaB() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desRigaB")), "%" + filter.getDesRigaB().toUpperCase() + "%"));
        }
        if (filter.getDesRigaL() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desRigaL")), "%" + filter.getDesRigaL().toUpperCase() + "%"));
        }
        if (filter.getFlgCancellato() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgCancellato")), "%" + filter.getFlgCancellato().toUpperCase() + "%"));
        }
        if (filter.getDataCancellazione() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("dataCancellazione"), filter.getDataCancellazione()));
        }
        if (filter.getVersion() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("version"), filter.getVersion()));
        }
        Specification<RegRigheChiusureUffQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<RegRigheChiusureUffQueryEntity> page = this.regRigheChiusureUffRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public RegRigheChiusureUffResponse searchRegRigheChiusureUff(GenericSearchRequest<RegRigheChiusureUffFilter> query) {

        RegRigheChiusureUffResponse regRigheChiusureUffResponse = new RegRigheChiusureUffResponse();
        Page<RegRigheChiusureUffQueryEntity> page = searchQueryRegRigheChiusureUff(query);
        List<RegRigheChiusureUffQueryDTO> list = page.getContent().stream()
                .map(entity -> regRigheChiusureUffQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        regRigheChiusureUffResponse.setRecords(list);

        regRigheChiusureUffResponse.setPagination(Pagination.buildPagination(page));

        return regRigheChiusureUffResponse;
    }
}

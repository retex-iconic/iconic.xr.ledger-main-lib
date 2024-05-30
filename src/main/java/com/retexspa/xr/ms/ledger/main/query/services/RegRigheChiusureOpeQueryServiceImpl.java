package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.RegRigheChiusureOpeQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegRigheChiusureOpeFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regRigheChiusureOpe.RegRigheChiusureOpeResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegRigheChiusureOpeQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.RegRigheChiusureOpeQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.RegRigheChiusureOpeRepository;
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
public class RegRigheChiusureOpeQueryServiceImpl implements RegRigheChiusureOpeQueryService {
    @Autowired
    private RegRigheChiusureOpeRepository regRigheChiusureOpeRepository;

    @Autowired
    private RegRigheChiusureOpeQueryMapper regRigheChiusureOpeQueryMapper;

    @Override
    public Page<RegRigheChiusureOpeQueryEntity> searchQueryRegRigheChiusureOpe(GenericSearchRequest<RegRigheChiusureOpeFilter> query) {
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

        List<Specification<RegRigheChiusureOpeQueryEntity>> specifications = new ArrayList<>();
        RegRigheChiusureOpeFilter filter = RegRigheChiusureOpeFilter.createFilterFromMap(query.getFilter());
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
        if (filter.getVersion() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("version"), filter.getVersion()));
        }
        Specification<RegRigheChiusureOpeQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<RegRigheChiusureOpeQueryEntity> page = this.regRigheChiusureOpeRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public RegRigheChiusureOpeResponse searchRegRigheChiusureOpe(GenericSearchRequest<RegRigheChiusureOpeFilter> query) {

        RegRigheChiusureOpeResponse regRigheChiusureOpeResponse = new RegRigheChiusureOpeResponse();
        Page<RegRigheChiusureOpeQueryEntity> page = searchQueryRegRigheChiusureOpe(query);
        List<RegRigheChiusureOpeQueryDTO> list = page.getContent().stream()
                .map(entity -> regRigheChiusureOpeQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        regRigheChiusureOpeResponse.setRecords(list);

        regRigheChiusureOpeResponse.setPagination(Pagination.buildPagination(page));

        return regRigheChiusureOpeResponse;
    }
}

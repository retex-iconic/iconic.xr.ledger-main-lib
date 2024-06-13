package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.RegDettChiusureUffQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegDettChiusureUffFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regDettChiusureUff.RegDettChiusureUffResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureUffQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.RegDettChiusureUffQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.RegDettChiusureUffRepository;
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
public class RegDettChiusureUffQueryServiceImpl implements RegDettChiusureUffQueryService {
    @Autowired
    private RegDettChiusureUffRepository regDettChiusureUffRepository;

    @Autowired
    private RegDettChiusureUffQueryMapper regDettChiusureUffQueryMapper;

    @Override
    public Page<RegDettChiusureUffQueryEntity> searchQueryRegDettChiusureUff(GenericSearchRequest<RegDettChiusureUffFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;

                    case "idRigaChiUff":
                        baseSort.setOrderBy("rigaChiUffId");
                        break;

                    case "idOpePagC01":
                        baseSort.setOrderBy("opePagC01Id");
                        break;

                    case "segnoC01":
                        break;

                    case "idOpePagC02":
                        baseSort.setOrderBy("opePagC02Id");
                        break;

                    case "segnoC02":
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
                        (baseSort.getOrderBy() != null ? baseSort.getOrderBy() : "id"));

                sorts.add(sort);
            }
        }
        if (sorts.size() == 0) {
            sorts.add(new Sort.Order(Sort.Direction.ASC, "id"));
        }

        Pageable pageable = PageRequest.of(query.getPage(), query.getLimit(), Sort.by(sorts));

        List<Specification<RegDettChiusureUffQueryEntity>> specifications = new ArrayList<>();
        RegDettChiusureUffFilter filter = RegDettChiusureUffFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getIdRigaChiUff() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("rigaChiUff").get("id"), filter.getIdRigaChiUff()));
        }

        if (filter.getIdOpePagC01() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("opePagC01").get("id"),  filter.getIdOpePagC01()));
        }
        if (filter.getSegnoC01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("segnoC01")), "%" + filter.getSegnoC01().toUpperCase() + "%"));
        }
        if (filter.getIdOpePagC02() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("opePagC02").get("id"),  filter.getIdOpePagC02()));
        }
        if (filter.getSegnoC02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("segnoC02")), "%" + filter.getSegnoC02().toUpperCase() + "%"));
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
        Specification<RegDettChiusureUffQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<RegDettChiusureUffQueryEntity> page = this.regDettChiusureUffRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public RegDettChiusureUffResponse searchRegDettChiusureUff(GenericSearchRequest<RegDettChiusureUffFilter> query) {

        RegDettChiusureUffResponse regDettChiusureUffResponse = new RegDettChiusureUffResponse();
        Page<RegDettChiusureUffQueryEntity> page = searchQueryRegDettChiusureUff(query);
        List<RegDettChiusureUffQueryDTO> list = page.getContent().stream()
                .map(entity -> regDettChiusureUffQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        regDettChiusureUffResponse.setRecords(list);

        regDettChiusureUffResponse.setPagination(Pagination.buildPagination(page));

        return regDettChiusureUffResponse;
    }

}

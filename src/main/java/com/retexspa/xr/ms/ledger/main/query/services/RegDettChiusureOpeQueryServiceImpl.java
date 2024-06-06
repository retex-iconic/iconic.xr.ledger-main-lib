package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.RegDettChiusureOpeQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegDettChiusureOpeFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regDettChiusureOpe.RegDettChiusureOpeResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureOpeQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.RegDettChiusureOpeQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.RegDettChiusureOpeRepository;
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
public class RegDettChiusureOpeQueryServiceImpl implements RegDettChiusureOpeQueryService {
    @Autowired
    private RegDettChiusureOpeRepository regDettChiusureOpeRepository;

    @Autowired
    private RegDettChiusureOpeQueryMapper regDettChiusureOpeQueryMapper;

    @Override
    public Page<RegDettChiusureOpeQueryEntity> searchQueryRegDettChiusureOpe(GenericSearchRequest<RegDettChiusureOpeFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;
                    case "idRigaChiOpe":
                        break;
                    case "idOpePagC01":
                        break;
                    case "segnoC01":
                        break;
                    case "idOpePagC02":
                        break;
                    case "segnoC02":
                        break;
                    case "idOpePagC03":
                        break;
                    case "segnoC03":
                        break;
                    case "idOpePagC04":
                        break;
                    case "segnoC04":
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
                        (baseSort.getOrderBy() != null ? baseSort.getOrderBy() : "id"));

                sorts.add(sort);
            }
        }
        if (sorts.size() == 0) {
            sorts.add(new Sort.Order(Sort.Direction.ASC, "id"));
        }

        Pageable pageable = PageRequest.of(query.getPage(), query.getLimit(), Sort.by(sorts));

        List<Specification<RegDettChiusureOpeQueryEntity>> specifications = new ArrayList<>();
        RegDettChiusureOpeFilter filter = RegDettChiusureOpeFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getIdRigaChiOpe() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("rigaChiOpe").get("id"), filter.getIdRigaChiOpe()));
        }

        if (filter.getIdOpePagC01() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("opePagC01").get("id"), filter.getIdOpePagC01()));
        }

        if (filter.getSegnoC01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("segnoC01")), "%" + filter.getSegnoC01().toUpperCase() + "%"));
        }

        if (filter.getIdOpePagC02() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("opePagC02").get("id"), filter.getIdOpePagC02()));
        }

        if (filter.getSegnoC02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("segnoC02")), "%" + filter.getSegnoC02().toUpperCase() + "%"));
        }

        if (filter.getIdOpePagC03() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("opePagC03").get("id"), filter.getIdOpePagC03()));
        }

        if (filter.getSegnoC03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("segnoC03")), "%" + filter.getSegnoC03().toUpperCase() + "%"));
        }

        if (filter.getIdOpePagC04() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("opePagC04").get("id"), filter.getIdOpePagC04()));
        }

        if (filter.getSegnoC04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("segnoC04")), "%" + filter.getSegnoC04().toUpperCase() + "%"));
        }

        if (filter.getFlgCancellato() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgCancellato")), "%" + filter.getFlgCancellato().toUpperCase() + "%"));
        }
        if (filter.getVersion() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("version"), filter.getVersion()));
        }
        Specification<RegDettChiusureOpeQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<RegDettChiusureOpeQueryEntity> page = this.regDettChiusureOpeRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public RegDettChiusureOpeResponse searchRegDettChiusureOpe(GenericSearchRequest<RegDettChiusureOpeFilter> query) {

        RegDettChiusureOpeResponse regDettChiusureOpeResponse = new RegDettChiusureOpeResponse();
        Page<RegDettChiusureOpeQueryEntity> page = searchQueryRegDettChiusureOpe(query);
        List<RegDettChiusureOpeQueryDTO> list = page.getContent().stream()
                .map(entity -> regDettChiusureOpeQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        regDettChiusureOpeResponse.setRecords(list);

        regDettChiusureOpeResponse.setPagination(Pagination.buildPagination(page));

        return regDettChiusureOpeResponse;
    }
}

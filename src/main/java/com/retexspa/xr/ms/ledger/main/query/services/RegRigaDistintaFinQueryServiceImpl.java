package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.RegRigaDistintaFinQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegRigaDistintaFinFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regRigaDistintaFin.RegRigaDistintaFinResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegRigaDistintaFinQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.RegRigaDistintaFinQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.RegRigaDistintaFinRepository;
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
public class RegRigaDistintaFinQueryServiceImpl implements RegRigaDistintaFinQueryService{
    @Autowired
    private RegRigaDistintaFinRepository regRigaDistintaFinRepository;

    @Autowired
    private RegRigaDistintaFinQueryMapper regRigaDistintaFinQueryMapper;

    @Override
    public Page<RegRigaDistintaFinQueryEntity> searchQueryRegRigaDistintaFin(GenericSearchRequest<RegRigaDistintaFinFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;

                    case "idRigaDistFin":
                        break;

                    case "idOpePag":
                        break;

                    case "segno":
                        break;

                    case "flgCancellato":
                        break;

                    case "dataCancellazione":
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
                        (baseSort.getOrderBy() != null ? baseSort.getOrderBy() : "idRigaDistFin"));

                sorts.add(sort);
            }
        }
        if (sorts.size() == 0) {
            sorts.add(new Sort.Order(Sort.Direction.ASC, "idRigaDistFin"));
        }

        Pageable pageable = PageRequest.of(query.getPage(), query.getLimit(), Sort.by(sorts));

        List<Specification<RegRigaDistintaFinQueryEntity>> specifications = new ArrayList<>();
        RegRigaDistintaFinFilter filter = RegRigaDistintaFinFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getIdRigaDistFin() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("rigaDistFin").get("id"), filter.getIdRigaDistFin()));
        }

        if (filter.getIdOpePag() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("opePag").get("id"),  filter.getIdOpePag()));
        }
        if (filter.getSegno() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("segno")), "%" + filter.getSegno().toUpperCase() + "%"));
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
        Specification<RegRigaDistintaFinQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<RegRigaDistintaFinQueryEntity> page = this.regRigaDistintaFinRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public RegRigaDistintaFinResponse searchRegRigaDistintaFin(GenericSearchRequest<RegRigaDistintaFinFilter> query) {

        RegRigaDistintaFinResponse regRigaDistintaFinResponse = new RegRigaDistintaFinResponse();
        Page<RegRigaDistintaFinQueryEntity> page = searchQueryRegRigaDistintaFin(query);
        List<RegRigaDistintaFinQueryDTO> list = page.getContent().stream()
                .map(entity -> regRigaDistintaFinQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        regRigaDistintaFinResponse.setRecords(list);

        regRigaDistintaFinResponse.setPagination(Pagination.buildPagination(page));

        return regRigaDistintaFinResponse;
    }

}

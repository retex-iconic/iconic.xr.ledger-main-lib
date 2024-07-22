package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.TabMonetaQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabMonetaFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabMoneta.TabMonetaResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabMonetaQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.TabMonetaQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.TabMonetaRepository;
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
public class TabMonetaQueryServiceImpl implements  TabMonetaQueryService {

    @Autowired
    private TabMonetaRepository tabMonetaRepository;

    @Autowired
    private TabMonetaQueryMapper tabMonetaQueryMapper;

    @Override
    public Page<TabMonetaQueryEntity> searchQueryTabMoneta(GenericSearchRequest<TabMonetaFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;
                    case "tipoMoneta":
                        baseSort.setOrderBy("tipoMoneta");
                        break;

                    case "taglioCassetto":
                        baseSort.setOrderBy("taglioCassetto");
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
        List<Specification<TabMonetaQueryEntity>> specifications = new ArrayList<>();
        TabMonetaFilter filter = TabMonetaFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }
        if (filter.getIdValuta() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("tabValuta").get("id"), filter.getIdValuta()));
        }
        if (filter.getTipoMoneta() != null) {
            specifications.add(
                    (r, q, c) -> c.like(c.upper(r.get("tipoMoneta")), "%" + filter.getTipoMoneta().toUpperCase() + "%"));
        }
        if (filter.getTaglioCassetto() != null) {
            specifications.add(
                    (r, q, c) -> c.like(c.upper(r.get("taglioCassetto")), "%" + filter.getTaglioCassetto().toUpperCase() + "%"));
        }
        if (filter.getDescrizioneTaglio() != null) {
            specifications.add(
                    (r, q, c) -> c.like(c.upper(r.get("descrizioneTaglio")), "%" + filter.getDescrizioneTaglio().toUpperCase() + "%"));
        }
        if (filter.getValoreUnitario() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(c.upper(r.get("valoreUnitario")), "%" + filter.getValoreTubetto().toString() + "%"));
        }
        if (filter.getValoreTubetto() != null) {
            specifications.add(
                    (r, q, c) -> c.like(c.upper(r.get("valoreTubetto")), "%" + filter.getValoreTubetto().toString() + "%"));
        }
        if (filter.getFlgOrdini() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgOrdini"), filter.getFlgOrdini()));
        }
        if (filter.getFlgCassaforte() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgCassaforte"), filter.getFlgCassaforte()));
        }
        if (filter.getFlgContasoldiCm() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgContasoldiCm"), filter.getFlgContasoldiCm()));
        }
        if (filter.getFlgContasoldiHm() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgContasoldiHm"), filter.getFlgContasoldiHm()));
        }
        if (filter.getFlgContasoldiVb() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgContasoldiVb"), filter.getFlgContasoldiVb()));
        }
        if (filter.getFlgContasoldiCb() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgContasoldiCb"), filter.getFlgContasoldiCb()));
        }
        if (filter.getFlgInvioBanca() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgInvioBanca"), filter.getFlgInvioBanca()));
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
        Specification<TabMonetaQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<TabMonetaQueryEntity> page = this.tabMonetaRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public TabMonetaResponse searchTabMoneta(GenericSearchRequest<TabMonetaFilter> query) {

        TabMonetaResponse tabMonetaResponse = new TabMonetaResponse();
        Page<TabMonetaQueryEntity> page = searchQueryTabMoneta(query);
        List<TabMonetaQueryDTO> list = page.getContent().stream()
                .map(entity -> tabMonetaQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        tabMonetaResponse.setRecords(list);

        tabMonetaResponse.setPagination(Pagination.buildPagination(page));

        return tabMonetaResponse;
    }

}

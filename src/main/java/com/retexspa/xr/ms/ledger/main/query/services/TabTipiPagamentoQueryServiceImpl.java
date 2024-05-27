package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entites.TabTipiPagamentoQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabTipiPagamentoFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabTipiPagamentoAggregate.TabTipiPagamentoResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiPagamentoQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.TabTipiPagamentoQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.TabTipiPagamentoRepository;
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
public class TabTipiPagamentoQueryServiceImpl implements TabTipiPagamentoQueryService {

    @Autowired
    private TabTipiPagamentoRepository tabTipiPagamentoRepository;

    @Autowired
    private TabTipiPagamentoQueryMapper tabTipiPagamentoQueryMapper;

    @Override
    public Page<TabTipiPagamentoQueryEntity> searchQueryTabTipiPagamento(GenericSearchRequest<TabTipiPagamentoFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {

                Sort.Order sort = new Sort.Order(
                        (baseSort.getOrderType() != null ?
                                (baseSort.getOrderType().equalsIgnoreCase("ASC") ? Sort.Direction.ASC : Sort.Direction.DESC) :
                                Sort.Direction.ASC),
                        (baseSort.getOrderBy() != null ? baseSort.getOrderBy() : "codTipoPag")
                );

                sorts.add(sort);
            }
        }
        if (sorts.size() == 0) {
            sorts.add(new Sort.Order(Sort.Direction.ASC, "codTipoPag"));
        }

        Pageable pageable = PageRequest.of(query.getPage(), query.getLimit(), Sort.by(sorts));

        List<Specification<TabTipiPagamentoQueryEntity>> specifications = new ArrayList<>();

        TabTipiPagamentoFilter filter = TabTipiPagamentoFilter.createFilterFromMap(query.getFilter());

        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getCodTipoPag() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("codTipoPag"), filter.getCodTipoPag()));
        }

        if (filter.getDesTipoPagb() != null) {
            specifications.add((r, q, c) -> c.like(c.upper(r.get("desTipoPagb")), filter.getDesTipoPagb()));
        }

        if (filter.getDesTipoPagl() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desTipoPagl")), "%" + filter.getDesTipoPagl().toUpperCase() + "%"));
        }

        if (filter.getFlgContante() != null) {
            specifications.add(
                    (r, q, c) ->
                            c.equal(r.get("flgContante"),filter.getFlgContante()));
        }
        if (filter.getFlgAssegno() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                           r.get("flgAssegno"), filter.getFlgAssegno()));
        }
        if (filter.getFlgPos() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("flgPos"), filter.getFlgPos()));
        }
        if (filter.getFlgNonRiscosso() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                           r.get("flgNonRiscosso"),  filter.getFlgNonRiscosso()));
        }
        if (filter.getFlgSostDenaro() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("flgSostDenaro"),  filter.getFlgSostDenaro()));
        }
        if (filter.getFlgBuoniEnti() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("flgBuoniEnti"),  filter.getFlgBuoniEnti()));
        }
        if (filter.getFlgBuoniDay() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                           r.get("flgBuoniDay"),  filter.getFlgBuoniDay()));
        }
        if (filter.getFlgFatturaPagata() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("flgFatturaPagata"),  filter.getFlgFatturaPagata()));
        }
        if (filter.getFlgBuoniCeliaci() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("flgBuoniCeliaci"),  filter.getFlgBuoniCeliaci()));
        }
        if (filter.getVersion() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("version"), filter.getVersion()));
        }
        Specification<TabTipiPagamentoQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<TabTipiPagamentoQueryEntity> page = this.tabTipiPagamentoRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public TabTipiPagamentoResponse searchTabTipiPagamento(GenericSearchRequest<TabTipiPagamentoFilter> query) {

        TabTipiPagamentoResponse TabTipiPagamentoResponse = new TabTipiPagamentoResponse();
        Page<TabTipiPagamentoQueryEntity> page = searchQueryTabTipiPagamento(query);
        List<TabTipiPagamentoQueryDTO> list = page.getContent().stream()
                // .map(entity -> modelMapper.map(entity, TabTipiPagamentoQueryDTO.class))
                .map(entity -> tabTipiPagamentoQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        TabTipiPagamentoResponse.setRecords(list);

        TabTipiPagamentoResponse.setPagination(Pagination.buildPagination(page));

        return TabTipiPagamentoResponse;
    }

}

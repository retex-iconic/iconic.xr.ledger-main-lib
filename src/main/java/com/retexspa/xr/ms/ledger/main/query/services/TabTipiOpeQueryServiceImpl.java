package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.TabTipiOpeQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabTipiOpeFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.TabTipiOpeResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiOpeQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.TabTipiOpeQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.TabTipiOpeRepository;
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
public class TabTipiOpeQueryServiceImpl implements  TabTipiOpeQueryService {
    @Autowired
    private TabTipiOpeRepository tabTipiOpeRepository;

    @Autowired
    private TabTipiOpeQueryMapper tabTipiOpeQueryMapper;

    @Override
    public Page<TabTipiOpeQueryEntity> searchQueryTabTipiOpe(GenericSearchRequest<TabTipiOpeFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;

                    case "codTipope":
                        break;

                    case "desTipopeB":
                        break;

                    case "desTipopeL":
                        break;

                    case "flgCassaForte":
                        break;

                    case "flgBarriera":
                        break;

                    case "flgRichiestaCassiere":
                        break;
                    case "flgRichiestaUg":
                        break;
                    case "variazioneFondoCassa":
                        break;

                    case "segnoModificaVenduto":
                        break;

                    case "flgVersamento":
                        break;

                    case "flgServizio":
                        break;
                    case "flgUfficio":
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
                        (baseSort.getOrderBy() != null ? baseSort.getOrderBy() : "codTipope"));

                sorts.add(sort);
            }
        }
        if (sorts.size() == 0) {
            sorts.add(new Sort.Order(Sort.Direction.ASC, "codTipope"));
        }

        Pageable pageable = PageRequest.of(query.getPage(), query.getLimit(), Sort.by(sorts));

        List<Specification<TabTipiOpeQueryEntity>> specifications = new ArrayList<>();
        TabTipiOpeFilter filter = TabTipiOpeFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getCodTipope() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("codTipope"), filter.getCodTipope()));
        }

        if (filter.getDesTipopeB() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desTipopeB")), "%" + filter.getDesTipopeB().toUpperCase() + "%"));
        }
        if (filter.getDesTipopeL() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desTipopeL")), "%" + filter.getDesTipopeL().toUpperCase() + "%"));
        }
        if (filter.getFlgCassaForte() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgCassaForte")), "%" + filter.getFlgCassaForte().toUpperCase() + "%"));
        }
        if (filter.getFlgBarriera() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgBarriera")), "%" + filter.getFlgBarriera().toUpperCase() + "%"));
        }
        if (filter.getFlgRichiestaUg() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgRichiestaUg")), "%" + filter.getFlgRichiestaUg().toUpperCase() + "%"));
        }
        if (filter.getFlgRichiestaCassiere() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgRichiestaCassiere")), "%" + filter.getFlgRichiestaCassiere().toUpperCase() + "%"));
        }
        if (filter.getVariazioneFondoCassa() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("variazioneFondoCassa")), "%" + filter.getVariazioneFondoCassa().toUpperCase() + "%"));
        }
        if (filter.getSegnoModificaVenduto() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("segnoModificaVenduto")), "%" + filter.getSegnoModificaVenduto().toUpperCase() + "%"));
        }
        if (filter.getFlgVersamento() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgVersamento")), "%" + filter.getFlgVersamento().toUpperCase() + "%"));
        }
        if (filter.getFlgServizio() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgServizio")), "%" + filter.getFlgServizio().toUpperCase() + "%"));
        }
        if (filter.getFlgUfficio() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgUfficio")), "%" + filter.getFlgUfficio().toUpperCase() + "%"));
        }
        if (filter.getFlgCancellato() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgCancellato")), "%" + filter.getFlgCancellato().toUpperCase() + "%"));
        }
        if (filter.getVersion() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("version"), filter.getVersion()));
        }
        Specification<TabTipiOpeQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<TabTipiOpeQueryEntity> page = this.tabTipiOpeRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public TabTipiOpeResponse searchTabTipiOpe(GenericSearchRequest<TabTipiOpeFilter> query) {

        TabTipiOpeResponse tabTipiOpeResponse = new TabTipiOpeResponse();
        Page<TabTipiOpeQueryEntity> page = searchQueryTabTipiOpe(query);
        List<TabTipiOpeQueryDTO> list = page.getContent().stream()
                .map(entity -> tabTipiOpeQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        tabTipiOpeResponse.setRecords(list);

        tabTipiOpeResponse.setPagination(Pagination.buildPagination(page));

        return tabTipiOpeResponse;
    }

}

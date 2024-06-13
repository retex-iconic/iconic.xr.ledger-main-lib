package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.TabGuidaIdeTransazioneQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabGuidaIdeTransazioneFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabGuidaIdeTransazione.TabGuidaIdeTransazioneResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabGuidaIdeTransazioneQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.TabGuidaIdeTransazioneQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.TabGuidaIdeTransazioneRepository;
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
public class TabGuidaIdeTransazioneQueryServiceImpl implements  TabGuidaIdeTransazioneQueryService {
    @Autowired
    private TabGuidaIdeTransazioneRepository tabGuidaIdeTransazioneRepository;

    @Autowired
    private TabGuidaIdeTransazioneQueryMapper tabGuidaIdeTransazioneQueryMapper;

    @Override
    public Page<TabGuidaIdeTransazioneQueryEntity> searchQueryTabGuidaIdeTransazione(GenericSearchRequest<TabGuidaIdeTransazioneFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;

                    case "idFormePagamento":
                        baseSort.setOrderBy("formePagamentoId");
                        break;

                    case "lista_01":
                        break;

                    case "padDir_01":
                        break;

                    case "padChr_01":
                        break;

                    case "posField_01":
                        break;

                    case "lenField_01":
                        break;
                    case "flgEan_01":
                        break;
                    case "tipoField_01":
                        break;

                    case "ctrlField_01":
                        break;

                    case "suggField_01":
                        break;

                    case "lista_02":
                        break;

                    case "padDir_02":
                        break;

                    case "padChr_02":
                        break;

                    case "posField_02":
                        break;

                    case "lenField_02":
                        break;
                    case "flgEan_02":
                        break;
                    case "tipoField_02":
                        break;

                    case "ctrlField_02":
                        break;

                    case "suggField_02":
                        break;

                    case "lista_03":
                        break;

                    case "padDir_03":
                        break;

                    case "padChr_03":
                        break;

                    case "posField_03":
                        break;

                    case "lenField_03":
                        break;
                    case "flgEan_03":
                        break;
                    case "tipoField_03":
                        break;

                    case "ctrlField_03":
                        break;

                    case "suggField_03":
                        break;

                    case "lista_04":
                        break;

                    case "padDir_04":
                        break;

                    case "padChr_04":
                        break;

                    case "posField_04":
                        break;

                    case "lenField_04":
                        break;
                    case "flgEan_04":
                        break;
                    case "tipoField_04":
                        break;

                    case "ctrlField_04":
                        break;

                    case "suggField_04":
                        break;

                    case "flgEanAltro":
                        break;
                    case "descAltro":
                        break;
                    case "lenEan":
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

        List<Specification<TabGuidaIdeTransazioneQueryEntity>> specifications = new ArrayList<>();
        TabGuidaIdeTransazioneFilter filter = TabGuidaIdeTransazioneFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getIdFormePagamento() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("formePagamento").get("id"), filter.getIdFormePagamento()));
        }

        if (filter.getLista_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("lista_01")), "%" + filter.getLista_01().toUpperCase() + "%"));
        }
        if (filter.getPadDir_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padDir_01")), "%" + filter.getPadDir_01().toUpperCase() + "%"));
        }
        if (filter.getPadChr_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padChr_01")), "%" + filter.getPadChr_01().toUpperCase() + "%"));
        }

        if (filter.getPosField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("posField_01"),  filter.getPosField_01()));
        }
        if (filter.getLenField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("lenField_01"),  filter.getLenField_01()));
        }
        if (filter.getFlgEan_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgEan_01")), "%" + filter.getFlgEan_01().toUpperCase() + "%"));
        }
        if (filter.getTipoField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("tipoField_01")), "%" + filter.getTipoField_01().toUpperCase() + "%"));
        }
        if (filter.getCtrlField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("ctrlField_01")), "%" + filter.getCtrlField_01().toUpperCase() + "%"));
        }
        if (filter.getSuggField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("suggField_01")), "%" + filter.getSuggField_01().toUpperCase() + "%"));
        }
        if (filter.getLista_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("lista_02")), "%" + filter.getLista_02().toUpperCase() + "%"));
        }
        if (filter.getPadDir_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padDir_02")), "%" + filter.getPadDir_02().toUpperCase() + "%"));
        }
        if (filter.getPadChr_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padChr_02")), "%" + filter.getPadChr_02().toUpperCase() + "%"));
        }

        if (filter.getPosField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("posField_02"),  filter.getPosField_02()));
        }
        if (filter.getLenField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("lenField_02"),  filter.getLenField_02()));
        }
        if (filter.getFlgEan_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgEan_02")), "%" + filter.getFlgEan_02().toUpperCase() + "%"));
        }
        if (filter.getTipoField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("tipoField_02")), "%" + filter.getTipoField_02().toUpperCase() + "%"));
        }
        if (filter.getCtrlField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("ctrlField_02")), "%" + filter.getCtrlField_02().toUpperCase() + "%"));
        }
        if (filter.getSuggField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("suggField_02")), "%" + filter.getSuggField_02().toUpperCase() + "%"));
        }
        if (filter.getLista_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("lista_03")), "%" + filter.getLista_03().toUpperCase() + "%"));
        }
        if (filter.getPadDir_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padDir_03")), "%" + filter.getPadDir_03().toUpperCase() + "%"));
        }
        if (filter.getPadChr_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padChr_03")), "%" + filter.getPadChr_03().toUpperCase() + "%"));
        }

        if (filter.getPosField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("posField_03"),  filter.getPosField_03()));
        }
        if (filter.getLenField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("lenField_03"),  filter.getLenField_03()));
        }
        if (filter.getFlgEan_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgEan_03")), "%" + filter.getFlgEan_03().toUpperCase() + "%"));
        }
        if (filter.getTipoField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("tipoField_03")), "%" + filter.getTipoField_03().toUpperCase() + "%"));
        }
        if (filter.getCtrlField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("ctrlField_03")), "%" + filter.getCtrlField_03().toUpperCase() + "%"));
        }
        if (filter.getSuggField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("suggField_03")), "%" + filter.getSuggField_03().toUpperCase() + "%"));
        }
        if (filter.getLista_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("lista_04")), "%" + filter.getLista_04().toUpperCase() + "%"));
        }
        if (filter.getPadDir_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padDir_04")), "%" + filter.getPadDir_04().toUpperCase() + "%"));
        }
        if (filter.getPadChr_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padChr_04")), "%" + filter.getPadChr_04().toUpperCase() + "%"));
        }

        if (filter.getPosField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("posField_04"),  filter.getPosField_04()));
        }
        if (filter.getLenField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("lenField_04"),  filter.getLenField_04()));
        }
        if (filter.getFlgEan_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgEan_04")), "%" + filter.getFlgEan_04().toUpperCase() + "%"));
        }
        if (filter.getTipoField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("tipoField_04")), "%" + filter.getTipoField_04().toUpperCase() + "%"));
        }
        if (filter.getCtrlField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("ctrlField_04")), "%" + filter.getCtrlField_04().toUpperCase() + "%"));
        }
        if (filter.getSuggField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("suggField_04")), "%" + filter.getSuggField_04().toUpperCase() + "%"));
        }

        if (filter.getFlgEanAltro() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgEanAltro")), "%" + filter.getFlgEanAltro().toUpperCase() + "%"));
        }
        if (filter.getDescAltro() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("descAltro")), "%" + filter.getDescAltro().toUpperCase() + "%"));
        }
        if (filter.getLenEan() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("lenEan")), "%" + filter.getLenEan().toUpperCase() + "%"));
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
        Specification<TabGuidaIdeTransazioneQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<TabGuidaIdeTransazioneQueryEntity> page = this.tabGuidaIdeTransazioneRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public TabGuidaIdeTransazioneResponse searchTabGuidaIdeTransazione(GenericSearchRequest<TabGuidaIdeTransazioneFilter> query) {

        TabGuidaIdeTransazioneResponse tabGuidaIdeTransazioneResponse = new TabGuidaIdeTransazioneResponse();
        Page<TabGuidaIdeTransazioneQueryEntity> page = searchQueryTabGuidaIdeTransazione(query);
        List<TabGuidaIdeTransazioneQueryDTO> list = page.getContent().stream()
                .map(entity -> tabGuidaIdeTransazioneQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        tabGuidaIdeTransazioneResponse.setRecords(list);

        tabGuidaIdeTransazioneResponse.setPagination(Pagination.buildPagination(page));

        return tabGuidaIdeTransazioneResponse;
    }

}


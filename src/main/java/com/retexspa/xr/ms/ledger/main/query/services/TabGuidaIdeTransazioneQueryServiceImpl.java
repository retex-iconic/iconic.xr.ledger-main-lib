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
                        baseSort.setOrderBy("lista01");
                        break;

                    case "pad_dir_01":
                        baseSort.setOrderBy("padDir01");
                        break;

                    case "pad_chr_01":
                        baseSort.setOrderBy("padChr01");
                        break;

                    case "pos_field_01":
                        baseSort.setOrderBy("posField01");
                        break;

                    case "len_field_01":
                        baseSort.setOrderBy("lenField01");
                        break;
                    case "flg_ean_01":
                        baseSort.setOrderBy("flgEan01");
                        break;
                    case "tipo_field_01":
                        baseSort.setOrderBy("tipoField01");
                        break;

                    case "ctrl_field_01":
                        baseSort.setOrderBy("ctrlField01");
                        break;

                    case "sugg_field_01":
                        baseSort.setOrderBy("suggField01");
                        break;
                    case "lista_02":
                        baseSort.setOrderBy("lista02");
                        break;

                    case "pad_dir_02":
                        baseSort.setOrderBy("padDir02");
                        break;

                    case "pad_chr_02":
                        baseSort.setOrderBy("padChr02");
                        break;

                    case "pos_field_02":
                        baseSort.setOrderBy("posField02");
                        break;

                    case "len_field_02":
                        baseSort.setOrderBy("lenField02");
                        break;
                    case "flg_ean_02":
                        baseSort.setOrderBy("flgEan02");
                        break;
                    case "tipo_field_02":
                        baseSort.setOrderBy("tipoField02");
                        break;

                    case "ctrl_field_02":
                        baseSort.setOrderBy("ctrlField02");
                        break;

                    case "sugg_field_02":
                        baseSort.setOrderBy("suggField02");
                        break;
                    case "lista_03":
                        baseSort.setOrderBy("lista03");
                        break;

                    case "pad_dir_03":
                        baseSort.setOrderBy("padDir03");
                        break;

                    case "pad_chr_03":
                        baseSort.setOrderBy("padChr03");
                        break;

                    case "pos_field_03":
                        baseSort.setOrderBy("posField03");
                        break;

                    case "len_field_03":
                        baseSort.setOrderBy("lenField03");
                        break;
                    case "flg_ean_03":
                        baseSort.setOrderBy("flgEan03");
                        break;
                    case "tipo_field_03":
                        baseSort.setOrderBy("tipoField03");
                        break;

                    case "ctrl_field_03":
                        baseSort.setOrderBy("ctrlField03");
                        break;

                    case "sugg_field_03":
                        baseSort.setOrderBy("suggField03");
                        break;

                    case "lista_04":
                        baseSort.setOrderBy("lista04");
                        break;

                    case "pad_dir_04":
                        baseSort.setOrderBy("padDir04");
                        break;

                    case "pad_chr_04":
                        baseSort.setOrderBy("padChr04");
                        break;

                    case "pos_field_04":
                        baseSort.setOrderBy("posField04");
                        break;

                    case "len_field_04":
                        baseSort.setOrderBy("lenField04");
                        break;
                    case "flg_ean_04":
                        baseSort.setOrderBy("flgEan04");
                        break;
                    case "tipo_field_04":
                        baseSort.setOrderBy("tipoField04");
                        break;

                    case "ctrl_field_04":
                        baseSort.setOrderBy("ctrlField04");
                        break;

                    case "sugg_field_04":
                        baseSort.setOrderBy("suggField04");
                        break;

                    case "flg_ean_altro":
                        baseSort.setOrderBy("flgEanAltro");
                        break;
                    case "desc_altro":
                        baseSort.setOrderBy("descAltro");
                        break;
                    case "len_ean":
                        baseSort.setOrderBy("lenEan");
                        break;
                    case "flg_cancellato":
                        baseSort.setOrderBy("flgCancellato");
                        break;
                    case "data_cancellazione" :
                        baseSort.setOrderBy("dataCancellazione");
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
                            c.upper(r.get("lista01")), "%" + filter.getLista_01().toUpperCase() + "%"));
        }
        if (filter.getPadDir_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padDir01")), "%" + filter.getPadDir_01().toUpperCase() + "%"));
        }
        if (filter.getPadChr_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padChr01")), "%" + filter.getPadChr_01().toUpperCase() + "%"));
        }

        if (filter.getPosField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("posField01"),  filter.getPosField_01()));
        }
        if (filter.getLenField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("lenField01"),  filter.getLenField_01()));
        }
        if (filter.getFlgEan_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgEan01")), "%" + filter.getFlgEan_01().toUpperCase() + "%"));
        }
        if (filter.getTipoField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("tipoField01")), "%" + filter.getTipoField_01().toUpperCase() + "%"));
        }
        if (filter.getCtrlField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("ctrlField01")), "%" + filter.getCtrlField_01().toUpperCase() + "%"));
        }
        if (filter.getSuggField_01() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("suggField01")), "%" + filter.getSuggField_01().toUpperCase() + "%"));
        }
        if (filter.getLista_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("lista02")), "%" + filter.getLista_02().toUpperCase() + "%"));
        }
        if (filter.getPadDir_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padDir02")), "%" + filter.getPadDir_02().toUpperCase() + "%"));
        }
        if (filter.getPadChr_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padChr02")), "%" + filter.getPadChr_02().toUpperCase() + "%"));
        }

        if (filter.getPosField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("posField02"),  filter.getPosField_02()));
        }
        if (filter.getLenField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("lenField02"),  filter.getLenField_02()));
        }
        if (filter.getFlgEan_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgEan02")), "%" + filter.getFlgEan_02().toUpperCase() + "%"));
        }
        if (filter.getTipoField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("tipoField02")), "%" + filter.getTipoField_02().toUpperCase() + "%"));
        }
        if (filter.getCtrlField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("ctrlField02")), "%" + filter.getCtrlField_02().toUpperCase() + "%"));
        }
        if (filter.getSuggField_02() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("suggField02")), "%" + filter.getSuggField_02().toUpperCase() + "%"));
        }
        if (filter.getLista_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("lista03")), "%" + filter.getLista_03().toUpperCase() + "%"));
        }
        if (filter.getPadDir_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padDir03")), "%" + filter.getPadDir_03().toUpperCase() + "%"));
        }
        if (filter.getPadChr_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padChr03")), "%" + filter.getPadChr_03().toUpperCase() + "%"));
        }

        if (filter.getPosField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("posField03"),  filter.getPosField_03()));
        }
        if (filter.getLenField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("lenField03"),  filter.getLenField_03()));
        }
        if (filter.getFlgEan_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgEan03")), "%" + filter.getFlgEan_03().toUpperCase() + "%"));
        }
        if (filter.getTipoField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("tipoField03")), "%" + filter.getTipoField_03().toUpperCase() + "%"));
        }
        if (filter.getCtrlField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("ctrlField03")), "%" + filter.getCtrlField_03().toUpperCase() + "%"));
        }
        if (filter.getSuggField_03() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("suggField03")), "%" + filter.getSuggField_03().toUpperCase() + "%"));
        }
        if (filter.getLista_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("lista04")), "%" + filter.getLista_04().toUpperCase() + "%"));
        }
        if (filter.getPadDir_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padDir04")), "%" + filter.getPadDir_04().toUpperCase() + "%"));
        }
        if (filter.getPadChr_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("padChr04")), "%" + filter.getPadChr_04().toUpperCase() + "%"));
        }

        if (filter.getPosField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("posField04"),  filter.getPosField_04()));
        }
        if (filter.getLenField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("lenField04"),  filter.getLenField_04()));
        }
        if (filter.getFlgEan_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgEan04")), "%" + filter.getFlgEan_04().toUpperCase() + "%"));
        }
        if (filter.getTipoField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("tipoField04")), "%" + filter.getTipoField_04().toUpperCase() + "%"));
        }
        if (filter.getCtrlField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("ctrlField04")), "%" + filter.getCtrlField_04().toUpperCase() + "%"));
        }
        if (filter.getSuggField_04() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("suggField04")), "%" + filter.getSuggField_04().toUpperCase() + "%"));
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


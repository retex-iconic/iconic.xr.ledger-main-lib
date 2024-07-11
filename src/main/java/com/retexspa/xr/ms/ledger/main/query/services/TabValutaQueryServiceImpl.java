package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.TabValutaQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabValutaFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabValuta.TabValutaResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabValutaQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.TabValutaQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.TabValutaRepository;
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
public class TabValutaQueryServiceImpl implements TabValutaQueryService {

    @Autowired
    private TabValutaRepository tabValutaRepository;

    @Autowired
    private TabValutaQueryMapper tabValutaQueryMapper;

    @Override
    public Page<TabValutaQueryEntity> searchQueryTabValuta(GenericSearchRequest<TabValutaFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;

                    case "codValuta":
                        baseSort.setOrderBy("codValuta");
                        break;

                    case "nome":
                        baseSort.setOrderBy("nome");
                        break;

                    case "descrizione":
                        baseSort.setOrderBy("descrizione");
                        break;

                    case "flgValutaPrevalente":
                        baseSort.setOrderBy("flgValutaPrevalente");
                        break;

                    case "flgCambioFisso":
                        baseSort.setOrderBy("flgCambioFisso");
                        break;

                    case "flgAbilitazioneOrdini":
                        baseSort.setOrderBy("flgAbilitazioneOrdini");
                        break;

                    case "importoCambioValPrev":
                        baseSort.setOrderBy("importoCambioValPrev");
                        break;

                    case "numeroDecimali":
                        baseSort.setOrderBy("numeroDecimali");
                        break;

                    case "formato":
                        baseSort.setOrderBy("formato");
                        break;

                    case "version":
                        break;
                    default:
                        baseSort.setOrderBy("id");
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

        List<Specification<TabValutaQueryEntity>> specifications = new ArrayList<>();
        TabValutaFilter filter = TabValutaFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getCodValuta() != null) {
            specifications.add((r, q, c) -> c.like(c.upper(r.get("codValuta")), "%" + filter.getCodValuta() + "%"  ));
        }

        if (filter.getNome() != null) {
            specifications.add((r, q, c) -> c.like(c.upper(r.get("nome")), "%" + filter.getNome() + "%"  ));
        }

        if (filter.getDescrizione() != null) {
            specifications.add((r, q, c) -> c.like(c.upper(r.get("descrizione")), "%" + filter.getDescrizione() + "%"  ));
        }
        if (filter.getFormato() != null) {
            specifications.add((r, q, c) -> c.like(c.upper(r.get("formato")), "%" + filter.getFormato() + "%"  ));
        }

        if (filter.getFlgValutaPrevalente() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgValutaPrevalente"), filter.getFlgValutaPrevalente()));
        }

        if (filter.getFlgCambioFisso() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgCambioFisso"), filter.getFlgCambioFisso()));
        }
        if (filter.getFlgAbilitazioneOrdini() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("flgAbilitazioneOrdini"), filter.getFlgAbilitazioneOrdini()));
        }
        if (filter.getNumeroDecimali() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("numeroDecimali"), filter.getNumeroDecimali()));
        }

        if (filter.getVersion() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("version"), filter.getVersion()));
        }

        Specification<TabValutaQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<TabValutaQueryEntity> page = tabValutaRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public TabValutaResponse searchTabValuta(GenericSearchRequest<TabValutaFilter> query) {
        TabValutaResponse tabValutaResponse = new TabValutaResponse();
        Page<TabValutaQueryEntity> page = searchQueryTabValuta(query);
        List<TabValutaQueryDTO> list = page.getContent().stream()
                .map(entity -> tabValutaQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        tabValutaResponse.setRecords(list);
        tabValutaResponse.setPagination(Pagination.buildPagination(page));
        return tabValutaResponse;
    }

}

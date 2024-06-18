package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.TabCircuitiCarteQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabCircuitiCarteFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabCircuitiCarte.TabCircuitiCarteResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabCircuitiCarteQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.TabCircuitiCarteQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.TabCircuitiCarteRepository;
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
public class TabCircuitiCarteQueryServiceImpl implements TabCircuitiCarteQueryService {

    @Autowired
    private TabCircuitiCarteRepository tabCircuitiCarteRepository;

    @Autowired
    private TabCircuitiCarteQueryMapper tabCircuitiCarteQueryMapper;

    @Override
    public Page<TabCircuitiCarteQueryEntity> searchQueryTabCircuitiCarte(GenericSearchRequest<TabCircuitiCarteFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;

                    case "idFormePagamento":
                        baseSort.setOrderBy("formePagamentoId");
                        break;

                    case "ordineStampa":
                        baseSort.setOrderBy("ordineStampa");
                        break;

                    case "tipoCarta":
                        baseSort.setOrderBy("tipoCarta");
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

        List<Specification<TabCircuitiCarteQueryEntity>> specifications = new ArrayList<>();
        TabCircuitiCarteFilter filter = TabCircuitiCarteFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getIdFormePagamento() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("tabFormePagamento").get("id"), filter.getIdFormePagamento()));
        }

        if (filter.getOrdineStampa() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("ordineStampa"), filter.getOrdineStampa()));
        }

        if (filter.getTipoCarta() != null) {
            specifications.add((r, q, c) -> c.like(c.upper(r.get("tipoCarta")), "%" + filter.getTipoCarta() + "%"  ));
        }

        if (filter.getVersion() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("version"), filter.getVersion()));
        }

        Specification<TabCircuitiCarteQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<TabCircuitiCarteQueryEntity> page = tabCircuitiCarteRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public TabCircuitiCarteResponse searchTabCircuitiCarte(GenericSearchRequest<TabCircuitiCarteFilter> query) {
        TabCircuitiCarteResponse tabCircuitiCarteResponse = new TabCircuitiCarteResponse();
        Page<TabCircuitiCarteQueryEntity> page = searchQueryTabCircuitiCarte(query);
        List<TabCircuitiCarteQueryDTO> list = page.getContent().stream()
                .map(entity -> tabCircuitiCarteQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        tabCircuitiCarteResponse.setRecords(list);
        tabCircuitiCarteResponse.setPagination(Pagination.buildPagination(page));
        return tabCircuitiCarteResponse;
    }

}

package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.TabFormePagamentoQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabFormePagamentoFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabFormePagamento.TabFormePagamentoResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabFormePagamentoQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.TabFormePagamentoQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.TabFormePagamentoRepository;
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
public class TabFormePagamentoQueryServiceImpl implements TabFormePagamentoQueryService {

    @Autowired
    private TabFormePagamentoRepository tabFormePagamentoRepository;

    @Autowired
    private TabFormePagamentoQueryMapper tabFormePagamentoQueryMapper;

    @Override
    public Page<TabFormePagamentoQueryEntity> searchQueryTabFormePagamento(GenericSearchRequest<TabFormePagamentoFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                        switch (baseSort.getOrderBy()) {
                            case "id":
                                break;

                            case "codForPag":
                                break;

                            case "desForpagb":
                                break;

                            case "desForpagl":
                                break;

                            case "flgAttivo":
                                break;

                            case "flgCassaforte":
                                break;

                            case "agg01Pos":
                                break;
                            case "agg01Lun":
                                break;
                            case "agg01Des":
                                break;

                            case "agg02Pos":
                                break;

                            case "agg02Lun":
                                break;

                            case "agg02Des":
                                break;
                            case "agg03Pos":
                                break;
                            case "agg03Lun":
                                break;
                            case "agg03Des":
                                break;
                            case "agg04Pos" :
                                break;
                            case "agg04Lun" :
                                break;
                            case "agg04Des" :
                                break;
                            case "livMinTot" :
                                break;
                            case "flgCancellato" :
                                break;
                            case "dataCancellazione" :
                                break;
                            case "idTipoPagamento" :
                                baseSort.setOrderBy("tipoPagamentoId");
                                break;
                            case "version":
                                break;
                            default:
                                throw new IllegalArgumentException("Order by is not correct");
                        }
                Sort.Order sort = new Sort.Order(
                        (baseSort.getOrderType() != null ?
                                (baseSort.getOrderType().equalsIgnoreCase("ASC") ? Sort.Direction.ASC : Sort.Direction.DESC) :
                                Sort.Direction.ASC),
                        (baseSort.getOrderBy() != null ? baseSort.getOrderBy() : "codForPag")
                );

                sorts.add(sort);
            }
        }
        if (sorts.size() == 0) {
            sorts.add(new Sort.Order(Sort.Direction.ASC, "codForPag"));
        }

        Pageable pageable = PageRequest.of(query.getPage(), query.getLimit(), Sort.by(sorts));

        List<Specification<TabFormePagamentoQueryEntity>> specifications = new ArrayList<>();

        TabFormePagamentoFilter filter = TabFormePagamentoFilter.createFilterFromMap(query.getFilter());

        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }


        if (filter.getDesForpagb() != null) {
            specifications.add((r, q, c) -> c.like(c.upper(r.get("desForpagb")), filter.getDesForpagb()));
        }

        if (filter.getDesForpagl() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desForpagl")), "%" + filter.getDesForpagl().toUpperCase() + "%"));
        }

        if (filter.getFlgAttivo() != null) {
            specifications.add(
                    (r, q, c) ->
                            c.equal(r.get("flgAttivo"),filter.getFlgAttivo()));
        }
        if (filter.getFlgCassaforte() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("flgCassaforte"), filter.getFlgCassaforte()));
        }
        if (filter.getAgg01Pos() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("agg01Pos"), filter.getAgg01Pos()));
        }
        if (filter.getAgg02Pos() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("agg02Pos"), filter.getAgg02Pos()));
        }
        if (filter.getAgg03Pos() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("agg03Pos"), filter.getAgg03Pos()));
        }
        if (filter.getAgg04Pos() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("agg04Pos"), filter.getAgg04Pos()));
        }

        if (filter.getAgg01Lun() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("agg01Lun"), filter.getAgg01Lun()));
        }
        if (filter.getAgg02Lun() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("agg02Lun"), filter.getAgg02Lun()));
        }
        if (filter.getAgg03Lun() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("agg03Lun"), filter.getAgg03Lun()));
        }
        if (filter.getAgg04Lun() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(
                            r.get("agg01Lun"), filter.getAgg04Lun()));
        }

        if (filter.getAgg01Des() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("agg01Des")), "%" + filter.getAgg01Des().toUpperCase() + "%"));
        }
        if (filter.getAgg02Des() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("agg02Des")), "%" + filter.getAgg02Des().toUpperCase() + "%"));
        }
        if (filter.getAgg03Des() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("agg03Des")), "%" + filter.getAgg03Des().toUpperCase() + "%"));
        }
        if (filter.getAgg04Des() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("agg04Des")), "%" + filter.getAgg04Des().toUpperCase() + "%"));
        }
        if (filter.getLivMinTot() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("livMinTot")), "%" + filter.getLivMinTot().toUpperCase() + "%"));
        }
        if (filter.getVersion() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("version"), filter.getVersion()));
        }
        Specification<TabFormePagamentoQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<TabFormePagamentoQueryEntity> page = this.tabFormePagamentoRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public TabFormePagamentoResponse searchTabFormePagamento(GenericSearchRequest<TabFormePagamentoFilter> query) {

        TabFormePagamentoResponse TabFormePagamentoResponse = new TabFormePagamentoResponse();
        Page<TabFormePagamentoQueryEntity> page = searchQueryTabFormePagamento(query);
        List<TabFormePagamentoQueryDTO> list = page.getContent().stream()
                // .map(entity -> modelMapper.map(entity, TabFormePagamentoQueryDTO.class))
                .map(entity -> tabFormePagamentoQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        TabFormePagamentoResponse.setRecords(list);

        TabFormePagamentoResponse.setPagination(Pagination.buildPagination(page));

        return TabFormePagamentoResponse;
    }

}

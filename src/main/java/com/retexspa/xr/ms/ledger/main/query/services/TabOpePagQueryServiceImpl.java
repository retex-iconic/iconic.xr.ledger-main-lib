package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.TabOpePagQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabOpePagFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabOpePag.TabOpePagResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabOpePagQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.TabOpePagQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.TabOpePagRepository;
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
public class TabOpePagQueryServiceImpl implements  TabOpePagQueryService {
    @Autowired
    private TabOpePagRepository tabOpePagRepository;

    @Autowired
    private TabOpePagQueryMapper tabOpePagQueryMapper;

    @Override
    public Page<TabOpePagQueryEntity> searchQueryTabOpePag(GenericSearchRequest<TabOpePagFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;

                    case "idFormePagamento":
                        baseSort.setOrderBy("formePagamentoId");
                        break;

                    case "idTipiOpe":
                        baseSort.setOrderBy("tipiOpeId");
                        break;

                    case "desOpepagB":
                        break;

                    case "desOpepagL":
                        break;

                    case "flgDettDistFin":
                        break;

                    case "numRappFin":
                        break;
                    case "flgMovChiusura":
                        break;
                    case "flgMovUfficio":
                        break;

                    case "flgRetChiusura":
                        break;

                    case "flgRetFpag":
                        break;

                    case "flgTnvMovRfsComm":
                        break;
                    case "flgTnvMovIva":
                        break;
                    case "flgDettDistFinMod":
                        break;
                    case "flgMovInserimento":
                        break;
                    case "flgCertifIncassi":
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

        List<Specification<TabOpePagQueryEntity>> specifications = new ArrayList<>();
        TabOpePagFilter filter = TabOpePagFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getIdFormePagamento() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("formePagamento").get("id"), filter.getIdFormePagamento()));
        }

        if (filter.getIdTipiOpe() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("tipiOpe").get("id"),  filter.getIdTipiOpe()));
        }
        if (filter.getDesOpepagB() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desOpepagB")), "%" + filter.getDesOpepagB().toUpperCase() + "%"));
        }
        if (filter.getDesOpepagL() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desOpepagL")), "%" + filter.getDesOpepagL().toUpperCase() + "%"));
        }
        if (filter.getFlgDettDistFin() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgDettDistFin")), "%" + filter.getFlgDettDistFin().toUpperCase() + "%"));
        }

        if (filter.getNumRappFin() != null) {
            specifications.add(
                    (r, q, c) -> c.equal(r.get("numRappFin"),  filter.getNumRappFin()));
        }
        if (filter.getFlgMovChiusura() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgMovChiusura")), "%" + filter.getFlgMovChiusura().toUpperCase() + "%"));
        }
        if (filter.getFlgMovUfficio() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgMovUfficio")), "%" + filter.getFlgMovUfficio().toUpperCase() + "%"));
        }
        if (filter.getFlgRetChiusura() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgRetChiusura")), "%" + filter.getFlgRetChiusura().toUpperCase() + "%"));
        }
        if (filter.getFlgRetFpag() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgRetFpag")), "%" + filter.getFlgRetFpag().toUpperCase() + "%"));
        }
        if (filter.getFlgTnvMovRfsComm() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgTnvMovRfsComm")), "%" + filter.getFlgTnvMovRfsComm().toUpperCase() + "%"));
        }
        if (filter.getFlgTnvMovIva() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgTnvMovIva")), "%" + filter.getFlgTnvMovIva().toUpperCase() + "%"));
        }
        if (filter.getFlgDettDistFinMod() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgDettDistFinMod")), "%" + filter.getFlgDettDistFinMod().toUpperCase() + "%"));
        }
        if (filter.getFlgMovInserimento() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgMovInserimento")), "%" + filter.getFlgMovInserimento().toUpperCase() + "%"));
        }
        if (filter.getFlgCertifIncassi() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgCertifIncassi")), "%" + filter.getFlgCertifIncassi().toUpperCase() + "%"));
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
        Specification<TabOpePagQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<TabOpePagQueryEntity> page = this.tabOpePagRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public TabOpePagResponse searchTabOpePag(GenericSearchRequest<TabOpePagFilter> query) {

        TabOpePagResponse tabOpePagResponse = new TabOpePagResponse();
        Page<TabOpePagQueryEntity> page = searchQueryTabOpePag(query);
        List<TabOpePagQueryDTO> list = page.getContent().stream()
                .map(entity -> tabOpePagQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        tabOpePagResponse.setRecords(list);

        tabOpePagResponse.setPagination(Pagination.buildPagination(page));

        return tabOpePagResponse;
    }

}

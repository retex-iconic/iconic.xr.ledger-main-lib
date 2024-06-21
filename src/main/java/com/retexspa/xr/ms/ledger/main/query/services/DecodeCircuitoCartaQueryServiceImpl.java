package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.DecodeCircuitoCartaQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.DecodeCircuitoCartaFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.decodeCircuitoCarta.DecodeCircuitoCartaResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.DecodeCircuitoCartaQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.DecodeCircuitoCartaQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.DecodeCircuitoCartaRepository;
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
public class DecodeCircuitoCartaQueryServiceImpl implements DecodeCircuitoCartaQueryService{
    @Autowired
    private DecodeCircuitoCartaRepository decodeCircuitoCartaRepository;

    @Autowired
    private DecodeCircuitoCartaQueryMapper decodeCircuitoCartaQueryMapper;
    @Override
    public Page<DecodeCircuitoCartaQueryEntity> searchQueryDecodeCircuitoCarta(GenericSearchRequest<DecodeCircuitoCartaFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;

                    case "prefisso":
                        baseSort.setOrderBy("prefisso");
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

        List<Specification<DecodeCircuitoCartaQueryEntity>> specifications = new ArrayList<>();
        DecodeCircuitoCartaFilter filter = DecodeCircuitoCartaFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getIdTipoCarta() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("tipoCarta").get("id"), filter.getIdTipoCarta()));
        }

        if (filter.getPrefisso() != null) {
            specifications.add((r, q, c) -> c.like(c.upper(r.get("prefisso")), "%" + filter.getPrefisso() + "%"  ));
        }

        if (filter.getVersion() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("version"), filter.getVersion()));
        }

        Specification<DecodeCircuitoCartaQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<DecodeCircuitoCartaQueryEntity> page = decodeCircuitoCartaRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public DecodeCircuitoCartaResponse searchDecodeCircuitoCarta(GenericSearchRequest<DecodeCircuitoCartaFilter> query) {
        DecodeCircuitoCartaResponse decodeCircuitoCartaResponse = new DecodeCircuitoCartaResponse();
        Page<DecodeCircuitoCartaQueryEntity> page = searchQueryDecodeCircuitoCarta(query);
        List<DecodeCircuitoCartaQueryDTO> list = page.getContent().stream()
                .map(entity -> decodeCircuitoCartaQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        decodeCircuitoCartaResponse.setRecords(list);
        decodeCircuitoCartaResponse.setPagination(Pagination.buildPagination(page));
        return decodeCircuitoCartaResponse;
    }
}

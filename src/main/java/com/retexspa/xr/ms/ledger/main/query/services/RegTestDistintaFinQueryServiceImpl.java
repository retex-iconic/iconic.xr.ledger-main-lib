package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.entities.RegTestDistintaFinQueryDTO;
import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegTestDistintaFinFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regTestDistintaFin.RegTestDistintaFinResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegTestDistintaFinQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.mappers.RegTestDistintaFinQueryMapper;
import com.retexspa.xr.ms.ledger.main.query.repositories.RegTestDistintaFinRepository;
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
public class RegTestDistintaFinQueryServiceImpl  implements RegTestDistintaFinQueryService {
    @Autowired
    private RegTestDistintaFinRepository regTestDistintaFinRepository;

    @Autowired
    private RegTestDistintaFinQueryMapper regTestDistintaFinQueryMapper;

    @Override
    public Page<RegTestDistintaFinQueryEntity> searchQueryRegTestDistintaFin(GenericSearchRequest<RegTestDistintaFinFilter> query) {
        List<Sort.Order> sorts = new ArrayList<>();

        if (query.getSort() != null && query.getSort().size() != 0) {
            for (BaseSort baseSort : query.getSort()) {
                switch (baseSort.getOrderBy()) {
                    case "id":
                        break;

                    case "codRiga":
                        break;

                    case "desRigaB":
                        break;

                    case "desRigaL":
                        break;

                    case "flgVisSoloMov":
                        break;

                    case "flgQuadraturaCommerciale":
                        break;

                    case "flgQuadraturaVersato":
                        break;
                    case "flgQuadraturaServizi":
                        break;
                    case "flgImpFatturato":
                        break;

                    case "flgImpNonFatturato":
                        break;

                    case "flgImpRimborsiFsIva":
                        break;

                    case "flgFondoCassa":
                        break;
                    case "flgFondiCassetti":
                        break;
                    case "flgFondiCassieri":
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
                        (baseSort.getOrderBy() != null ? baseSort.getOrderBy() : "codRiga"));

                sorts.add(sort);
            }
        }
        if (sorts.size() == 0) {
            sorts.add(new Sort.Order(Sort.Direction.ASC, "codRiga"));
        }

        Pageable pageable = PageRequest.of(query.getPage(), query.getLimit(), Sort.by(sorts));

        List<Specification<RegTestDistintaFinQueryEntity>> specifications = new ArrayList<>();
        RegTestDistintaFinFilter filter = RegTestDistintaFinFilter.createFilterFromMap(query.getFilter());
        if (filter.getId() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("id"), filter.getId()));
        }

        if (filter.getCodRiga() != null) {
            specifications.add((r, q, c) -> c.equal(r.get("codRiga"), filter.getCodRiga()));
        }

        if (filter.getDesRigaB() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desRigaB")), "%" + filter.getDesRigaB().toUpperCase() + "%"));
        }
        if (filter.getDesRigaL() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("desRigaL")), "%" + filter.getDesRigaL().toUpperCase() + "%"));
        }
        if (filter.getFlgVisSoloMov() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgVisSoloMov")), "%" + filter.getFlgVisSoloMov().toUpperCase() + "%"));
        }
        if (filter.getFlgQuadraturaCommerciale() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgQuadraturaCommerciale")), "%" + filter.getFlgQuadraturaCommerciale().toUpperCase() + "%"));
        }
        if (filter.getFlgQuadraturaVersato() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgQuadraturaVersato")), "%" + filter.getFlgQuadraturaVersato().toUpperCase() + "%"));
        }
        if (filter.getFlgQuadraturaServizi() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgQuadraturaServizi")), "%" + filter.getFlgQuadraturaServizi().toUpperCase() + "%"));
        }
        if (filter.getFlgImpFatturato() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgImpFatturato")), "%" + filter.getFlgImpFatturato().toUpperCase() + "%"));
        }
        if (filter.getFlgImpNonFatturato() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgImpNonFatturato")), "%" + filter.getFlgImpNonFatturato().toUpperCase() + "%"));
        }
        if (filter.getFlgImpRimborsiFsIva() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgImpRimborsiFsIva")), "%" + filter.getFlgImpRimborsiFsIva().toUpperCase() + "%"));
        }
        if (filter.getFlgFondoCassa() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgFondoCassa")), "%" + filter.getFlgFondoCassa().toUpperCase() + "%"));
        }
        if (filter.getFlgFondiCassetti() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgFondiCassetti")), "%" + filter.getFlgFondiCassetti().toUpperCase() + "%"));
        }
        if (filter.getFlgFondiCassieri() != null) {
            specifications.add(
                    (r, q, c) -> c.like(
                            c.upper(r.get("flgFondiCassieri")), "%" + filter.getFlgFondiCassieri().toUpperCase() + "%"));
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
        Specification<RegTestDistintaFinQueryEntity> specification = specifications.stream().reduce(Specification::and).orElse(null);

        Page<RegTestDistintaFinQueryEntity> page = this.regTestDistintaFinRepository.findAll(specification, pageable);
        return page;
    }

    @Override
    public RegTestDistintaFinResponse searchRegTestDistintaFin(GenericSearchRequest<RegTestDistintaFinFilter> query) {

        RegTestDistintaFinResponse regTestDistintaFinResponse = new RegTestDistintaFinResponse();
        Page<RegTestDistintaFinQueryEntity> page = searchQueryRegTestDistintaFin(query);
        List<RegTestDistintaFinQueryDTO> list = page.getContent().stream()
                .map(entity -> regTestDistintaFinQueryMapper.toDTO(entity))
                .collect(Collectors.toList());
        regTestDistintaFinResponse.setRecords(list);

        regTestDistintaFinResponse.setPagination(Pagination.buildPagination(page));

        return regTestDistintaFinResponse;
    }

}

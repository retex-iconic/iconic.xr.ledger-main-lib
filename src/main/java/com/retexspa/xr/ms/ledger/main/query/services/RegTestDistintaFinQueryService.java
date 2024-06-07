package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegTestDistintaFinFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regTestDistintaFin.RegTestDistintaFinResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegTestDistintaFinQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface RegTestDistintaFinQueryService {
    Page<RegTestDistintaFinQueryEntity> searchQueryRegTestDistintaFin(GenericSearchRequest<RegTestDistintaFinFilter> query);
    RegTestDistintaFinResponse searchRegTestDistintaFin(GenericSearchRequest<RegTestDistintaFinFilter> query);
}

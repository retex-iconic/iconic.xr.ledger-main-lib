package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabCircuitiCarteFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabCircuitiCarte.TabCircuitiCarteResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabCircuitiCarteQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface TabCircuitiCarteQueryService {

    Page<TabCircuitiCarteQueryEntity> searchQueryTabCircuitiCarte(GenericSearchRequest<TabCircuitiCarteFilter> query);
    TabCircuitiCarteResponse searchTabCircuitiCarte(GenericSearchRequest<TabCircuitiCarteFilter> query);
}

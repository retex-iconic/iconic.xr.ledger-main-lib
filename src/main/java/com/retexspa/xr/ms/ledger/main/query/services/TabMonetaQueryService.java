package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabMonetaFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabMoneta.TabMonetaResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabMonetaQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface TabMonetaQueryService {
    Page<TabMonetaQueryEntity> searchQueryTabMoneta(GenericSearchRequest<TabMonetaFilter> query);
    TabMonetaResponse searchTabMoneta(GenericSearchRequest<TabMonetaFilter> query);
}

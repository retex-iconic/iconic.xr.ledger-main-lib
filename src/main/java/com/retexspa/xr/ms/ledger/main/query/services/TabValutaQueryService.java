package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabValutaFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabValuta.TabValutaResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabValutaQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface TabValutaQueryService {
    Page<TabValutaQueryEntity> searchQueryTabValuta(GenericSearchRequest<TabValutaFilter> query);
    TabValutaResponse searchTabValuta(GenericSearchRequest<TabValutaFilter> query);
}

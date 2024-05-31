package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabOpePagFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabOpePag.TabOpePagResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabOpePagQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface TabOpePagQueryService {
    Page<TabOpePagQueryEntity> searchQueryTabOpePag(GenericSearchRequest<TabOpePagFilter> query);
    TabOpePagResponse searchTabOpePag(GenericSearchRequest<TabOpePagFilter> query);
}

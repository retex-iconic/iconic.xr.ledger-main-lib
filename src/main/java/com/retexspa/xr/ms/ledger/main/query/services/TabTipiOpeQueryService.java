package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabTipiOpeFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabTipiOpe.TabTipiOpeResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiOpeQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface TabTipiOpeQueryService {
    Page<TabTipiOpeQueryEntity> searchQueryTabTipiOpe(GenericSearchRequest<TabTipiOpeFilter> query);
    TabTipiOpeResponse searchTabTipiOpe(GenericSearchRequest<TabTipiOpeFilter> query);
}

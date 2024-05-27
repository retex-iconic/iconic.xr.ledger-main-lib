package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabTipiPagamentoFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabTipiPagamentoAggregate.TabTipiPagamentoResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiPagamentoQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


public interface TabTipiPagamentoQueryService {

    Page<TabTipiPagamentoQueryEntity> searchQueryTabTipiPagamento(GenericSearchRequest<TabTipiPagamentoFilter> query);
    TabTipiPagamentoResponse searchTabTipiPagamento(GenericSearchRequest<TabTipiPagamentoFilter> query);

}

package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabFormePagamentoFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabFormePagamento.TabFormePagamentoResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabFormePagamentoQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;


public interface TabFormePagamentoQueryService {

    Page<TabFormePagamentoQueryEntity> searchQueryTabFormePagamento(GenericSearchRequest<TabFormePagamentoFilter> query);
    TabFormePagamentoResponse searchTabFormePagamento(GenericSearchRequest<TabFormePagamentoFilter> query);

}

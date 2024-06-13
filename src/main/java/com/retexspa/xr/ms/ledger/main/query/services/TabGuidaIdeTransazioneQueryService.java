package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.TabGuidaIdeTransazioneFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.tabGuidaIdeTransazione.TabGuidaIdeTransazioneResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.TabGuidaIdeTransazioneQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface TabGuidaIdeTransazioneQueryService {
    Page<TabGuidaIdeTransazioneQueryEntity> searchQueryTabGuidaIdeTransazione(GenericSearchRequest<TabGuidaIdeTransazioneFilter> query);
    TabGuidaIdeTransazioneResponse searchTabGuidaIdeTransazione(GenericSearchRequest<TabGuidaIdeTransazioneFilter> query);
}

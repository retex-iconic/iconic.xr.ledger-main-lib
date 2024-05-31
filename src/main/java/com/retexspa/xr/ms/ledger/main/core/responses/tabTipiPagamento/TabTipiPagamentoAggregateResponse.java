package com.retexspa.xr.ms.ledger.main.core.responses.tabTipiPagamento;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabTipiPagamento.TabTipiPagamentoBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;

import java.util.Map;

public class TabTipiPagamentoAggregateResponse  extends BaseAggregateResponse<TabTipiPagamentoBaseDTO> {

    private Map<String, Object> lastEvent;

    public TabTipiPagamentoAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") TabTipiPagamentoBaseDTO data,
            @JsonProperty("lastEvent")  Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }

    public Map<String, Object> getLastEvent() {
        return lastEvent;
    }

    public void setLastEvent(Map<String, Object> lastEvent) {
        this.lastEvent = lastEvent;
    }
}

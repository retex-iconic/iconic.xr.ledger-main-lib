package com.retexspa.xr.ms.ledger.main.core.responses.tabFormePagamento;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabFormePagamento.TabFormePagamentoBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;

import java.util.Map;

public class TabFormePagamentoAggregateResponse  extends BaseAggregateResponse<TabFormePagamentoBaseDTO> {

    private Map<String, Object> lastEvent;

    public TabFormePagamentoAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") TabFormePagamentoBaseDTO data,
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
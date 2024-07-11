package com.retexspa.xr.ms.ledger.main.core.responses.tabValuta;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabValuta.TabValutaBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;

import java.util.Map;

public class TabValutaAggregateResponse  extends BaseAggregateResponse<TabValutaBaseDTO> {
    private Map<String, Object> lastEvent;

    public TabValutaAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") TabValutaBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}
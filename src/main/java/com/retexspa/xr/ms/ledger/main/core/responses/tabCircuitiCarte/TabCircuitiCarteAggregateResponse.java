package com.retexspa.xr.ms.ledger.main.core.responses.tabCircuitiCarte;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabCircuitiCarte.TabCircuitiCarteBaseDTO;
import com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag.TabOpePagBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;

import java.util.Map;

public class TabCircuitiCarteAggregateResponse extends BaseAggregateResponse<TabCircuitiCarteBaseDTO> {
    private Map<String, Object> lastEvent;

    public TabCircuitiCarteAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") TabCircuitiCarteBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}


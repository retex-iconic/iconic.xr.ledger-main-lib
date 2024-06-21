package com.retexspa.xr.ms.ledger.main.core.responses.decodeCircuitoCarta;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.decodeCircuitoCarta.DecodeCircuitoCartaBaseDTO;
import com.retexspa.xr.ms.main.core.responses.BaseAggregateResponse;

import java.util.Map;

public class DecodeCircuitoCartaAggregateResponse extends BaseAggregateResponse<DecodeCircuitoCartaBaseDTO> {
    private Map<String, Object> lastEvent;

    public DecodeCircuitoCartaAggregateResponse(
            @JsonProperty("id") String id,
            @JsonProperty("version") Long version,
            @JsonProperty("data") DecodeCircuitoCartaBaseDTO data,
            @JsonProperty("lastEvent") Map<String, Object> lastEvent) {
        super(id, version, data);
        this.lastEvent = lastEvent;
    }
}

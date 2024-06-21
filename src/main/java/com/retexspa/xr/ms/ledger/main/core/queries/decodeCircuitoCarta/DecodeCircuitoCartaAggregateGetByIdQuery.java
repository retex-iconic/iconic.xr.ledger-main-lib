package com.retexspa.xr.ms.ledger.main.core.queries.decodeCircuitoCarta;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DecodeCircuitoCartaAggregateGetByIdQuery {
    private String decodeCircuitoCartaId;

    public DecodeCircuitoCartaAggregateGetByIdQuery(@JsonProperty("decodeCircuitoCartaId") String decodeCircuitoCartaId) {
        this.decodeCircuitoCartaId = decodeCircuitoCartaId;
    }
}

package com.retexspa.xr.ms.ledger.main.core.queries.regRigaDistintaFin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegRigaDistintaFinAggregateGetEventsByIdQuery {
    private String regRigaDistintaFinId;

    public RegRigaDistintaFinAggregateGetEventsByIdQuery(@JsonProperty("regRigaDistintaFinId") String regRigaDistintaFinId) {
        this.regRigaDistintaFinId = regRigaDistintaFinId;
    }
}

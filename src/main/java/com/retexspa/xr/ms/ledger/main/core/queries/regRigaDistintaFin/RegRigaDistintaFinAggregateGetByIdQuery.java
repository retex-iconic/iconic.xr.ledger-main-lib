package com.retexspa.xr.ms.ledger.main.core.queries.regRigaDistintaFin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegRigaDistintaFinAggregateGetByIdQuery {
    private String regRigaDistintaFinId;

    public RegRigaDistintaFinAggregateGetByIdQuery(@JsonProperty("regRigaDistintaFinId") String regRigaDistintaFinId) {
        this.regRigaDistintaFinId = regRigaDistintaFinId;
    }
}

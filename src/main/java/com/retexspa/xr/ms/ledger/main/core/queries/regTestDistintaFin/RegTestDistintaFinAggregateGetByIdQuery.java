package com.retexspa.xr.ms.ledger.main.core.queries.regTestDistintaFin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegTestDistintaFinAggregateGetByIdQuery {
    private String regTestDistintaFinId;

    public RegTestDistintaFinAggregateGetByIdQuery(@JsonProperty("regTestDistintaFinId") String regTestDistintaFinId) {
        this.regTestDistintaFinId = regTestDistintaFinId;
    }
}

package com.retexspa.xr.ms.ledger.main.core.queries.regTestDistintaFin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegTestDistintaFinAggregateGetEventsByIdQuery {
    private String regTestDistintaFinId;

    public RegTestDistintaFinAggregateGetEventsByIdQuery(@JsonProperty("regTestDistintaFinId") String regTestDistintaFinId) {
        this.regTestDistintaFinId = regTestDistintaFinId;
    }
}

package com.retexspa.xr.ms.ledger.main.core.queries.regDettChiusureOpe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegDettChiusureOpeAggregateGetByIdQuery {
    private String regDettChiusureOpeId;

    public RegDettChiusureOpeAggregateGetByIdQuery(@JsonProperty("regDettChiusureOpeId") String regDettChiusureOpeId) {
        this.regDettChiusureOpeId = regDettChiusureOpeId;
    }
}

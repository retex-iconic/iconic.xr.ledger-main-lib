package com.retexspa.xr.ms.ledger.main.core.queries.regDettChiusureUff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegDettChiusureUffAggregateGetEventsByIdQuery {
    private String regDettChiusureUffId;

    public RegDettChiusureUffAggregateGetEventsByIdQuery(@JsonProperty("regDettChiusureUffId") String regDettChiusureUffId) {
        this.regDettChiusureUffId = regDettChiusureUffId;
    }
}

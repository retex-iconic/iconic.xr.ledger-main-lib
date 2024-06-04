package com.retexspa.xr.ms.ledger.main.core.queries.regRigheChiusureUff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegRigheChiusureUffAggregateGetEventsByIdQuery {
    private String regRigheChiusureUffId;

    public RegRigheChiusureUffAggregateGetEventsByIdQuery(@JsonProperty("regRigheChiusureUffId") String regRigheChiusureUffId) {
        this.regRigheChiusureUffId = regRigheChiusureUffId;
    }
}

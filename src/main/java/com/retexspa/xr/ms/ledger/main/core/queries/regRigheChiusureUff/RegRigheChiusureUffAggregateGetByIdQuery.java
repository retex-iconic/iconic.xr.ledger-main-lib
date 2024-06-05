package com.retexspa.xr.ms.ledger.main.core.queries.regRigheChiusureUff;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegRigheChiusureUffAggregateGetByIdQuery {
    private String regRigheChiusureUffId;

    public RegRigheChiusureUffAggregateGetByIdQuery(@JsonProperty("regRigheChiusureUffId") String regRigheChiusureUffId) {
        this.regRigheChiusureUffId = regRigheChiusureUffId;
    }
}

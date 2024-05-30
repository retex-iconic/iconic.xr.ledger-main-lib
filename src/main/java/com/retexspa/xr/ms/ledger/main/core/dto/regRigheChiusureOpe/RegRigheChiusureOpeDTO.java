package com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureOpe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class RegRigheChiusureOpeDTO extends RegRigheChiusureOpeBaseDTO {
    private String id;
}

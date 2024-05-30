package com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureOpe;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.ledger.main.core.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class RegRigheChiusureOpeBaseDTO extends BaseDTO {

    @NotNull(message = "codRiga is mandatory")
    private Integer codRiga;

    @NotNull(message = "desRigaB is mandatory")
    private String desRigaB;

    @NotNull(message = "desRigaL is mandatory")
    private String desRigaL;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }

    public static String getName() {
        return "RegRigheChiusureOpe";
    }

    public static String getAggregateName() {
        return "RegRigheChiusureOpeAggregate";
    }
}

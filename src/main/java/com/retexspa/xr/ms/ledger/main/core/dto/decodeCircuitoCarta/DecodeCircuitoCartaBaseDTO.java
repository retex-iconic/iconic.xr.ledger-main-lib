package com.retexspa.xr.ms.ledger.main.core.dto.decodeCircuitoCarta;

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
public class DecodeCircuitoCartaBaseDTO extends BaseDTO {

    @NotNull(message = "idTipoCarta is mandatory")
    private String idTipoCarta;

    private String prefisso;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "DecodeCircuitoCartaAggregate";
    }

    public static String getName(){
        return "DecodeCircuitoCarta";
    }
}

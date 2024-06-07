package com.retexspa.xr.ms.ledger.main.core.dto.regRigaDistintaFin;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.ledger.main.core.dto.BaseDTO;

import com.retexspa.xr.ms.ledger.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class RegRigaDistintaFinBaseDTO extends BaseDTO {
    @NotNull(message = "idRigaDistFin is mandatory")
    @NotEmpty(message = "idRigaDistFin is mandatory")
    @NotBlank(message = "idRigaDistFin is mandatory")
    private String idRigaDistFin;
    @NotNull(message = "idOpePag is mandatory")
    @NotEmpty(message = "idOpePag is mandatory")
    @NotBlank(message = "idOpePag is mandatory")
    private String idOpePag;

    @EnumValidator(enumClazz = Enums.Segno.class, message = "segno not valid")
    @NotNull(message = "segno is mandatory")
    private String segno;
    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "RegRigaDistintaFinAggregate";
    }
    public static String getName(){
        return "RegRigaDistintaFin";
    }
}

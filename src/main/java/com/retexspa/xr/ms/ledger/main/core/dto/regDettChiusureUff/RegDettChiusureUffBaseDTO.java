package com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureUff;

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
public class RegDettChiusureUffBaseDTO extends BaseDTO {
    @NotNull(message = "idRigaChiUff is mandatory")
    @NotEmpty(message = "idRigaChiUff is mandatory")
    @NotBlank(message = "idRigaChiUff is mandatory")
    private String idRigaChiUff;
    private String idOpePagC01;
    @EnumValidator(enumClazz = Enums.Segno.class, message = "segnoC01 not valid")
    private String segnoC01;
    private String idOpePagC02;
    @EnumValidator(enumClazz = Enums.Segno.class, message = "segnoC02 not valid")
    private String segnoC02;
    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "RegDettChiusureUffAggregate";
    }
    public static String getName(){
        return "RegDettChiusureUff";
    }
}

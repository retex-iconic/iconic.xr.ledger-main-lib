package com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureUff;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.ledger.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class RegDettChiusureUffUpdateDTO {
    private String idOpePagC01;
    @EnumValidator(enumClazz = Enums.Segno.class, message = "segnoC01 not valid")
    private String segnoC01;
    private String idOpePagC02;
    @EnumValidator(enumClazz = Enums.Segno.class, message = "segnoC02 not valid")
    private String segnoC02;
}

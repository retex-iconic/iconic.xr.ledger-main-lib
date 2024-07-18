package com.retexspa.xr.ms.ledger.main.core.dto.attributo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class AttributoUpdateDTO {
    
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "chiave not valid")
    private String chiave;
    
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "descrizione not valid")
    private String descrizione;
    
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "aggregato not valid")
    private String aggregato;
}
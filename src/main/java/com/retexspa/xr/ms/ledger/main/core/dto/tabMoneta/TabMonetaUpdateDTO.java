package com.retexspa.xr.ms.ledger.main.core.dto.tabMoneta;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class TabMonetaUpdateDTO {

    private String descrizioneTaglio;

    private BigDecimal valoreUnitario;

    private BigDecimal valoreTubetto;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "FlgOrdini not valid")
    private String flgOrdini;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgCassaforte not valid")
    private String flgCassaforte;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiCm not valid")
    private String flgContasoldiCm;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiHm not valid")
    private String flgContasoldiHm;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiVb not valid")
    private String flgContasoldiVb;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiCb not valid")
    private String flgContasoldiCb;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgInvioBanca not valid")
    private String flgInvioBanca;

}

package com.retexspa.xr.ms.ledger.main.core.dto.tabValuta;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class TabValutaUpdateDTO {

    private String nome;

    private String descrizione;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgValutaPrevalente not valid")
    private String flgValutaPrevalente;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgCambioFisso not valid")
    private String flgCambioFisso;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgAbilitazioneOrdini not valid")
    private String flgAbilitazioneOrdini;

    private BigDecimal importoCambioValPrev;

    private Integer numeroDecimali;

    private String formato;
}

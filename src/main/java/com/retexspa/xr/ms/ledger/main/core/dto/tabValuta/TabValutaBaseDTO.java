package com.retexspa.xr.ms.ledger.main.core.dto.tabValuta;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.ledger.main.core.dto.BaseDTO;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class TabValutaBaseDTO extends BaseDTO {

    @NotNull(message = "codValuta is mandatory")
    @NotEmpty(message = "codValuta is mandatory")
    @NotBlank(message = "codValuta is mandatory")
    private String codValuta;

    @NotNull(message = "nome is mandatory")
    @NotEmpty(message = "nome is mandatory")
    @NotBlank(message = "nome is mandatory")
    private String nome;

    @NotNull(message = "descrizione is mandatory")
    @NotEmpty(message = "descrizione is mandatory")
    @NotBlank(message = "descrizione is mandatory")
    private String descrizione;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgValutaPrevalente not valid")
    private String flgValutaPrevalente;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgCambioFisso not valid")
    private String flgCambioFisso;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgAbilitazioneOrdini not valid")
    private String flgAbilitazioneOrdini;

    @NotNull(message = "importoCambioValPrev is mandatory")
    private BigDecimal importoCambioValPrev;

    @NotNull(message = "numeroDecimali is mandatory")
    private Integer numeroDecimali;

    private String formato;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "TabValutaAggregate";
    }
    public static String getName(){
        return "TabValuta";
    }
}

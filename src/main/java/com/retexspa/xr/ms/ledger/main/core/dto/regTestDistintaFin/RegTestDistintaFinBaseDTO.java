package com.retexspa.xr.ms.ledger.main.core.dto.regTestDistintaFin;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.ledger.main.core.dto.BaseDTO;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.dto.attributo.AttributoValoreDTO;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class RegTestDistintaFinBaseDTO  extends BaseDTO {

    @NotNull(message = "codRiga is mandatory")
    private Integer codRiga;

    @NotNull(message = "desRigaB is mandatory")
    @NotEmpty(message = "desRigaB is mandatory")
    @NotBlank(message = "desRigaB is mandatory")
    private String desRigaB;

    @NotNull(message = "desRigaL is mandatory")
    @NotEmpty(message = "desRigaL is mandatory")
    @NotBlank(message = "desRigaL is mandatory")
    private String desRigaL;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgVisSoloMov not valid")
    @NotNull(message = "flgVisSoloMov is mandatory")
    private String flgVisSoloMov;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgQuadraturaCommerciale not valid")
    @NotNull(message = "flgQuadraturaCommerciale is mandatory")
    private String flgQuadraturaCommerciale;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgQuadraturaVersato not valid")
    @NotNull(message = "flgQuadraturaVersato is mandatory")
    private String flgQuadraturaVersato;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgQuadraturaServizi not valid")
    @NotNull(message = "flgQuadraturaServizi is mandatory")
    private String flgQuadraturaServizi;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgImpFatturato not valid")
    @NotNull(message = "flgImpFatturato is mandatory")
    private String flgImpFatturato;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgImpNonFatturato not valid")
    @NotNull(message = "flgImpNonFatturato is mandatory")
    private String flgImpNonFatturato;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgImpRimborsiFsIva not valid")
    @NotNull(message = "flgImpRimborsiFsIva is mandatory")
    private String flgImpRimborsiFsIva;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgFondoCassa not valid")
    @NotNull(message = "flgFondoCassa is mandatory")
    private String flgFondoCassa;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgFondiCassetti not valid")
    @NotNull(message = "flgFondiCassetti is mandatory")
    private String flgFondiCassetti;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgFondiCassieri not valid")
    @NotNull(message = "flgFondiCassieri is mandatory")
    private String flgFondiCassieri;

    private List<AttributoValoreDTO> attributi;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "RegTestDistintaFinAggregate";
    }
    public static String getName(){
        return "RegTestDistintaFin";
    }
}

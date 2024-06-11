package com.retexspa.xr.ms.ledger.main.core.dto.regTestDistintaFin;

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
public class RegTestDistintaFinUpdateDTO {
    private String desRigaB;
    private String desRigaL;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgVisSoloMov not valid")
    private String flgVisSoloMov;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgQuadraturaCommerciale not valid")
    private String flgQuadraturaCommerciale;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgQuadraturaVersato not valid")
    private String flgQuadraturaVersato;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgQuadraturaServizi not valid")
    private String flgQuadraturaServizi;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgImpFatturato not valid")
    private String flgImpFatturato;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgImpNonFatturato not valid")
    private String flgImpNonFatturato;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgImpRimborsiFsIva not valid")
    private String flgImpRimborsiFsIva;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgFondoCassa not valid")
    private String flgFondoCassa;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgFondiCassetti not valid")
    private String flgFondiCassetti;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgFondiCassieri not valid")
    private String flgFondiCassieri;
}

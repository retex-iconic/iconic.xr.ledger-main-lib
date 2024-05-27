package com.retexspa.xr.ms.ledger.main.core.dto.tabTipiOpe;

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
public class TabTipiOpeUpdateDTO {


    private String desTipopeB;

    private String desTipopeL;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgCassaForte not valid")
    private String flgCassaForte;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgBarriera not valid")
    private String flgBarriera;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgRichiestaUg not valid")
    private String flgRichiestaUg;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgRichiestaCassiere not valid")
    private String flgRichiestaCassiere;

    @EnumValidator(enumClazz = com.retexspa.xr.ms.ledger.main.core.dto.Enums.VariazioneFondoCasssa.class, message = "variazioneFondoCassa not valid")
    private String variazioneFondoCassa;

    @EnumValidator(enumClazz = com.retexspa.xr.ms.ledger.main.core.dto.Enums.SegnoModificaVenduto.class, message = "SegnoModificaVenduto not valid")
    private String segnoModificaVenduto;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgVersamento not valid")
    private String flgVersamento;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgServizio not valid")
    private String flgServizio;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgUfficio not valid")
    private String flgUfficio;
}

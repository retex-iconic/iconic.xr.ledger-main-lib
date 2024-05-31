package com.retexspa.xr.ms.ledger.main.core.dto.tabTipiOpe;

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
public class TabTipiOpeBaseDTO extends BaseDTO {

    @NotNull(message = "codTipope is mandatory")
    private Integer codTipope;

    @NotNull(message = "desTipopeB is mandatory")
    @NotEmpty(message = "desTipopeB is mandatory")
    @NotBlank(message = "desTipopeB is mandatory")
    private String desTipopeB;

    private String desTipopeL;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgCassaForte not valid")
    @NotNull(message = "flgCassaForte is mandatory")
    private String flgCassaForte;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgBarriera not valid")
    @NotNull(message = "flgBarriera is mandatory")
    private String flgBarriera;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgRichiestaUg not valid")
    @NotNull(message = "flgRichiestaUg is mandatory")
    private String flgRichiestaUg;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgRichiestaCassiere not valid")
    @NotNull(message = "flgRichiestaCassiere is mandatory")
    private String flgRichiestaCassiere;

    @EnumValidator(enumClazz = com.retexspa.xr.ms.ledger.main.core.dto.Enums.VariazioneFondoCasssa.class, message = "variazioneFondoCassa not valid")
    @NotNull(message = "variazioneFondoCassa is mandatory")
    private String variazioneFondoCassa;

    @EnumValidator(enumClazz = com.retexspa.xr.ms.ledger.main.core.dto.Enums.SegnoModificaVenduto.class, message = "SegnoModificaVenduto not valid")
    @NotNull(message = "segnoModificaVenduto is mandatory")
    private String segnoModificaVenduto;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgVersamento not valid")
    @NotNull(message = "flgVersamento is mandatory")
    private String flgVersamento;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgServizio not valid")
    @NotNull(message = "flgServizio is mandatory")
    private String flgServizio;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgUfficio not valid")
    @NotNull(message = "flgUfficio is mandatory")
    private String flgUfficio;

    private List<AttributoValoreDTO> attributi;
    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "TabTipiOpeAggregate";
    }

    public static String getName(){
        return "TabTipiOpe";
    }
}

package com.retexspa.xr.ms.ledger.main.core.dto.tabGuidaIdeTransazione;

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
public class TabGuidaIdeTransazioneBaseDTO extends BaseDTO {
    @NotNull(message = "idFormePagamento is mandatory")
    @NotEmpty(message = "idFormePagamento is mandatory")
    @NotBlank(message = "idFormePagamento is mandatory")
    private String idFormePagamento;

    private String lista_01;
    @EnumValidator(enumClazz = Enums.PadDir.class, message = "padDir_01 not valid")
    private String padDir_01;
    private String padChr_01;
    private Integer posField_01;
    private Integer lenField_01;
    private String flgEan_01;
    @EnumValidator(enumClazz = Enums.TipoField.class, message = "tipoField_01 not valid")
    private String tipoField_01;
    private String ctrlField_01;
    private String suggField_01;

    private String lista_02;
    @EnumValidator(enumClazz = Enums.PadDir.class, message = "padDir_02 not valid")
    private String padDir_02;
    private String padChr_02;
    private Integer posField_02;
    private Integer lenField_02;
    private String flgEan_02;
    @EnumValidator(enumClazz = Enums.TipoField.class, message = "tipoField_02 not valid")
    private String tipoField_02;
    private String ctrlField_02;
    private String suggField_02;

    private String lista_03;
    @EnumValidator(enumClazz = Enums.PadDir.class, message = "padDir_03 not valid")
    private String padDir_03;
    private String padChr_03;
    private Integer posField_03;
    private Integer lenField_03;
    private String flgEan_03;
    @EnumValidator(enumClazz = Enums.TipoField.class, message = "tipoField_03 not valid")
    private String tipoField_03;
    private String ctrlField_03;
    private String suggField_03;

    private String lista_04;
    @EnumValidator(enumClazz = Enums.PadDir.class, message = "padDir_04 not valid")
    private String padDir_04;
    private String padChr_04;
    private Integer posField_04;
    private Integer lenField_04;
    private String flgEan_04;
    @EnumValidator(enumClazz = Enums.TipoField.class, message = "tipoField_04 not valid")
    private String tipoField_04;
    private String ctrlField_04;
    private String suggField_04;

    private String flgEanAltro;
    private String descAltro;
    private String lenEan;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "TabGuidaIdeTransazioneAggregate";
    }
    public static String getName(){
        return "TabGuidaIdeTransazione";
    }
}

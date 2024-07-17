package com.retexspa.xr.ms.ledger.main.core.dto.tabMoneta;

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
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class TabMonetaBaseDTO extends BaseDTO {

    @NotNull(message = "idValuta is mandatory")
    @NotEmpty(message = "idValuta is mandatory")
    @NotBlank(message = "idValuta is mandatory")
    private String idValuta;

    @EnumValidator(enumClazz = com.retexspa.xr.ms.ledger.main.core.dto.Enums.TipoMoneta.class, message = "tipoMoneta not valid")
    @NotNull(message = "tipoMoneta is mandatory")
    private String tipoMoneta;

    @NotNull(message = "taglioCassetto is mandatory")
    @NotEmpty(message = "taglioCassetto is mandatory")
    @NotBlank(message = "taglioCassetto is mandatory")
    private String taglioCassetto;

    @NotNull(message = "descrizioneTaglio is mandatory")
    @NotEmpty(message = "descrizioneTaglio is mandatory")
    @NotBlank(message = "descrizioneTaglio is mandatory")
    private String descrizioneTaglio;

    private BigDecimal valoreUnitario;

    private BigDecimal valoreTubetto;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "FlgOrdini not valid")
    @NotNull(message = "FlgOrdini is mandatory")
    private String flgOrdini;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgCassaforte not valid")
    @NotNull(message = "flgCassaforte is mandatory")
    private String flgCassaforte;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiCm not valid")
    @NotNull(message = "flgContasoldiCm is mandatory")
    private String flgContasoldiCm;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiHm not valid")
    @NotNull(message = "flgContasoldiHm is mandatory")
    private String flgContasoldiHm;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiVb not valid")
    @NotNull(message = "flgContasoldiVb is mandatory")
    private String flgContasoldiVb;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiCb not valid")
    @NotNull(message = "flgContasoldiCb is mandatory")
    private String flgContasoldiCb;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgInvioBanca not valid")
    @NotNull(message = "flgInvioBanca is mandatory")
    private String flgInvioBanca;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "TabMonetaAggregate";
    }
    public static String getName(){
        return "TabMoneta";
    }
}

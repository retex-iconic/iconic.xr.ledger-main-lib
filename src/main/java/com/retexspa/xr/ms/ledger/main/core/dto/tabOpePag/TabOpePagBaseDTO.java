package com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag;

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
public class TabOpePagBaseDTO extends BaseDTO {

    @NotNull(message = "idFormePagamento is mandatory")
    @NotEmpty(message = "idFormePagamento is mandatory")
    @NotBlank(message = "idFormePagamento is mandatory")
    private String idFormePagamento;

    @NotNull(message = "idTipiOpe is mandatory")
    @NotEmpty(message = "idTipiOpe is mandatory")
    @NotBlank(message = "idTipiOpe is mandatory")
    private String idTipiOpe;

    @NotNull(message = "desOpepagB is mandatory")
    @NotEmpty(message = "desOpepagB is mandatory")
    @NotBlank(message = "desOpepagB is mandatory")
    private String desOpepagB;

    private String desOpepagL;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgDettDistFin not valid")
    @NotNull(message = "flgDettDistFin is mandatory")
    private String flgDettDistFin;

    private Integer numRappFin;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgMovChiusura not valid")
    @NotNull(message = "flgMovChiusura is mandatory")
    private String flgMovChiusura;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgMovUfficio not valid")
    @NotNull(message = "flgMovUfficio is mandatory")
    private String flgMovUfficio;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgRetChiusura not valid")
    @NotNull(message = "flgRetChiusura is mandatory")
    private String flgRetChiusura;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgRetFpag not valid")
    @NotNull(message = "flgRetFpag is mandatory")
    private String flgRetFpag;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgTnvMovRfsComm not valid")
    @NotNull(message = "flgTnvMovRfsComm is mandatory")
    private String flgTnvMovRfsComm;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgTnvMovIva not valid")
    @NotNull(message = "flgTnvMovIva is mandatory")
    private String flgTnvMovIva;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgDettDistFinMod not valid")
    @NotNull(message = "flgDettDistFinMod is mandatory")
    private String flgDettDistFinMod;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgMovInserimento not valid")
    @NotNull(message = "flgMovInserimento is mandatory")
    private String flgMovInserimento;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgCertifIncassi not valid")
    @NotNull(message = "flgCertifIncassi is mandatory")
    private String flgCertifIncassi;

    private List<AttributoValoreDTO> attributi;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "TabOpePagAggregate";
    }
    public static String getName(){
        return "TabOpePag";
    }
}

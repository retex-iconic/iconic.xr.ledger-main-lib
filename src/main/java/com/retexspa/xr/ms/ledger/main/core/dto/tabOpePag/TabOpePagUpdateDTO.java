package com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag;

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
public class TabOpePagUpdateDTO {

    private String desOpepagB;

    private String desOpepagL;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgDettDistFin not valid")
    private String flgDettDistFin;

    private Integer numRappFin;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgMovChiusura not valid")
    private String flgMovChiusura;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgMovUfficio not valid")
    private String flgMovUfficio;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgRetChiusura not valid")
    private String flgRetChiusura;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgRetFpag not valid")
    private String flgRetFpag;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgTnvMovRfsComm not valid")
    private String flgTnvMovRfsComm;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgTnvMovIva not valid")
    private String flgTnvMovIva;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgDettDistFinMod not valid")
    private String flgDettDistFinMod;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgMovInserimento not valid")
    private String flgMovInserimento;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgCertifIncassi not valid")
    private String flgCertifIncassi;
}

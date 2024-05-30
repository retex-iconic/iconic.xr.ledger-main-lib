package com.retexspa.xr.ms.ledger.main.core.dto.tabFormePagamento;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TabFormePagamentoUpdateDTO {

    private String idTipoPagamento;
    private String desForpagb;
    private String desForpagl;

    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgAttivo;

    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgCassaforte;

    private Integer agg01Pos;
    private Integer agg01Lun;
    private String agg01Des;

    private Integer agg02Pos;
    private Integer agg02Lun;
    private String agg02Des;

    private Integer agg03Pos;
    private Integer agg03Lun;
    private String agg03Des;

    private Integer agg04Pos;
    private Integer agg04Lun;
    private String agg04Des;

    private String livMinTot;


}

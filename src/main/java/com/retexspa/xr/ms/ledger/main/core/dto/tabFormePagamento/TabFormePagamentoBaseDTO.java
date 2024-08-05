package com.retexspa.xr.ms.ledger.main.core.dto.tabFormePagamento;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.ledger.main.core.dto.BaseDTO;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.dto.attributo.AttributoValoreDTO;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TabFormePagamentoBaseDTO extends BaseDTO {

    @NotNull(message = "codForPag is mandatory")
    private Integer codForPag;
    @NotNull(message = "idTipoPagamento is mandatory")
    @NotEmpty(message = "idTipoPagamento is mandatory")
    @NotBlank(message = "idTipoPagamento is mandatory")
    private String idTipoPagamento;
    @NotNull(message = "desForpagb is mandatory")
    @NotEmpty(message = "desForpagb is mandatory")
    @NotBlank(message = "desForpagb is mandatory")
    private String desForpagb;
    @NotNull(message = "desForpagl is mandatory")
    @NotEmpty(message = "desForpagl is mandatory")
    @NotBlank(message = "desForpagl is mandatory")
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

    private List<AttributoValoreDTO> attributi;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }

    public Integer getCodForPag() {
        return codForPag;
    }

    public void setCodForPag(Integer codForPag) {
        this.codForPag = codForPag;
    }

    public String getIdTipoPagamento() {
        return idTipoPagamento;
    }

    public void setIdTipoPagamento(String idTipoPagamento) {
        this.idTipoPagamento = idTipoPagamento;
    }

    public String getDesForpagb() {
        return desForpagb;
    }

    public void setDesForpagb(String desForpagb) {
        this.desForpagb = desForpagb;
    }

    public String getDesForpagl() {
        return desForpagl;
    }

    public void setDesForpagl(String desForpagl) {
        this.desForpagl = desForpagl;
    }

    public String getFlgAttivo() {
        return flgAttivo;
    }

    public void setFlgAttivo(String flgAttivo) {
        this.flgAttivo = flgAttivo;
    }

    public String getFlgCassaforte() {
        return flgCassaforte;
    }

    public void setFlgCassaforte(String flgCassaforte) {
        this.flgCassaforte = flgCassaforte;
    }

    public Integer getAgg01Pos() {
        return agg01Pos;
    }

    public void setAgg01Pos(Integer agg01Pos) {
        this.agg01Pos = agg01Pos;
    }

    public Integer getAgg01Lun() {
        return agg01Lun;
    }

    public void setAgg01Lun(Integer agg01Lun) {
        this.agg01Lun = agg01Lun;
    }

    public String getAgg01Des() {
        return agg01Des;
    }

    public void setAgg01Des(String agg01Des) {
        this.agg01Des = agg01Des;
    }

    public Integer getAgg02Pos() {
        return agg02Pos;
    }

    public void setAgg02Pos(Integer agg02Pos) {
        this.agg02Pos = agg02Pos;
    }

    public Integer getAgg02Lun() {
        return agg02Lun;
    }

    public void setAgg02Lun(Integer agg02Lun) {
        this.agg02Lun = agg02Lun;
    }

    public String getAgg02Des() {
        return agg02Des;
    }

    public void setAgg02Des(String agg02Des) {
        this.agg02Des = agg02Des;
    }

    public Integer getAgg03Pos() {
        return agg03Pos;
    }

    public void setAgg03Pos(Integer agg03Pos) {
        this.agg03Pos = agg03Pos;
    }

    public Integer getAgg03Lun() {
        return agg03Lun;
    }

    public void setAgg03Lun(Integer agg03Lun) {
        this.agg03Lun = agg03Lun;
    }

    public String getAgg03Des() {
        return agg03Des;
    }

    public void setAgg03Des(String agg03Des) {
        this.agg03Des = agg03Des;
    }

    public Integer getAgg04Pos() {
        return agg04Pos;
    }

    public void setAgg04Pos(Integer agg04Pos) {
        this.agg04Pos = agg04Pos;
    }

    public Integer getAgg04Lun() {
        return agg04Lun;
    }

    public void setAgg04Lun(Integer agg04Lun) {
        this.agg04Lun = agg04Lun;
    }

    public String getAgg04Des() {
        return agg04Des;
    }

    public void setAgg04Des(String agg04Des) {
        this.agg04Des = agg04Des;
    }

    public String getLivMinTot() {
        return livMinTot;
    }

    public void setLivMinTot(String livMinTot) {
        this.livMinTot = livMinTot;
    }

    public List<AttributoValoreDTO> getAttributi() {
        return attributi;
    }

    public void setAttributi(List<AttributoValoreDTO> attributi) {
        this.attributi = attributi;
    }

    public static String getAggregateName() {
        return "TabFormePagamentoAggregate";
    }

    public static String getName() {
        return "TabFormePagamento";
    }
}

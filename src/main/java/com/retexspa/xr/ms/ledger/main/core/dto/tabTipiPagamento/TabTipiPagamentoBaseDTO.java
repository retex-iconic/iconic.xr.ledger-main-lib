package com.retexspa.xr.ms.ledger.main.core.dto.tabTipiPagamento;

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
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TabTipiPagamentoBaseDTO extends BaseDTO {
    @NotNull(message = "codTipoPag is mandatory")
    private Integer codTipoPag;
    @NotNull(message = "desTipoPagb is mandatory")
    @NotEmpty(message = "desTipoPagb is mandatory")
    @NotBlank(message = "desTipoPagb is mandatory")
    private String desTipoPagb;
    private String desTipoPagl;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContante not valid")
    @NotNull(message = "flgContante is mandatory")
    private String flgContante;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgAssegno not valid")
    @NotNull(message = "flgAssegno is mandatory")
    private String flgAssegno;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgPos not valid")
    @NotNull(message = "flgPos is mandatory")
    private String flgPos;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgNonRiscosso not valid")
    @NotNull(message = "flgNonRiscosso is mandatory")
    private String flgNonRiscosso;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgSostDenaro not valid")
    @NotNull(message = "flgSostDenaro is mandatory")
    private String flgSostDenaro;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgBuoniEnti not valid")
    @NotNull(message = "flgBuoniEnti is mandatory")
    private String flgBuoniEnti;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgBuoniDay not valid")
    @NotNull(message = "flgBuoniDay is mandatory")
    private String flgBuoniDay;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgFatturaPagata not valid")
    @NotNull(message = "flgFatturaPagata is mandatory")
    private String flgFatturaPagata;
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgBuoniCeliaci not valid")
    @NotNull(message = "flgBuoniCeliaci is mandatory")
    private String flgBuoniCeliaci;
    private List<AttributoValoreDTO> attributi;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }

    public Integer getCodTipoPag() {
        return codTipoPag;
    }

    public void setCodTipoPag(Integer codTipoPag) {
        this.codTipoPag = codTipoPag;
    }

    public String getDesTipoPagb() {
        return desTipoPagb;
    }

    public void setDesTipoPagb(String desTipoPagb) {
        this.desTipoPagb = desTipoPagb;
    }

    public String getDesTipoPagl() {
        return desTipoPagl;
    }

    public void setDesTipoPagl(String desTipoPagl) {
        this.desTipoPagl = desTipoPagl;
    }

    public String getFlgContante() {
        return flgContante;
    }

    public void setFlgContante(String flgContante) {
        this.flgContante = flgContante;
    }

    public String getFlgAssegno() {
        return flgAssegno;
    }

    public void setFlgAssegno(String flgAssegno) {
        this.flgAssegno = flgAssegno;
    }

    public String getFlgPos() {
        return flgPos;
    }

    public void setFlgPos(String flgPos) {
        this.flgPos = flgPos;
    }

    public String getFlgNonRiscosso() {
        return flgNonRiscosso;
    }

    public void setFlgNonRiscosso(String flgNonRiscosso) {
        this.flgNonRiscosso = flgNonRiscosso;
    }

    public String getFlgSostDenaro() {
        return flgSostDenaro;
    }

    public void setFlgSostDenaro(String flgSostDenaro) {
        this.flgSostDenaro = flgSostDenaro;
    }

    public String getFlgBuoniEnti() {
        return flgBuoniEnti;
    }

    public void setFlgBuoniEnti(String flgBuoniEnti) {
        this.flgBuoniEnti = flgBuoniEnti;
    }

    public String getFlgBuoniDay() {
        return flgBuoniDay;
    }

    public void setFlgBuoniDay(String flgBuoniDay) {
        this.flgBuoniDay = flgBuoniDay;
    }

    public String getFlgFatturaPagata() {
        return flgFatturaPagata;
    }

    public void setFlgFatturaPagata(String flgFatturaPagata) {
        this.flgFatturaPagata = flgFatturaPagata;
    }

    public String getFlgBuoniCeliaci() {
        return flgBuoniCeliaci;
    }

    public void setFlgBuoniCeliaci(String flgBuoniCeliaci) {
        this.flgBuoniCeliaci = flgBuoniCeliaci;
    }

    public List<AttributoValoreDTO> getAttributi() {
        return attributi;
    }

    public void setAttributi(List<AttributoValoreDTO> attributi) {
        this.attributi = attributi;
    }


    public static String getAggregateName(){
        return "TabTipiPagamentoAggregate";
    }

    public static String getName(){
        return "TabTipiPagamento";
    }
}

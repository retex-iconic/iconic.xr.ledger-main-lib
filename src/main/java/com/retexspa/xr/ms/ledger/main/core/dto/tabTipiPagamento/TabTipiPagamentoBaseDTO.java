package com.retexspa.xr.ms.ledger.main.core.dto.tabTipiPagamento;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.main.core.dto.BaseDTO;
import com.retexspa.xr.ms.main.core.dto.attributo.AttributoBaseDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TabTipiPagamentoBaseDTO {
    @NotNull(message = "codTipoPag is mandatory")
    private Integer codTipoPag;
    @NotNull(message = "desTipoPagb is mandatory")
    @NotEmpty(message = "desTipoPagb is mandatory")
    @NotBlank(message = "desTipoPagb is mandatory")
    private String desTipoPagb;
    private String desTipoPagl;
    @NotNull(message = "flgContante is mandatory")
    private String flgContante;
    @NotNull(message = "flgAssegno is mandatory")
    private String flgAssegno;
    @NotNull(message = "flgPos is mandatory")
    private String flgPos;
    @NotNull(message = "flgNonRiscosso is mandatory")
    private String flgNonRiscosso;
    @NotNull(message = "flgSostDenaro is mandatory")
    private String flgSostDenaro;
    @NotNull(message = "flgBuoniEnti is mandatory")
    private String flgBuoniEnti;
    @NotNull(message = "flgBuoniDay is mandatory")
    private String flgBuoniDay;
    @NotNull(message = "flgFatturaPagata is mandatory")
    private String flgFatturaPagata;
    @NotNull(message = "flgBuoniCeliaci is mandatory")
    private String flgBuoniCeliaci;
    private List<AttributoBaseDTO> attributi;

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

    public List<AttributoBaseDTO> getAttributi() {
        return attributi;
    }

    public void setAttributi(List<AttributoBaseDTO> attributi) {
        this.attributi = attributi;
    }
}

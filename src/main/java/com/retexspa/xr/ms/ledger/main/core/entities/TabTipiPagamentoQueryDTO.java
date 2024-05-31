package com.retexspa.xr.ms.ledger.main.core.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.main.core.dto.attributo.AttributoBaseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.time.LocalDateTime;
import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public class TabTipiPagamentoQueryDTO {
    private String id;

    private Integer codTipoPag;
    private String desTipoPagb;
    private String desTipoPagl;
    private String flgContante;
    private String flgAssegno;
    private String flgPos;
    private String flgNonRiscosso;
    private String flgSostDenaro;
    private String flgBuoniEnti;
    private String flgBuoniDay;
    private String flgFatturaPagata;
    private String flgBuoniCeliaci;
    private Long version;
    private String flgCancellato;

    private LocalDateTime dataCancellazione;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
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

    public String getFlgCancellato() {
        return flgCancellato;
    }

    public void setFlgCancellato(String flgCancellato) {
        this.flgCancellato = flgCancellato;
    }

    public LocalDateTime getDataCancellazione() {
        return dataCancellazione;
    }

    public void setDataCancellazione(LocalDateTime dataCancellazione) {
        this.dataCancellazione = dataCancellazione;
    }
}

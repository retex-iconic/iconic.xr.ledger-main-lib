package com.retexspa.xr.ms.ledger.main.query.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.ledger.main.core.dto.tabTipiPagamento.TabTipiPagamentoBaseDTO;
import com.retexspa.xr.ms.main.core.dto.attributo.AttributoBaseDTO;
import com.retexspa.xr.ms.main.query.entities.AttributoQueryEntity;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tabTipiPagamento")
public class TabTipiPagamentoQueryEntity {

    @Id
    @NonNull
    private String id;
    @Column(name="codTipoPag")
    private Integer codTipoPag;
    @Column(name="desTipoPagb")
    private String desTipoPagb;
    @Column(name="desTipoPagl")
    private String desTipoPagl;
    @Column(name="flgContante")
    private String flgContante;
    @Column(name="flgAssegno")
    private String flgAssegno;
    @Column(name="flgPos")
    private String flgPos;
    @Column(name="flgNonRiscosso")
    private String flgNonRiscosso;
    @Column(name="flgSostDenaro")
    private String flgSostDenaro;
    @Column(name="flgBuoniEnti")
    private String flgBuoniEnti;
    @Column(name="flgBuoniDay")
    private String flgBuoniDay;
    @Column(name="flgFatturaPagata")
    private String flgFatturaPagata;
    @Column(name="flgBuoniCeliaci")
    private String flgBuoniCeliaci;

    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "tabTipiPagamento")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<AttributoQueryEntity> attributi;
*/

    public TabTipiPagamentoQueryEntity() {
    }

    public TabTipiPagamentoQueryEntity(@NonNull String id, TabTipiPagamentoBaseDTO tabTipiPagamentoBaseDTO) {
        this.id = id;
        this.codTipoPag = tabTipiPagamentoBaseDTO.getCodTipoPag();
        this.desTipoPagb = tabTipiPagamentoBaseDTO.getDesTipoPagb();
        this.desTipoPagl = tabTipiPagamentoBaseDTO.getDesTipoPagl();
        this.flgContante = tabTipiPagamentoBaseDTO.getFlgContante();
        this.flgAssegno = tabTipiPagamentoBaseDTO.getFlgAssegno();
        this.flgPos = tabTipiPagamentoBaseDTO.getFlgPos();
        this.flgNonRiscosso = tabTipiPagamentoBaseDTO.getFlgNonRiscosso();
        this.flgSostDenaro = tabTipiPagamentoBaseDTO.getFlgSostDenaro();
        this.flgBuoniEnti = tabTipiPagamentoBaseDTO.getFlgBuoniEnti();
        this.flgBuoniDay = tabTipiPagamentoBaseDTO.getFlgBuoniDay();
        this.flgFatturaPagata = tabTipiPagamentoBaseDTO.getFlgFatturaPagata();
        this.flgBuoniCeliaci = tabTipiPagamentoBaseDTO.getFlgBuoniCeliaci();
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
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
}

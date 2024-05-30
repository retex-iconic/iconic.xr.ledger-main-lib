package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.dto.attributo.AttributoBaseDTO;
import com.retexspa.xr.ms.main.core.filterRequest.AttributoFilter;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;

import java.util.LinkedHashMap;
import java.util.List;

public class TabTipiPagamentoFilter {
    private String id;
    private Integer codTipoPag;
    private String desTipoPagb;
    private String desTipoPagl;
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgContante;
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgAssegno;
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgPos;
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgNonRiscosso;
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgSostDenaro;
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgBuoniEnti;
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgBuoniDay;
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgFatturaPagata;
    @EnumValidator(enumClazz = Enums.CheckSN.class)
    private String flgBuoniCeliaci;
    private Long version;

    public TabTipiPagamentoFilter() {
    }

    public TabTipiPagamentoFilter(@JsonProperty("id") String id,
                                  @JsonProperty("codTipoPag") Integer codTipoPag,
                                  @JsonProperty("desTipoPagb") String desTipoPagb,
                                  @JsonProperty("desTipoPagl") String desTipoPagl,
                                  @JsonProperty("flgContante") String flgContante,
                                  @JsonProperty("flgAssegno") String flgAssegno,
                                  @JsonProperty("flgPos") String flgPos,
                                  @JsonProperty("flgNonRiscosso") String flgNonRiscosso,
                                  @JsonProperty("flgSostDenaro") String flgSostDenaro,
                                  @JsonProperty("flgBuoniEnti") String flgBuoniEnti,
                                  @JsonProperty("flgBuoniDay") String flgBuoniDay,
                                  @JsonProperty("flgFatturaPagata") String flgFatturaPagata,
                                  @JsonProperty("flgBuoniCeliaci") String flgBuoniCeliaci,
                                  @JsonProperty("version") Long version) {
        this.id = id;
        this.codTipoPag = codTipoPag;
        this.desTipoPagb = desTipoPagb;
        this.desTipoPagl = desTipoPagl;
        this.flgContante = flgContante;
        this.flgAssegno = flgAssegno;
        this.flgPos = flgPos;
        this.flgNonRiscosso = flgNonRiscosso;
        this.flgSostDenaro = flgSostDenaro;
        this.flgBuoniEnti = flgBuoniEnti;
        this.flgBuoniDay = flgBuoniDay;
        this.flgFatturaPagata = flgFatturaPagata;
        this.flgBuoniCeliaci = flgBuoniCeliaci;
        this.version = version;
    }

    public static TabTipiPagamentoFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        TabTipiPagamentoFilter filter = new TabTipiPagamentoFilter();
        if (map != null) {
            filter.setId((String) map.get("id"));
            Object codTipoPag = map.get("codTipoPag");
            if (codTipoPag != null) {
                if (codTipoPag instanceof Integer) {
                    filter.setCodTipoPag((Integer) codTipoPag);
                }
            }

        filter.setDesTipoPagb((String) map.get("desTipoPagb"));
        filter.setDesTipoPagl((String) map.get("desTipoPagl"));
        filter.setFlgContante((String) map.get("flgContante"));
        filter.setFlgAssegno((String) map.get("flgAssegno"));
        filter.setFlgPos((String) map.get("flgPos"));
        filter.setFlgNonRiscosso((String) map.get("flgNonRiscosso"));
        filter.setFlgSostDenaro((String) map.get("flgSostDenaro"));
        filter.setFlgBuoniEnti((String) map.get("flgBuoniEnti"));
        filter.setFlgBuoniDay((String) map.get("flgBuoniDay"));
        filter.setFlgFatturaPagata((String) map.get("flgFatturaPagata"));
        filter.setFlgBuoniCeliaci((String) map.get("flgBuoniCeliaci"));
        Object version = map.get("version");
        if (version != null) {
            if (version instanceof Integer) {
                filter.setVersion(Long.valueOf((Integer) version));
            } else if (version instanceof Long) {
                filter.setVersion((Long) version);
            }
        }
        }
        return filter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}

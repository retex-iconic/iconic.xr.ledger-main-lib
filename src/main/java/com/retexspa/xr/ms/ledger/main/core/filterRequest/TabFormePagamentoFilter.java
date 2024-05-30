package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;

@Getter
@Setter
public class TabFormePagamentoFilter {

    private String id;
    private Integer codForPag;
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

    private Long version;

    private String flgCancellato;

    private LocalDateTime dataCancellazione;
    public TabFormePagamentoFilter() {
    }

    public TabFormePagamentoFilter(
            @JsonProperty("id") String id,
            @JsonProperty("codForPag") Integer codForPag,
            @JsonProperty("idTipoPagamento") String idTipoPagamento,
            @JsonProperty("desForpagb") String desForpagb,
            @JsonProperty("desForpagl") String desForpagl,
            @JsonProperty("flgAttivo") String flgAttivo,
            @JsonProperty("flgCassaforte") String flgCassaforte,
            @JsonProperty("agg01Pos") Integer agg01Pos,
            @JsonProperty("agg01Lun") Integer agg01Lun,
            @JsonProperty("agg01Des") String agg01Des,
            @JsonProperty("agg02Pos") Integer agg02Pos,
            @JsonProperty("agg02Lun") Integer agg02Lun,
            @JsonProperty("agg02Des") String agg02Des,
            @JsonProperty("agg03Pos") Integer agg03Pos,
            @JsonProperty("agg03Lun") Integer agg03Lun,
            @JsonProperty("agg03Des") String agg03Des,
            @JsonProperty("agg04Pos") Integer agg04Pos,
            @JsonProperty("agg04Lun") Integer agg04Lun,
            @JsonProperty("agg04Des") String agg04Des,
            @JsonProperty("livMinTot") String livMinTot,
            @JsonProperty("version") Long version,
            @JsonProperty("flgCancellato") String flgCancellato,
            @JsonProperty("dataCancellazione") LocalDateTime dataCancellazione) {
        this.id = id;
        this.codForPag = codForPag;
        this.idTipoPagamento = idTipoPagamento;
        this.desForpagb = desForpagb;
        this.desForpagl = desForpagl;
        this.flgAttivo = flgAttivo;
        this.flgCassaforte = flgCassaforte;
        this.agg01Pos = agg01Pos;
        this.agg01Lun = agg01Lun;
        this.agg01Des = agg01Des;
        this.agg02Pos = agg02Pos;
        this.agg02Lun = agg02Lun;
        this.agg02Des = agg02Des;
        this.agg03Pos = agg03Pos;
        this.agg03Lun = agg03Lun;
        this.agg03Des = agg03Des;
        this.agg04Pos = agg04Pos;
        this.agg04Lun = agg04Lun;
        this.agg04Des = agg04Des;
        this.livMinTot = livMinTot;
        this.version = version;
        this.flgCancellato= flgCancellato;
        this.dataCancellazione=dataCancellazione;
    }

    public static TabFormePagamentoFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        TabFormePagamentoFilter filter = new TabFormePagamentoFilter();
        if (map != null) {
            filter.setId((String) map.get("id"));
            Object codForPag = map.get("codForPag");
            if (codForPag != null) {
                if (codForPag instanceof Integer) {
                    filter.setVersion(Long.valueOf((Integer) codForPag));
                } else if (codForPag instanceof Long) {
                    filter.setVersion((Long) codForPag);
                }
            }
            filter.setIdTipoPagamento((String) map.get("idTipoPagamento"));
            filter.setDesForpagb((String) map.get("desForpagb"));
            filter.setDesForpagl((String) map.get("desForpagl"));
            filter.setFlgAttivo((String) map.get("flgAttivo"));
            filter.setFlgCassaforte((String) map.get("flgCassaforte"));

            Object agg01Pos = map.get("agg01Pos");
            if (agg01Pos != null) {
                if (agg01Pos instanceof Integer) {
                    filter.setAgg01Pos((Integer) agg01Pos);
                }
            }

            Object agg01Lun = map.get("agg01Lun");
            if (agg01Lun != null) {
                if (agg01Lun instanceof Integer) {
                    filter.setAgg01Lun((Integer) agg01Lun);
                }
            }
            filter.setAgg01Des((String) map.get("agg01Des"));

            Object agg02Pos = map.get("agg02Pos");
            if (agg02Pos != null) {
                if (agg02Pos instanceof Integer) {
                    filter.setAgg02Pos((Integer)  agg02Pos);
                }
            }

            Object agg02Lun = map.get("agg02Lun");
            if (agg02Lun != null) {
                if (agg02Lun instanceof Integer) {
                    filter.setAgg02Lun((Integer) agg02Lun);
                }
            }
            filter.setAgg02Des((String) map.get("agg02Des"));

            Object agg03Pos = map.get("agg03Pos");
            if (agg03Pos != null) {
                if (agg03Pos instanceof Integer) {
                    filter.setAgg03Pos((Integer) agg03Pos);
                }
            }

            Object agg03Lun = map.get("agg03Lun");
            if (agg03Lun != null) {
                if (agg03Lun instanceof Integer) {
                    filter.setAgg03Lun((Integer) agg03Lun);
                }
            }
            filter.setAgg03Des((String) map.get("agg03Des"));

            Object agg04Pos = map.get("agg04Pos");
            if (agg04Pos != null) {
                if (agg04Pos instanceof Integer) {
                    filter.setAgg04Pos((Integer) agg04Pos);
                }
            }

            Object agg04Lun = map.get("agg04Lun");
            if (agg04Lun != null) {
                if (agg04Lun instanceof Integer) {
                    filter.setAgg04Lun((Integer) agg04Lun);
                }
            }
            filter.setAgg04Des((String) map.get("agg04Des"));
            filter.setLivMinTot((String) map.get("livMinTot"));

            filter.setFlgCancellato((String) map.get("flgCancellato"));
            filter.setDataCancellazione((LocalDateTime) map.get("dataCancellazione"));
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


}

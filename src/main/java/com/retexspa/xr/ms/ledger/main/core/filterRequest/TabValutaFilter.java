package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

@Getter
@Setter
public class TabValutaFilter {

    private String id;
    private String codValuta;
    private String nome;
    private String descrizione;
    private String flgValutaPrevalente;
    private String flgCambioFisso;
    private String flgAbilitazioneOrdini;
    private BigDecimal importoCambioValPrev;
    private Integer numeroDecimali;
    private String formato;
    private Long version;

    public TabValutaFilter() {
    }

    public TabValutaFilter(@JsonProperty("id") String id,
                                  @JsonProperty("codValuta") String codValuta,
                                  @JsonProperty("nome") String nome,
                                  @JsonProperty("descrizione") String descrizione,
                                  @JsonProperty("flgValutaPrevalente") String flgValutaPrevalente,
                                  @JsonProperty("flgCambioFisso") String flgCambioFisso,
                                  @JsonProperty("flgAbilitazioneOrdini") String flgAbilitazioneOrdini,
                                  @JsonProperty("importoCambioValPrev") BigDecimal importoCambioValPrev,
                                  @JsonProperty("numeroDecimali") Integer numeroDecimali,
                                  @JsonProperty("formato") String formato,
                                  @JsonProperty("version") Long version) {
        this.id = id;
        this.codValuta = codValuta;
        this.nome = nome;
        this.descrizione = descrizione;
        this.flgValutaPrevalente = flgValutaPrevalente;
        this.flgCambioFisso = flgCambioFisso;
        this.flgAbilitazioneOrdini = flgAbilitazioneOrdini;
        this.importoCambioValPrev = importoCambioValPrev;
        this.numeroDecimali = numeroDecimali;
        this.formato = formato;
        this.version = version;
    }

    public static TabValutaFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        TabValutaFilter filter = new TabValutaFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setCodValuta((String) map.get("codValuta"));
            filter.setNome((String) map.get("nome"));
            filter.setDescrizione((String) map.get("descrizione"));
            filter.setFlgValutaPrevalente((String) map.get("flgValutaPrevalente"));
            filter.setFlgCambioFisso((String) map.get("flgCambioFisso"));
            filter.setFlgAbilitazioneOrdini((String) map.get("flgAbilitazioneOrdini"));
            filter.setFormato((String) map.get("formato"));

            Object importoCambioValPrev = map.get("importoCambioValPrev");
            if(importoCambioValPrev != null){
                if(importoCambioValPrev instanceof BigDecimal){
                    filter.setImportoCambioValPrev((BigDecimal) importoCambioValPrev);
                }
            }
            Object numeroDecimali = map.get("numeroDecimali");
            if(numeroDecimali != null){
                if(numeroDecimali instanceof Integer){
                    filter.setNumeroDecimali((Integer) numeroDecimali);
                }
            }

            Object version = map.get("version");
            if(version != null){
                if(version instanceof Integer){
                    filter.setVersion(Long.valueOf((Integer) version));
                } else if (version instanceof Long){
                    filter.setVersion((Long) version);
                }
            }
        }
        return filter;
    }
}

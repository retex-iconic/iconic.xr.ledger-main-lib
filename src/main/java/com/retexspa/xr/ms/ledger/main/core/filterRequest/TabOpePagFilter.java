package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

@Getter
@Setter
public class TabOpePagFilter {
    private String id;
    private String idFormePagamento;
    private String idTipiOpe;
    private String desOpepagB;
    private String desOpepagL;
    private String flgDettDistFin;
    private Integer numRappFin;
    private String flgMovChiusura;
    private String flgMovUfficio;
    private String flgRetChiusura;
    private String flgRetFpag;
    private String flgTnvMovRfsComm;
    private String flgTnvMovIva;
    private String flgDettDistFinMod;
    private String flgMovInserimento;
    private String flgCertifIncassi;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;
    public TabOpePagFilter() {
    }

    public TabOpePagFilter(@JsonProperty("id") String id,
                            @JsonProperty("idFormePagamento") String idFormePagamento,
                            @JsonProperty("idTipiOpe") String idTipiOpe,
                            @JsonProperty("desOpepagB") String desOpepagB,
                            @JsonProperty("desOpepagL") String desOpepagL,
                            @JsonProperty("flgDettDistFin") String flgDettDistFin,
                            @JsonProperty("numRappFin") Integer numRappFin,
                            @JsonProperty("flgMovChiusura") String flgMovChiusura,
                            @JsonProperty("flgMovUfficio") String flgMovUfficio,
                            @JsonProperty("flgRetChiusura") String flgRetChiusura,
                            @JsonProperty("flgRetFpag") String flgRetFpag,
                            @JsonProperty("flgTnvMovRfsComm") String flgTnvMovRfsComm,
                            @JsonProperty("flgTnvMovIva") String flgTnvMovIva,
                            @JsonProperty("flgDettDistFinMod") String flgDettDistFinMod,
                            @JsonProperty("flgMovInserimento") String flgMovInserimento,
                            @JsonProperty("flgCertifIncassi") String flgCertifIncassi,
                            @JsonProperty("flgCancellato") String flgCancellato,
                            @JsonProperty("dataCancellazione") LocalDateTime dataCancellazione,
                            @JsonProperty("version")  Long version) {
        this.id = id;
        this.idFormePagamento = idFormePagamento;
        this.idTipiOpe = idTipiOpe;
        this.desOpepagB = desOpepagB;
        this.desOpepagL = desOpepagL;
        this.flgDettDistFin = flgDettDistFin;
        this.numRappFin = numRappFin;
        this.flgMovChiusura = flgMovChiusura;
        this.flgMovUfficio = flgMovUfficio;
        this.flgRetChiusura = flgRetChiusura;
        this.flgRetFpag = flgRetFpag;
        this.flgTnvMovRfsComm = flgTnvMovRfsComm;
        this.flgTnvMovIva = flgTnvMovIva;
        this.flgDettDistFinMod = flgDettDistFinMod;
        this.flgMovInserimento = flgMovInserimento;
        this.flgCertifIncassi = flgCertifIncassi;
        this.flgCancellato = flgCancellato;
        this.dataCancellazione = dataCancellazione;
        this.version = version;
    }
    public static TabOpePagFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        TabOpePagFilter filter = new TabOpePagFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setIdFormePagamento((String) map.get("idFormePagamento"));
            filter.setIdTipiOpe((String) map.get("idTipiOpe"));
            filter.setDesOpepagB((String) map.get("desOpepagB"));
            filter.setDesOpepagL((String) map.get("desOpepagL"));
            filter.setFlgDettDistFin((String) map.get("flgDettDistFin"));
            filter.setNumRappFin((Integer) map.get("numRappFin"));
            filter.setFlgMovChiusura((String) map.get("flgMovChiusura"));
            filter.setFlgMovUfficio((String) map.get("flgMovUfficio"));
            filter.setFlgRetChiusura((String) map.get("flgRetChiusura"));
            filter.setFlgRetFpag((String) map.get("flgRetFpag"));
            filter.setFlgTnvMovRfsComm((String) map.get("flgTnvMovRfsComm"));
            filter.setFlgTnvMovIva((String) map.get("flgTnvMovIva"));
            filter.setFlgDettDistFinMod((String) map.get("flgDettDistFinMod"));
            filter.setFlgMovInserimento((String) map.get("flgMovInserimento"));
            filter.setFlgCertifIncassi((String) map.get("flgCertifIncassi"));
            filter.setFlgCancellato((String) map.get("flgCancellato"));
            DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
            Object dataCancellazione = map.get("dataCancellazione");
            if (dataCancellazione != null) {
                if (dataCancellazione instanceof String) {
                    filter.setDataCancellazione(
                            LocalDateTime.parse((String) map.get("dataCancellazione"), formatter));
                } else if (dataCancellazione instanceof LocalDateTime) {
                    filter.setDataCancellazione((LocalDateTime) dataCancellazione);
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

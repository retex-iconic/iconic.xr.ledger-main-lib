package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

@Getter
@Setter
public class RegRigaDistintaFinFilter {
    private String id;
    private String idRigaDistFin;
    private String idOpePag;
    private String segno;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;

    public RegRigaDistintaFinFilter() {
    }

    public RegRigaDistintaFinFilter(@JsonProperty("id") String id,
                                    @JsonProperty("idRigaDistFin") String idRigaDistFin,
                                    @JsonProperty("idOpePag") String idOpePag,
                                    @JsonProperty("segno")  String segno,
                                    @JsonProperty("flgCancellato")  String flgCancellato,
                                    @JsonProperty("dataCancellazione")  LocalDateTime dataCancellazione,
                                    @JsonProperty("version") Long version) {
        this.id = id;
        this.idRigaDistFin = idRigaDistFin;
        this.idOpePag = idOpePag;
        this.segno = segno;
        this.flgCancellato = flgCancellato;
        this.dataCancellazione = dataCancellazione;
        this.version = version;
    }
    public static RegRigaDistintaFinFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        RegRigaDistintaFinFilter filter = new RegRigaDistintaFinFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setIdRigaDistFin((String) map.get("idRigaDistFin"));
            filter.setIdOpePag((String) map.get("idOpePag"));
            filter.setSegno((String) map.get("segno"));
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

package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

@Getter
@Setter
public class RegDettChiusureUffFilter {
    private String id;
    private String idRigaChiUff;
    private String idOpePagC01;
    private String segnoC01;
    private String idOpePagC02;
    private String segnoC02;
    private Long version;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;

    public RegDettChiusureUffFilter() {
    }

    public RegDettChiusureUffFilter(@JsonProperty("id") String id,
                                    @JsonProperty("idRigaChiUff") String idRigaChiUff,
                                    @JsonProperty("idOpePagC01") String idOpePagC01,
                                    @JsonProperty("segnoC01") String segnoC01,
                                    @JsonProperty("idOpePagC02") String idOpePagC02,
                                    @JsonProperty("segnoC02") String segnoC02,
                                    @JsonProperty("flgCancellato") String flgCancellato,
                                    @JsonProperty("dataCancellazione") LocalDateTime dataCancellazione,
                                    @JsonProperty("version") Long version) {
        this.id = id;
        this.idRigaChiUff = idRigaChiUff;
        this.idOpePagC01 = idOpePagC01;
        this.segnoC01 = segnoC01;
        this.idOpePagC02 = idOpePagC02;
        this.segnoC02 = segnoC02;
        this.version = version;
        this.flgCancellato = flgCancellato;
        this.dataCancellazione = dataCancellazione;
    }
    public static RegDettChiusureUffFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        RegDettChiusureUffFilter filter = new RegDettChiusureUffFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setIdRigaChiUff((String) map.get("idRigaChiUff"));
            filter.setIdOpePagC01((String) map.get("idOpePagC01"));
            filter.setSegnoC01((String) map.get("segnoC01"));
            filter.setIdOpePagC02((String) map.get("idOpePagC02"));
            filter.setSegnoC02((String) map.get("segnoC02"));
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

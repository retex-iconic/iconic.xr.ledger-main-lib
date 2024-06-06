package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

@Getter
@Setter
public class RegDettChiusureOpeFilter {
    private String id;
    private String idRigaChiOpe;
    private String idOpePagC01;
    private String segnoC01;
    private String idOpePagC02;
    private String segnoC02;
    private String idOpePagC03;
    private String segnoC03;
    private String idOpePagC04;
    private String segnoC04;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;

    public RegDettChiusureOpeFilter() {
    }

    public RegDettChiusureOpeFilter(@JsonProperty("id") String id,
                                    @JsonProperty("idRigaChiOpe") String idRigaChiOpe,
                                    @JsonProperty("idOpePagC01") String idOpePagC01,
                                    @JsonProperty("segnoC01") String segnoC01,
                                    @JsonProperty("idOpePagC02") String idOpePagC02,
                                    @JsonProperty("segnoC02") String segnoC02,
                                    @JsonProperty("idOpePagC03") String idOpePagC03,
                                    @JsonProperty("segnoC03") String segnoC03,
                                    @JsonProperty("idOpePagC04") String idOpePagC04,
                                    @JsonProperty("segnoC04") String segnoC04,
                                    @JsonProperty("flgCancellato") String flgCancellato,
                                    @JsonProperty("dataCancellazione") LocalDateTime dataCancellazione,
                                    @JsonProperty("version") Long version) {
        this.id = id;
        this.idRigaChiOpe = idRigaChiOpe;
        this.idOpePagC01 = idOpePagC01;
        this.segnoC01 = segnoC01;
        this.idOpePagC02 = idOpePagC02;
        this.segnoC02 = segnoC02;
        this.idOpePagC03 = idOpePagC03;
        this.segnoC03 = segnoC03;
        this.idOpePagC04 = idOpePagC04;
        this.segnoC04 = segnoC04;
        this.flgCancellato = flgCancellato;
        this.dataCancellazione = dataCancellazione;
        this.version = version;
    }

    public static RegDettChiusureOpeFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        RegDettChiusureOpeFilter filter = new RegDettChiusureOpeFilter();

        if (map != null) {
            filter.setId((String) map.get("id"));
            filter.setIdRigaChiOpe((String) map.get("idRigaChiOpe"));
            filter.setIdOpePagC01((String) map.get("idOpePagC01"));
            filter.setSegnoC01((String) map.get("segnoC01"));
            filter.setIdOpePagC02((String) map.get("idOpePagC02"));
            filter.setSegnoC02((String) map.get("segnoC02"));
            filter.setIdOpePagC03((String) map.get("idOpePagC03"));
            filter.setSegnoC03((String) map.get("segnoC03"));
            filter.setIdOpePagC04((String) map.get("idOpePagC04"));
            filter.setSegnoC04((String) map.get("segnoC04"));
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

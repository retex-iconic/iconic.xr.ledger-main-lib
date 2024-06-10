package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

@Getter
@Setter
public class RegRigheChiusureOpeFilter {
    private String id;
    private Integer codRiga;
    private String desRigaB;
    private String desRigaL;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;

    public RegRigheChiusureOpeFilter() {
    }

    public RegRigheChiusureOpeFilter(@JsonProperty("id") String id,
                                     @JsonProperty("codRiga") Integer codRiga,
                                     @JsonProperty("desRigaB") String desRigaB,
                                     @JsonProperty("desRigaL") String desRigaL,
                                     @JsonProperty("flgCancellato") String flgCancellato,
                                     @JsonProperty("dataCancellazione") LocalDateTime dataCancellazione,
                                     @JsonProperty("version") Long version) {
        this.id = id;
        this.codRiga = codRiga;
        this.desRigaB = desRigaB;
        this.desRigaL = desRigaL;
        this.flgCancellato = flgCancellato;
        this.dataCancellazione = dataCancellazione;
        this.version = version;
    }

    public static RegRigheChiusureOpeFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        RegRigheChiusureOpeFilter filter = new RegRigheChiusureOpeFilter();

        if (map != null) {
            filter.setId((String) map.get("id"));
            filter.setCodRiga((Integer) map.get("codRiga"));
            filter.setDesRigaB((String) map.get("desRigaB"));
            filter.setDesRigaL((String) map.get("desRigaL"));
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

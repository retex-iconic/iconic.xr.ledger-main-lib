package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;

@Getter
@Setter
public class DecodeCircuitoCartaFilter {

    private String id;
    private String idTipoCarta;
    private String prefisso;
    private Long version;

    public DecodeCircuitoCartaFilter() {
    }

    public DecodeCircuitoCartaFilter(@JsonProperty("id") String id,
                                  @JsonProperty("idTipoCarta") String idTipoCarta,
                                  @JsonProperty("prefisso") String prefisso,
                                  @JsonProperty("version") Long version) {
        this.id = id;
        this.idTipoCarta = idTipoCarta;
        this.prefisso = prefisso;
        this.version = version;
    }

    public static DecodeCircuitoCartaFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        DecodeCircuitoCartaFilter filter = new DecodeCircuitoCartaFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setIdTipoCarta((String) map.get("idTipoCarta"));
            filter.setPrefisso((String) map.get("prefisso"));
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

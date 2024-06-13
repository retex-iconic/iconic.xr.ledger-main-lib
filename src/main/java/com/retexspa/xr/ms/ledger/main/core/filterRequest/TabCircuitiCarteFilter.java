package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedHashMap;

@Getter
@Setter
public class TabCircuitiCarteFilter {

    private String id;
    private String idFormePagamento;
    private String tipoCarta;
    private Integer ordineStampa;
    private Long version;

    public TabCircuitiCarteFilter() {
    }

    public TabCircuitiCarteFilter(@JsonProperty("id") String id,
                                  @JsonProperty("idFormePagamento") String idFormePagamento,
                                  @JsonProperty("tipoCarta") String tipoCarta,
                                  @JsonProperty("ordineStampa") Integer ordineStampa,
                                  @JsonProperty("version") Long version) {
        this.id = id;
        this.idFormePagamento = idFormePagamento;
        this.tipoCarta = tipoCarta;
        this.ordineStampa = ordineStampa;
        this.version = version;
    }

    public static TabCircuitiCarteFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        TabCircuitiCarteFilter filter = new TabCircuitiCarteFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setIdFormePagamento((String) map.get("idFormePagamento"));
            filter.setTipoCarta((String) map.get("tipoCarta"));

            Object ordineStampa = map.get("ordineStampa");
            if(ordineStampa != null){
                if(ordineStampa instanceof Integer){
                    filter.setOrdineStampa((Integer) ordineStampa);
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

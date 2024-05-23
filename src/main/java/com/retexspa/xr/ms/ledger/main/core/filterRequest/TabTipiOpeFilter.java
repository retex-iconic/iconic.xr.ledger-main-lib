package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;

@Getter
@Setter
public class TabTipiOpeFilter {
    private String id;
    private Integer codTipope;
    private String desTipopeB;
    private String desTipopeL;
    private String flgCassaForte;
    private String flgBarriera;
    private String flgRichiestaUg;
    private String flgRichiestaCassiere;
    private String variazioneFondoCassa;
    private String segnoModificaVenduto;
    private String flgVersamento;
    private String flgServizio;
    private String flgUfficio;
    private String flgCancellato;
    private Long version;

    public TabTipiOpeFilter() {
    }

    public TabTipiOpeFilter(@JsonProperty("id") String id,
                            @JsonProperty("codTipope") Integer codTipope,
                            @JsonProperty("desTipopeB") String desTipopeB,
                            @JsonProperty("desTipopeL") String desTipopeL,
                            @JsonProperty("flgCassaForte") String flgCassaForte,
                            @JsonProperty("flgBarriera") String flgBarriera,
                            @JsonProperty("flgRichiestaUg") String flgRichiestaUg,
                            @JsonProperty("flgRichiestaCassiere") String flgRichiestaCassiere,
                            @JsonProperty("variazioneFondoCassa") String variazioneFondoCassa,
                            @JsonProperty("segnoModificaVenduto") String segnoModificaVenduto,
                            @JsonProperty("flgVersamento") String flgVersamento,
                            @JsonProperty("flgServizio") String flgServizio,
                            @JsonProperty("flgUfficio") String flgUfficio,
                            @JsonProperty("flgCancellato") String flgCancellato,
                            @JsonProperty("version")  Long version) {
        this.id = id;
        this.codTipope = codTipope;
        this.desTipopeB = desTipopeB;
        this.desTipopeL = desTipopeL;
        this.flgCassaForte = flgCassaForte;
        this.flgBarriera = flgBarriera;
        this.flgRichiestaUg = flgRichiestaUg;
        this.flgRichiestaCassiere = flgRichiestaCassiere;
        this.variazioneFondoCassa = variazioneFondoCassa;
        this.segnoModificaVenduto = segnoModificaVenduto;
        this.flgVersamento = flgVersamento;
        this.flgServizio = flgServizio;
        this.flgUfficio = flgUfficio;
        this.flgCancellato = flgCancellato;
        this.version = version;
    }
    public static TabTipiOpeFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        TabTipiOpeFilter filter = new TabTipiOpeFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setCodTipope((Integer) map.get("codTipope"));
            filter.setDesTipopeB((String) map.get("desTipopeB"));
            filter.setDesTipopeL((String) map.get("desTipopeL"));
            filter.setFlgCassaForte((String) map.get("flgCassaForte"));
            filter.setFlgBarriera((String) map.get("flgBarriera"));
            filter.setFlgRichiestaUg((String) map.get("flgRichiestaUg"));
            filter.setFlgRichiestaCassiere((String) map.get("flgRichiestaCassiere"));
            filter.setVariazioneFondoCassa((String) map.get("variazioneFondoCassa"));
            filter.setSegnoModificaVenduto((String) map.get("segnoModificaVenduto"));
            filter.setFlgVersamento((String) map.get("flgVersamento"));
            filter.setFlgServizio((String) map.get("flgServizio"));
            filter.setFlgUfficio((String) map.get("flgUfficio"));
            filter.setFlgCancellato((String) map.get("flgCancellato"));
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

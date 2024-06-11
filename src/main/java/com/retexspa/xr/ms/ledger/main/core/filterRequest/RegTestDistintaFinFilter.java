package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

@Getter
@Setter
public class RegTestDistintaFinFilter {
    private String id;
    private Integer codRiga;
    private String desRigaB;
    private String desRigaL;
    private String flgVisSoloMov;
    private String flgQuadraturaCommerciale;
    private String flgQuadraturaVersato;
    private String flgQuadraturaServizi;
    private String flgImpFatturato;
    private String flgImpNonFatturato;
    private String flgImpRimborsiFsIva;
    private String flgFondoCassa;
    private String flgFondiCassetti;
    private String flgFondiCassieri;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;

    public RegTestDistintaFinFilter() {
    }

    public RegTestDistintaFinFilter(@JsonProperty("id") String id,
                                    @JsonProperty("codRiga") Integer codRiga,
                                    @JsonProperty("desRigaB")  String desRigaB,
                                    @JsonProperty("desRigaL") String desRigaL,
                                    @JsonProperty("flgVisSoloMov")  String flgVisSoloMov,
                                    @JsonProperty("flgQuadraturaCommerciale") String flgQuadraturaCommerciale,
                                    @JsonProperty("flgQuadraturaVersato")  String flgQuadraturaVersato,
                                    @JsonProperty("flgQuadraturaServizi") String flgQuadraturaServizi,
                                    @JsonProperty("flgImpFatturato")   String flgImpFatturato,
                                    @JsonProperty("flgImpNonFatturato") String flgImpNonFatturato,
                                    @JsonProperty("flgImpRimborsiFsIva")   String flgImpRimborsiFsIva,
                                    @JsonProperty("flgFondoCassa") String flgFondoCassa,
                                    @JsonProperty("flgFondiCassetti")  String flgFondiCassetti,
                                    @JsonProperty("flgFondiCassieri")  String flgFondiCassieri,
                                    @JsonProperty("flgCancellato")  String flgCancellato,
                                    @JsonProperty("dataCancellazione")  LocalDateTime dataCancellazione,
                                    @JsonProperty("version")   Long version) {
        this.id = id;
        this.codRiga = codRiga;
        this.desRigaB = desRigaB;
        this.desRigaL = desRigaL;
        this.flgVisSoloMov = flgVisSoloMov;
        this.flgQuadraturaCommerciale = flgQuadraturaCommerciale;
        this.flgQuadraturaVersato = flgQuadraturaVersato;
        this.flgQuadraturaServizi = flgQuadraturaServizi;
        this.flgImpFatturato = flgImpFatturato;
        this.flgImpNonFatturato = flgImpNonFatturato;
        this.flgImpRimborsiFsIva = flgImpRimborsiFsIva;
        this.flgFondoCassa = flgFondoCassa;
        this.flgFondiCassetti = flgFondiCassetti;
        this.flgFondiCassieri = flgFondiCassieri;
        this.flgCancellato = flgCancellato;
        this.dataCancellazione = dataCancellazione;
        this.version = version;
    }
    public static RegTestDistintaFinFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        RegTestDistintaFinFilter filter = new RegTestDistintaFinFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setCodRiga((Integer) map.get("codRiga"));
            filter.setDesRigaB((String) map.get("desRigaB"));
            filter.setDesRigaL((String) map.get("desRigaL"));
            filter.setFlgVisSoloMov((String) map.get("flgVisSoloMov"));
            filter.setFlgQuadraturaCommerciale((String) map.get("flgQuadraturaCommerciale"));
            filter.setFlgQuadraturaVersato((String) map.get("flgQuadraturaVersato"));
            filter.setFlgQuadraturaServizi((String) map.get("flgQuadraturaServizi"));
            filter.setFlgImpFatturato((String) map.get("flgImpFatturato"));
            filter.setFlgImpNonFatturato((String) map.get("flgImpNonFatturato"));
            filter.setFlgImpRimborsiFsIva((String) map.get("flgImpRimborsiFsIva"));
            filter.setFlgFondoCassa((String) map.get("flgFondoCassa"));
            filter.setFlgFondiCassetti((String) map.get("flgFondiCassetti"));
            filter.setFlgFondiCassieri((String) map.get("flgFondiCassieri"));
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

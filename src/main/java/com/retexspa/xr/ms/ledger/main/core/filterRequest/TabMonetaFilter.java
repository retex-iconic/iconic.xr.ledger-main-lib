package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

@Getter
@Setter
public class TabMonetaFilter {
    private String id;

    private String idValuta;

    @EnumValidator(enumClazz = com.retexspa.xr.ms.ledger.main.core.dto.Enums.TipoMoneta.class, message = "tipoMoneta not valid")
    private String tipoMoneta;

    private String taglioCassetto;

    private String descrizioneTaglio;

    private BigDecimal valoreUnitario;

    private BigDecimal valoreTubetto;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "FlgOrdini not valid")
    private String flgOrdini;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiCm not valid")
    private String flgCassaforte;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiCm not valid")
    private String flgContasoldiCm;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiHm not valid")
    private String flgContasoldiHm;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiVb not valid")
    private String flgContasoldiVb;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgContasoldiCb not valid")
    private String flgContasoldiCb;

    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "flgInvioBanca not valid")
    private String flgInvioBanca;

    private String flgCancellato;

    private LocalDateTime dataCancellazione;

    private Long version;

    public TabMonetaFilter() {
    }

    public TabMonetaFilter(@JsonProperty("id") String id,
                           @JsonProperty("idValuta") String idValuta,
                           @JsonProperty("tipoMoneta") String tipoMoneta,
                           @JsonProperty("taglioCassetto") String taglioCassetto,
                           @JsonProperty("descrizioneTaglio") String descrizioneTaglio,
                           @JsonProperty("valoreUnitario") BigDecimal valoreUnitario,
                           @JsonProperty("valoreTubetto") BigDecimal valoreTubetto,
                           @JsonProperty("flgOrdini") String flgOrdini,
                           @JsonProperty("flgCassaforte") String flgCassaforte,
                           @JsonProperty("flgContasoldiCm") String flgContasoldiCm,
                           @JsonProperty("flgContasoldiHm") String flgContasoldiHm,
                           @JsonProperty("flgContasoldiVb") String flgContasoldiVb,
                           @JsonProperty("flgContasoldiCb") String flgContasoldiCb,
                           @JsonProperty("flgInvioBanca") String flgInvioBanca,
                           @JsonProperty("flgCancellato") String flgCancellato,
                           @JsonProperty("dataCancellazione") LocalDateTime dataCancellazione,
                           @JsonProperty("version")  Long version) {
        this.id = id;
        this.idValuta = idValuta;
        this.tipoMoneta = tipoMoneta;
        this.taglioCassetto = taglioCassetto;
        this.descrizioneTaglio = descrizioneTaglio;
        this.valoreUnitario = valoreUnitario;
        this.valoreTubetto = valoreTubetto;
        this.flgOrdini = flgOrdini;
        this.flgCassaforte = flgCassaforte;
        this.flgContasoldiCm = flgContasoldiCm;
        this.flgContasoldiHm = flgContasoldiHm;
        this.flgContasoldiVb = flgContasoldiVb;
        this.flgContasoldiCb = flgContasoldiCb;
        this.flgInvioBanca = flgInvioBanca;
        this.flgCancellato = flgCancellato;
        this.dataCancellazione = dataCancellazione;
        this.version = version;
    }
    public static TabMonetaFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        TabMonetaFilter filter = new TabMonetaFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setIdValuta((String) map.get("idValuta"));
            filter.setTipoMoneta((String) map.get("tipoMoneta"));
            filter.setTaglioCassetto((String) map.get("taglioCassetto"));
            filter.setDescrizioneTaglio((String) map.get("descrizioneTaglio"));
            filter.setFlgOrdini((String) map.get("flgOrdini"));
            filter.setFlgCassaforte((String) map.get("flgCassaforte"));
            filter.setFlgContasoldiCm((String) map.get("flgContasoldiCm"));
            filter.setFlgContasoldiHm((String) map.get("flgContasoldiHm"));
            filter.setFlgContasoldiVb((String) map.get("flgContasoldiVb"));
            filter.setFlgContasoldiCb((String) map.get("flgContasoldiCb"));
            filter.setFlgInvioBanca((String) map.get("flgInvioBanca"));
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

            Object valoreUnitario = map.get("valoreUnitario");
            if(valoreUnitario != null){
                if(valoreUnitario instanceof BigDecimal){
                    filter.setValoreUnitario((BigDecimal) valoreUnitario);
                }
            }
            Object valoreTubetto = map.get("valoreTubetto");
            if(valoreTubetto != null){
                if(valoreTubetto instanceof BigDecimal){
                    filter.setValoreTubetto((BigDecimal) valoreTubetto);
                }
            }

        }
        return filter;
    }
}

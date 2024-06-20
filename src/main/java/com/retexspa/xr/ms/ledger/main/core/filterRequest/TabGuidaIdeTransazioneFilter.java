package com.retexspa.xr.ms.ledger.main.core.filterRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

@Getter
@Setter
public class TabGuidaIdeTransazioneFilter {
    private String id;
    private String idFormePagamento;
    private String lista_01;
    private String padDir_01;
    private String padChr_01;
    private Integer posField_01;
    private Integer lenField_01;
    private String flgEan_01;
    private String tipoField_01;
    private String ctrlField_01;
    private String suggField_01;
    private String lista_02;
    private String padDir_02;
    private String padChr_02;
    private Integer posField_02;
    private Integer lenField_02;
    private String flgEan_02;
    private String tipoField_02;
    private String ctrlField_02;
    private String suggField_02;
    private String lista_03;
    private String padDir_03;
    private String padChr_03;
    private Integer posField_03;
    private Integer lenField_03;
    private String flgEan_03;
    private String tipoField_03;
    private String ctrlField_03;
    private String suggField_03;
    private String lista_04;
    private String padDir_04;
    private String padChr_04;
    private Integer posField_04;
    private Integer lenField_04;
    private String flgEan_04;
    private String tipoField_04;
    private String ctrlField_04;
    private String suggField_04;
    private String flgEanAltro;
    private String descAltro;
    private String lenEan;
    private String flgCancellato;
    private LocalDateTime dataCancellazione;
    private Long version;

    public TabGuidaIdeTransazioneFilter() {
    }

    public TabGuidaIdeTransazioneFilter(@JsonProperty("id") String id,
                                        @JsonProperty("idFormePagamento") String idFormePagamento,
                                        @JsonProperty("lista_01") String lista_01,
                                        @JsonProperty("padDir_01") String padDir_01,
                                        @JsonProperty("padChr_01") String padChr_01,
                                        @JsonProperty("posField_01") Integer posField_01,
                                        @JsonProperty("lenField_01") Integer lenField_01,
                                        @JsonProperty("flgEan_01") String flgEan_01,
                                        @JsonProperty("tipoField_01") String tipoField_01,
                                        @JsonProperty("ctrlField_01") String ctrlField_01,
                                        @JsonProperty("suggField_01") String suggField_01,
                                        @JsonProperty("lista_02")  String lista_02,
                                        @JsonProperty("padDir_02") String padDir_02,
                                        @JsonProperty("padChr_02") String padChr_02,
                                        @JsonProperty("posField_02") Integer posField_02,
                                        @JsonProperty("lenField_02") Integer lenField_02,
                                        @JsonProperty("flgEan_02") String flgEan_02,
                                        @JsonProperty("tipoField_02") String tipoField_02,
                                        @JsonProperty("ctrlField_02") String ctrlField_02,
                                        @JsonProperty("suggField_02") String suggField_02,
                                        @JsonProperty("lista_03") String lista_03,
                                        @JsonProperty("padDir_03") String padDir_03,
                                        @JsonProperty("padChr_03")  String padChr_03,
                                        @JsonProperty("posField_03") Integer posField_03,
                                        @JsonProperty("lenField_03") Integer lenField_03,
                                        @JsonProperty("flgEan_03") String flgEan_03,
                                        @JsonProperty("tipoField_03") String tipoField_03,
                                        @JsonProperty("ctrlField_03") String ctrlField_03,
                                        @JsonProperty("suggField_03") String suggField_03,
                                        @JsonProperty("lista_04") String lista_04,
                                        @JsonProperty("padDir_04")  String padDir_04,
                                        @JsonProperty("padChr_04")  String padChr_04,
                                        @JsonProperty("posField_04") Integer posField_04,
                                        @JsonProperty("lenField_04") Integer lenField_04,
                                        @JsonProperty("flgEan_04")  String flgEan_04,
                                        @JsonProperty("tipoField_04")  String tipoField_04,
                                        @JsonProperty("ctrlField_04") String ctrlField_04,
                                        @JsonProperty("suggField_04") String suggField_04,
                                        @JsonProperty("flgEanAltro") String flgEanAltro,
                                        @JsonProperty("descAltro") String descAltro,
                                        @JsonProperty("lenEan")  String lenEan,
                                        @JsonProperty("flgCancellato")  String flgCancellato,
                                        @JsonProperty("dataCancellazione")  LocalDateTime dataCancellazione,
                                        @JsonProperty("version")  Long version) {
        this.id = id;
        this.idFormePagamento = idFormePagamento;
        this.lista_01 = lista_01;
        this.padDir_01 = padDir_01;
        this.padChr_01 = padChr_01;
        this.posField_01 = posField_01;
        this.lenField_01 = lenField_01;
        this.flgEan_01 = flgEan_01;
        this.tipoField_01 = tipoField_01;
        this.ctrlField_01 = ctrlField_01;
        this.suggField_01 = suggField_01;
        this.lista_02 = lista_02;
        this.padDir_02 = padDir_02;
        this.padChr_02 = padChr_02;
        this.posField_02 = posField_02;
        this.lenField_02 = lenField_02;
        this.flgEan_02 = flgEan_02;
        this.tipoField_02 = tipoField_02;
        this.ctrlField_02 = ctrlField_02;
        this.suggField_02 = suggField_02;
        this.lista_03 = lista_03;
        this.padDir_03 = padDir_03;
        this.padChr_03 = padChr_03;
        this.posField_03 = posField_03;
        this.lenField_03 = lenField_03;
        this.flgEan_03 = flgEan_03;
        this.tipoField_03 = tipoField_03;
        this.ctrlField_03 = ctrlField_03;
        this.suggField_03 = suggField_03;
        this.lista_04 = lista_04;
        this.padDir_04 = padDir_04;
        this.padChr_04 = padChr_04;
        this.posField_04 = posField_04;
        this.lenField_04 = lenField_04;
        this.flgEan_04 = flgEan_04;
        this.tipoField_04 = tipoField_04;
        this.ctrlField_04 = ctrlField_04;
        this.suggField_04 = suggField_04;
        this.flgEanAltro = flgEanAltro;
        this.descAltro = descAltro;
        this.lenEan = lenEan;
        this.flgCancellato = flgCancellato;
        this.dataCancellazione = dataCancellazione;
        this.version = version;
    }
    public static TabGuidaIdeTransazioneFilter createFilterFromMap(Object obj) {
        LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) obj;
        TabGuidaIdeTransazioneFilter filter = new TabGuidaIdeTransazioneFilter();
        if(map != null){
            filter.setId((String) map.get("id"));
            filter.setIdFormePagamento((String) map.get("idFormePagamento"));
            filter.setLista_01((String) map.get("lista_01"));
            filter.setPadDir_01((String) map.get("padDir_01"));
            filter.setPadChr_01((String) map.get("padChr_01"));
            filter.setPosField_01((Integer) map.get("posField_01"));
            filter.setLenField_01((Integer) map.get("lenField_01"));
            filter.setFlgEan_01((String) map.get("flgEan_01"));
            filter.setTipoField_01((String) map.get("tipoField_01"));
            filter.setCtrlField_01((String) map.get("ctrlField_01"));
            filter.setSuggField_01((String) map.get("suggField_01"));
            filter.setLista_02((String) map.get("lista_02"));
            filter.setPadDir_02((String) map.get("padDir_02"));
            filter.setPadChr_02((String) map.get("padChr_02"));
            filter.setPosField_02((Integer) map.get("posField_02"));
            filter.setLenField_02((Integer) map.get("lenField_02"));
            filter.setFlgEan_02((String) map.get("flgEan_02"));
            filter.setTipoField_02((String) map.get("tipoField_02"));
            filter.setCtrlField_02((String) map.get("ctrlField_02"));
            filter.setSuggField_02((String) map.get("suggField_02"));
            filter.setLista_03((String) map.get("lista_03"));
            filter.setPadDir_03((String) map.get("padDir_03"));
            filter.setPadChr_03((String) map.get("padChr_03"));
            filter.setPosField_03((Integer) map.get("posField_03"));
            filter.setLenField_03((Integer) map.get("lenField_03"));
            filter.setFlgEan_03((String) map.get("flgEan_03"));
            filter.setTipoField_03((String) map.get("tipoField_03"));
            filter.setCtrlField_03((String) map.get("ctrlField_03"));
            filter.setSuggField_03((String) map.get("suggField_03"));
            filter.setLista_04((String) map.get("lista_04"));
            filter.setPadDir_04((String) map.get("padDir_04"));
            filter.setPadChr_04((String) map.get("padChr_04"));
            filter.setPosField_04((Integer) map.get("posField_04"));
            filter.setLenField_04((Integer) map.get("lenField_04"));
            filter.setFlgEan_04((String) map.get("flgEan_04"));
            filter.setTipoField_04((String) map.get("tipoField_04"));
            filter.setCtrlField_04((String) map.get("ctrlField_04"));
            filter.setSuggField_04((String) map.get("suggField_04"));
            filter.setFlgEanAltro((String) map.get("flgEanAltro"));
            filter.setDescAltro((String) map.get("descAltro"));
            filter.setLenEan((String) map.get("lenEan"));

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

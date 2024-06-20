package com.retexspa.xr.ms.ledger.main.core.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.time.LocalDateTime;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Getter
@Setter
public class TabGuidaIdeTransazioneQueryDTO {
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
}

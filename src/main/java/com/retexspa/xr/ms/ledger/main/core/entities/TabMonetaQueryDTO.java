package com.retexspa.xr.ms.ledger.main.core.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;
import lombok.Getter;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Getter
@Setter
public class TabMonetaQueryDTO {
    private String id;

    private String idValuta;

    private String tipoMoneta;

    private String taglioCassetto;

    private String descrizioneTaglio;

    private BigDecimal valoreUnitario;

    private BigDecimal valoreTubetto;

    private String flgOrdini;

    private String flgCassaforte;

    private String flgContasoldiCm;

    private String flgContasoldiHm;

    private String flgContasoldiVb;

    private String flgContasoldiCb;

    private String flgInvioBanca;

    private String flgCancellato;

    private LocalDateTime dataCancellazione;

    private Long version;

}

package com.retexspa.xr.ms.ledger.main.core.dto.tabCircuitiCarte;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.ledger.main.core.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
public class TabCircuitiCarteBaseDTO extends BaseDTO {

    @NotNull(message = "idFormePagamento is mandatory")
    @NotEmpty(message = "idFormePagamento is mandatory")
    @NotBlank(message = "idFormePagamento is mandatory")
    private String idFormePagamento;

    @NotNull(message = "idTipiOpe is mandatory")
    @NotEmpty(message = "idTipiOpe is mandatory")
    @NotBlank(message = "idTipiOpe is mandatory")
    private String tipoCarta;

    @NotNull(message = "ordineStampa is mandatory")
    private Integer ordineStampa;

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }
    public static String getAggregateName(){
        return "TabCircuitiCarteAggregate";
    }
    public static String getName(){
        return "TabCircuitiCarte";
    }
}

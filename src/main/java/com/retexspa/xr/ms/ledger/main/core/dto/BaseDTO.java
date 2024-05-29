package com.retexspa.xr.ms.ledger.main.core.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.retexspa.xr.ms.main.core.dto.Enums;
import com.retexspa.xr.ms.main.core.helpers.EnumValidator;

import javax.persistence.Column;
import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BaseDTO {
    public BaseDTO() {
    }

    @Column(name="flg_cancellato")
    @EnumValidator(enumClazz = Enums.CheckSN.class, message = "FlgCancellato not valid")
    private String flgCancellato;
    private LocalDateTime dataCancellazione;

    public String getFlgCancellato() {
        return flgCancellato;
    }

    public void setFlgCancellato(String flgCancellato) {
        this.flgCancellato = flgCancellato;
    }

    @Override
    public String toString() {
        // add JSON processing exception handling, dropped for readability
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return this.toString();
    }




}


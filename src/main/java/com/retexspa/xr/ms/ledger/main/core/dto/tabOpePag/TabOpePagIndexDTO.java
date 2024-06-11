package com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class TabOpePagIndexDTO {
    private String tabOpePagId;
    private LinkedList<String> regDettChiusureOpe01Ids;
    private LinkedList<String> regDettChiusureOpe02Ids;
    private LinkedList<String> regDettChiusureOpe03Ids;
    private LinkedList<String> regDettChiusureOpe04Ids;
    private LinkedList<String> regRigaDistintaFinIds;
    public TabOpePagIndexDTO() {
    }

    public TabOpePagIndexDTO(String tabOpePagId) {
        this.tabOpePagId = tabOpePagId;
    }
    public static String getIdFromTabOpePag(String tabOpePagId) {
        return UUID.nameUUIDFromBytes(("/TabOpePagIndex/" + tabOpePagId).getBytes()).toString();
    }
    public static String getDetailNameRegDettChiusureOpe01() {
        return "regDettChiusureOpe01Ids";
    }
    public static String getDetailNameRegDettChiusureOpe02() {
        return "regDettChiusureOpe02Ids";
    }
    public static String getDetailNameRegDettChiusureOpe03() {
        return "regDettChiusureOpe03Ids";
    }
    public static String getDetailNameRegDettChiusureOpe04() {
        return "regDettChiusureOpe04Ids";
    }
    public static String getDetailNameRegRigaDistintaFin() {
        return "regRigaDistintaFinIds";
    }
}

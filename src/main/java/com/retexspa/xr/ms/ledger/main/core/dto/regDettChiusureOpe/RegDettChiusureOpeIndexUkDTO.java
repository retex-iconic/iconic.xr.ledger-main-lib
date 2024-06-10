package com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureOpe;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegDettChiusureOpeIndexUkDTO extends AggregateIndexUkBaseDTO {

    List<String> opePag1UkList;
    List<String> opePag2UkList;
    List<String> opePag3UkList;
    List<String> opePag4UkList;
    public RegDettChiusureOpeIndexUkDTO() {
    }
    public static String getUkOpePag1(String idRigaChiOpe, String opePagC01) {
        String uk = idRigaChiOpe +  RegDettChiusureOpeIndexUkDTO.getUkSeparator() + opePagC01;
        return uk;
    }

    public static String getUkOpePag2(String idRigaChiOpe, String opePagC02) {
        String uk = idRigaChiOpe +  RegDettChiusureOpeIndexUkDTO.getUkSeparator() + opePagC02;
        return uk;
    }

    public static String getUkOpePag3(String idRigaChiOpe, String opePagC03) {
        String uk = idRigaChiOpe +  RegDettChiusureOpeIndexUkDTO.getUkSeparator() + opePagC03;
        return uk;
    }

    public static String getUkOpePag4(String idRigaChiOpe, String opePagC04) {
        String uk = idRigaChiOpe +  RegDettChiusureOpeIndexUkDTO.getUkSeparator() + opePagC04;
        return uk;
    }

    public static String getIndexName() {
        return "RegDettChiusureOpeIndexUk";
    }

    public static String getIndexAggregateName() {
        return "RegDettChiusureOpeIndexUkAggregate";
    }

}

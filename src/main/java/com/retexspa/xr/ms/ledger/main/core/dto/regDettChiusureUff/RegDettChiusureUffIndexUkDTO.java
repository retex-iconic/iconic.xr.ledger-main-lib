package com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureUff;

import com.retexspa.xr.ms.main.core.dto.AggregateIndexUkBaseDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class RegDettChiusureUffIndexUkDTO  extends AggregateIndexUkBaseDTO {
    List<String> opePag1UkList;
    List<String> opePag2UkList;
    public RegDettChiusureUffIndexUkDTO() {
    }
    public static String getUkOpePag1(String idRigaChiUff, String opePagC01) {
        String uk = idRigaChiUff +  RegDettChiusureUffIndexUkDTO.getUkSeparator() + opePagC01;
        return uk;
    }

    public static String getUkOpePag2(String idRigaChiUff, String opePagC02) {
        String uk = idRigaChiUff +  RegDettChiusureUffIndexUkDTO.getUkSeparator() + opePagC02;
        return uk;
    }

    public static String getIndexName() {
        return "RegDettChiusureUffIndexUk";
    }

    public static String getIndexAggregateName() {
        return "RegDettChiusureUffIndexUkAggregate";
    }

}

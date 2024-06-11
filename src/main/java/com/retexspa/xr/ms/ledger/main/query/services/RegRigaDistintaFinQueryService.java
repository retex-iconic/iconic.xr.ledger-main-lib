package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegRigaDistintaFinFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regRigaDistintaFin.RegRigaDistintaFinResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegRigaDistintaFinQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface RegRigaDistintaFinQueryService {
    Page<RegRigaDistintaFinQueryEntity> searchQueryRegRigaDistintaFin(GenericSearchRequest<RegRigaDistintaFinFilter> query);
    RegRigaDistintaFinResponse searchRegRigaDistintaFin(GenericSearchRequest<RegRigaDistintaFinFilter> query);
}

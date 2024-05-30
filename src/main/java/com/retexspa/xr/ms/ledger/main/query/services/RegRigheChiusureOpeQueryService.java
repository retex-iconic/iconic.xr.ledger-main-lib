package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegRigheChiusureOpeFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regRigheChiusureOpe.RegRigheChiusureOpeResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegRigheChiusureOpeQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface RegRigheChiusureOpeQueryService {

    Page<RegRigheChiusureOpeQueryEntity> searchQueryRegRigheChiusureOpe(GenericSearchRequest<RegRigheChiusureOpeFilter> query);
    RegRigheChiusureOpeResponse searchRegRigheChiusureOpe(GenericSearchRequest<RegRigheChiusureOpeFilter> query);
}

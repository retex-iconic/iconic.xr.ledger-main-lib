package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegRigheChiusureUffFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regRigheChiusureUff.RegRigheChiusureUffResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegRigheChiusureUffQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface RegRigheChiusureUffQueryService {

    Page<RegRigheChiusureUffQueryEntity> searchQueryRegRigheChiusureUff(GenericSearchRequest<RegRigheChiusureUffFilter> query);
    RegRigheChiusureUffResponse searchRegRigheChiusureUff(GenericSearchRequest<RegRigheChiusureUffFilter> query);
}

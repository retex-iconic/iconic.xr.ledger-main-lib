package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegDettChiusureUffFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regDettChiusureUff.RegDettChiusureUffResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureUffQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface RegDettChiusureUffQueryService {
    Page<RegDettChiusureUffQueryEntity> searchQueryRegDettChiusureUff(GenericSearchRequest<RegDettChiusureUffFilter> query);
    RegDettChiusureUffResponse searchRegDettChiusureUff(GenericSearchRequest<RegDettChiusureUffFilter> query);
}

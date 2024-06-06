package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.RegDettChiusureOpeFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.regDettChiusureOpe.RegDettChiusureOpeResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureOpeQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface RegDettChiusureOpeQueryService {

    Page<RegDettChiusureOpeQueryEntity> searchQueryRegDettChiusureOpe(GenericSearchRequest<RegDettChiusureOpeFilter> query);
    RegDettChiusureOpeResponse searchRegDettChiusureOpe(GenericSearchRequest<RegDettChiusureOpeFilter> query);
}

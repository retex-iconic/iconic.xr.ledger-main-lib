package com.retexspa.xr.ms.ledger.main.query.services;

import com.retexspa.xr.ms.ledger.main.core.filterRequest.DecodeCircuitoCartaFilter;
import com.retexspa.xr.ms.ledger.main.core.responses.decodeCircuitoCarta.DecodeCircuitoCartaResponse;
import com.retexspa.xr.ms.ledger.main.query.entities.DecodeCircuitoCartaQueryEntity;
import com.retexspa.xr.ms.main.core.queries.GenericSearchRequest;
import org.springframework.data.domain.Page;

public interface DecodeCircuitoCartaQueryService {

    Page<DecodeCircuitoCartaQueryEntity> searchQueryDecodeCircuitoCarta(GenericSearchRequest<DecodeCircuitoCartaFilter> query);
    DecodeCircuitoCartaResponse searchDecodeCircuitoCarta(GenericSearchRequest<DecodeCircuitoCartaFilter> query);
}

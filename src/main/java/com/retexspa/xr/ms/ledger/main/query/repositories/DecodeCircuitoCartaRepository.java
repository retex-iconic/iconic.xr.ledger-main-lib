package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.DecodeCircuitoCartaQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DecodeCircuitoCartaRepository  extends JpaRepository<DecodeCircuitoCartaQueryEntity, String>, JpaSpecificationExecutor<DecodeCircuitoCartaQueryEntity> {
}



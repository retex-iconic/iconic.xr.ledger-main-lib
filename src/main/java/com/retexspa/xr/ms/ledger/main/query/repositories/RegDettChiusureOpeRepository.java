package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureOpeQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegDettChiusureOpeRepository extends JpaRepository<RegDettChiusureOpeQueryEntity, String>,
        JpaSpecificationExecutor<RegDettChiusureOpeQueryEntity> {
}
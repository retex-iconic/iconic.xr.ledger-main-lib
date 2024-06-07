package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.RegTestDistintaFinQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegTestDistintaFinRepository extends JpaRepository<RegTestDistintaFinQueryEntity, String>, JpaSpecificationExecutor<RegTestDistintaFinQueryEntity> {
}

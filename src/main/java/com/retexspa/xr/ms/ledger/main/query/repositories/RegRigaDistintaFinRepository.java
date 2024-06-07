package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.RegRigaDistintaFinQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegRigaDistintaFinRepository extends JpaRepository<RegRigaDistintaFinQueryEntity, String>, JpaSpecificationExecutor<RegRigaDistintaFinQueryEntity> {
}

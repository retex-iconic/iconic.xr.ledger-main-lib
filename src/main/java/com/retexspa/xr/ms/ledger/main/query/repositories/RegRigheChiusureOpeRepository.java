package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.RegRigheChiusureOpeQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegRigheChiusureOpeRepository extends JpaRepository<RegRigheChiusureOpeQueryEntity, String>,
        JpaSpecificationExecutor<RegRigheChiusureOpeQueryEntity> {
}

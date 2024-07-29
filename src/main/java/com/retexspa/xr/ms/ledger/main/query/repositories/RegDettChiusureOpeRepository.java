package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureOpeQueryEntity;
import com.retexspa.xr.ms.ledger.main.query.entities.RegRigheChiusureOpeQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface RegDettChiusureOpeRepository extends JpaRepository<RegDettChiusureOpeQueryEntity, String>,
        JpaSpecificationExecutor<RegDettChiusureOpeQueryEntity> {
   List<RegDettChiusureOpeQueryEntity> findAllByRigaChiOpeId(String rigaChiOpeId);
}

package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.RegRigheChiusureUffQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegRigheChiusureUffRepository  extends JpaRepository<RegRigheChiusureUffQueryEntity, String>, JpaSpecificationExecutor<RegRigheChiusureUffQueryEntity> {
}

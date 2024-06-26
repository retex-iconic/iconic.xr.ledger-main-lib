package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureUffQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegDettChiusureUffRepository extends JpaRepository<RegDettChiusureUffQueryEntity, String>,
        JpaSpecificationExecutor<RegDettChiusureUffQueryEntity> {
}

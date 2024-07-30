package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.RegDettChiusureUffQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface RegDettChiusureUffRepository extends JpaRepository<RegDettChiusureUffQueryEntity, String>,
        JpaSpecificationExecutor<RegDettChiusureUffQueryEntity> {
    List<RegDettChiusureUffQueryEntity> findAllByRigaChiUffId(String id);
}

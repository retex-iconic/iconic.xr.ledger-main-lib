package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiOpeQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TabTipiOpeRepository  extends JpaRepository<TabTipiOpeQueryEntity, String>, JpaSpecificationExecutor<TabTipiOpeQueryEntity> {
}

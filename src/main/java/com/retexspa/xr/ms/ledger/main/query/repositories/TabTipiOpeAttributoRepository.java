package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiOpeAttributoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TabTipiOpeAttributoRepository extends JpaRepository<TabTipiOpeAttributoQueryEntity, String>,
        JpaSpecificationExecutor<TabTipiOpeAttributoQueryEntity> {


    List<TabTipiOpeAttributoQueryEntity> findByTabTipiOpeIdAndAttributoId(
            String id, String attributoId);

    void deleteByTabTipiOpeIdAndAttributoId(String id, String attributoId);
}


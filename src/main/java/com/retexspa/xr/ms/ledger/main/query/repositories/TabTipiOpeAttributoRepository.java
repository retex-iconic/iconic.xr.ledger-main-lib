package com.retexspa.xr.ms.ledger.main.query.repositories;


import com.retexspa.xr.ms.ledger.main.query.entities.TabTipiOpeAttributoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface TabTipiOpeAttributoRepository extends JpaRepository<TabTipiOpeAttributoQueryEntity, String>,
        JpaSpecificationExecutor<TabTipiOpeAttributoQueryEntity> {


    Optional<TabTipiOpeAttributoQueryEntity> findByTabTipiOpeIdAndAttributoId(
            String id, String attributoId);
    List<TabTipiOpeAttributoQueryEntity> findByAttributoId(String attributoId);
    List<TabTipiOpeAttributoQueryEntity> findByTabTipiOpeId(String id);
    void deleteByTabTipiOpeIdAndAttributoId(String id, String attributoId);
}


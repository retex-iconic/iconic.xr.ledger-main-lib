package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabOpePagAttributoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface TabOpePagAttributoRepository extends JpaRepository<TabOpePagAttributoQueryEntity, String>,
        JpaSpecificationExecutor<TabOpePagAttributoQueryEntity> {


    Optional<TabOpePagAttributoQueryEntity> findByTabOpePagIdAndAttributoId(
            String id, String attributoId);
  List<TabOpePagAttributoQueryEntity> findByTabOpePagId(String id);
    void deleteByTabOpePagIdAndAttributoId(String id, String attributoId);
}

package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.TabOpePagAttributoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TabOpePagAttributoRepository extends JpaRepository<TabOpePagAttributoQueryEntity, String>,
        JpaSpecificationExecutor<TabOpePagAttributoQueryEntity> {


    List<TabOpePagAttributoQueryEntity> findByTabOpePagIdAndAttributoId(
            String id, String attributoId);
    List<TabOpePagAttributoQueryEntity>  findByAttributoId(String attributoId);
    void deleteByTabOpePagIdAndAttributoId(String id, String attributoId);
}

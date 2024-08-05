package com.retexspa.xr.ms.ledger.main.query.repositories;

import com.retexspa.xr.ms.ledger.main.query.entities.RegTestDistintaFinAttributoQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface RegTestDistintaFinAttributoRepository extends JpaRepository<RegTestDistintaFinAttributoQueryEntity, String>,
        JpaSpecificationExecutor<RegTestDistintaFinAttributoQueryEntity> {


    Optional<RegTestDistintaFinAttributoQueryEntity> findByRegTestDistintaFinIdAndAttributoId(
            String id, String attributoId);
    List<RegTestDistintaFinAttributoQueryEntity> findByRegTestDistintaFinId(String id);
    List<RegTestDistintaFinAttributoQueryEntity> findByAttributoId(String attributoId);
    void deleteByRegTestDistintaFinIdAndAttributoId(String id, String attributoId);
}

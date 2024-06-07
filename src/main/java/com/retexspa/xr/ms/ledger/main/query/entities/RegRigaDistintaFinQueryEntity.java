package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.regRigaDistintaFin.RegRigaDistintaFinBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "regRigaDistintaFin")
@Getter
@Setter
public class RegRigaDistintaFinQueryEntity {
    @Id @NonNull private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_riga_dist_fin", referencedColumnName = "id")
    private RegTestDistintaFinQueryEntity rigaDistFin;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ ope_pag", referencedColumnName = "id")
    private TabOpePagQueryEntity opePag;
    @Column(name = "segno")
    private String segno;
    @Column(name = "flgCancellato")
    private String flgCancellato;
    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;
    @Column(name = "version")
    private Long version;

    public RegRigaDistintaFinQueryEntity() {
    }

    public RegRigaDistintaFinQueryEntity(@NonNull String id, RegRigaDistintaFinBaseDTO data,Long version) {
        this.id = id;
        this.segno = data.getSegno();
        this.flgCancellato = data.getFlgCancellato();
        this.version = version;
    }
}


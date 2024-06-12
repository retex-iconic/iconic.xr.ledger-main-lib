package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureUff.RegDettChiusureUffBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "regDettChiusureUff")
@Getter
@Setter
public class RegDettChiusureUffQueryEntity {
    @Id @NonNull private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_riga_chi_uff", referencedColumnName = "id")
    private RegRigheChiusureUffQueryEntity rigaChiUff;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ope_pag_c01", referencedColumnName = "id")
    private TabOpePagQueryEntity opePagC01;
    @Column(name = "segno_c01")
    private String segnoC01;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ope_pag_c02", referencedColumnName = "id")
    private TabOpePagQueryEntity opePagC02;
    @Column(name = "segno_c02")
    private String segnoC02;
    @Column(name = "flgCancellato")
    private String flgCancellato;
    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;
    @Column(name = "version")
    private Long version;

    public RegDettChiusureUffQueryEntity() {
    }

    public RegDettChiusureUffQueryEntity(@NonNull String id, RegDettChiusureUffBaseDTO data, Long version) {
        this.id = id;
        this.segnoC01 = data.getSegnoC01();
        this.segnoC02 = data.getSegnoC02();
        this.flgCancellato = data.getFlgCancellato();
        this.version = version;
    }
}

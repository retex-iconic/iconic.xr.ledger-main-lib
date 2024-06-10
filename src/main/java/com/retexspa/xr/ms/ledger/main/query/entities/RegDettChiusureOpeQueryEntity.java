package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.regDettChiusureOpe.RegDettChiusureOpeBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "regDettChiusureOpe")
@Getter
@Setter
public class RegDettChiusureOpeQueryEntity {
    @Id
    @NonNull
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_riga_chi_ope", referencedColumnName = "id")
    private RegRigheChiusureOpeQueryEntity rigaChiOpe;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ope_pag_c03", referencedColumnName = "id")
    private TabOpePagQueryEntity opePagC03;

    @Column(name = "segno_c03")
    private String segnoC03;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ope_pag_c04", referencedColumnName = "id")
    private TabOpePagQueryEntity opePagC04;

    @Column(name = "segno_c04")
    private String segnoC04;

    @Column(name = "flg_cancellato")
    private String flgCancellato;

    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;

    @Column(name = "version")
    private Long version;

    public RegDettChiusureOpeQueryEntity() {
    }

    public RegDettChiusureOpeQueryEntity(
            @NonNull String id,
            RegDettChiusureOpeBaseDTO data,
            Long version) {
        this.id = id;
        this.segnoC01 = data.getSegnoC01();
        this.segnoC02 = data.getSegnoC02();
        this.segnoC03 = data.getSegnoC03();
        this.segnoC04 = data.getSegnoC04();
        this.flgCancellato = data.getFlgCancellato();
        this.version = version;
    }
}

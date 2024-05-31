package com.retexspa.xr.ms.ledger.main.query.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.retexspa.xr.ms.ledger.main.core.dto.tabTipiOpe.TabTipiOpeBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tabTipiOpe")
@Getter
@Setter
public class TabTipiOpeQueryEntity {
    @Id @NonNull private String id;
    @Column(name = "codTipope")
    private Integer codTipope;
    @Column(name = "desTipope_b")
    private String desTipopeB;
    @Column(name = "desTipope_l")
    private String desTipopeL;
    @Column(name = "flgCassaForte")
    private String flgCassaForte;
    @Column(name = "flgBarriera")
    private String flgBarriera;
    @Column(name = "flgRichiestaUg")
    private String flgRichiestaUg;
    @Column(name = "flgRichiestaCassiere")
    private String flgRichiestaCassiere;
    @Column(name = "variazioneFondoCassa")
    private String variazioneFondoCassa;
    @Column(name = "segnoModificaVenduto")
    private String segnoModificaVenduto;
    @Column(name = "flgVersamento")
    private String flgVersamento;
    @Column(name = "flgServizio")
    private String flgServizio;
    @Column(name = "flgUfficio")
    private String flgUfficio;
    @Column(name = "flgCancellato")
    private String flgCancellato;
    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tabTipiOpe")
    @JsonIgnore
    private List<TabTipiOpeAttributoQueryEntity> attributi;
    @Column(name = "version")
    private Long version;
    public TabTipiOpeQueryEntity() {
    }

    public TabTipiOpeQueryEntity(
            @NonNull String id,
            TabTipiOpeBaseDTO data,
            Long version)  {
        this.id = id;
        this.codTipope = data.getCodTipope();
        this.desTipopeB = data.getDesTipopeB();
        this.desTipopeL = data.getDesTipopeL();
        this.flgCassaForte = data.getFlgCassaForte();
        this.flgBarriera = data.getFlgBarriera();
        this.flgRichiestaUg = data.getFlgRichiestaUg();
        this.flgRichiestaCassiere = data.getFlgRichiestaCassiere();
        this.variazioneFondoCassa = data.getVariazioneFondoCassa();
        this.segnoModificaVenduto = data.getSegnoModificaVenduto();
        this.flgVersamento = data.getFlgVersamento();
        this.flgServizio = data.getFlgServizio();
        this.flgUfficio = data.getFlgUfficio();
        this.flgCancellato = data.getFlgCancellato();
        this.version =version;
    }
}

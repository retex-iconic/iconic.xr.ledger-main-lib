package com.retexspa.xr.ms.ledger.main.query.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.retexspa.xr.ms.ledger.main.core.dto.tabOpePag.TabOpePagBaseDTO;
import com.retexspa.xr.ms.ledger.main.core.dto.tabTipiOpe.TabTipiOpeBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tabOpePag")
@Getter
@Setter
public class TabOpePagQueryEntity {
    @Id @NonNull private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_forme_pagamento", referencedColumnName = "id")
     private TabFormePagamentoQueryEntity formePagamento;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipi_ope", referencedColumnName = "id")
     private TabTipiOpeQueryEntity tipiOpe;
    @Column(name = "desOpepag_b")
    private String desOpepagB;
    @Column(name = "desOpepag_l")
    private String desOpepagL;
    @Column(name = "flgDettDistFin")
    private String flgDettDistFin;
    @Column(name = "numRappFin")
    private Integer numRappFin;
    @Column(name = "flgMovChiusura")
    private String flgMovChiusura;
    @Column(name = "flgMovUfficio")
    private String flgMovUfficio;
    @Column(name = "flgRetChiusura")
    private String flgRetChiusura;
    @Column(name = "flgRetFpag")
    private String flgRetFpag;
    @Column(name = "flgTnvMovRfsComm")
    private String flgTnvMovRfsComm;
    @Column(name = "flgTnvMovIva")
    private String flgTnvMovIva;
    @Column(name = "flgDettDistFinMod")
    private String flgDettDistFinMod;
    @Column(name = "flgMovInserimento")
    private String flgMovInserimento;
    @Column(name = "flgCertifIncassi")
    private String flgCertifIncassi;
    @Column(name = "flgCancellato")
    private String flgCancellato;
    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tabOpePag")
    @JsonIgnore
    private List<TabOpePagAttributoQueryEntity> attributi;
    @Column(name = "version")
    private Long version;
    public TabOpePagQueryEntity() {
    }

    public TabOpePagQueryEntity(
            @NonNull String id,
            TabOpePagBaseDTO data,
            Long version)  {
        this.id = id;
        this.desOpepagB = data.getDesOpepagB();
        this.desOpepagL = data.getDesOpepagL();
        this.flgDettDistFin = data.getFlgDettDistFin();
        this.numRappFin = data.getNumRappFin();
        this.flgMovChiusura = data.getFlgMovChiusura();
        this.flgMovUfficio = data.getFlgMovUfficio();
        this.flgRetChiusura = data.getFlgRetChiusura();
        this.flgRetFpag = data.getFlgRetFpag();
        this.flgTnvMovRfsComm = data.getFlgTnvMovRfsComm();
        this.flgTnvMovIva = data.getFlgTnvMovIva();
        this.flgDettDistFinMod = data.getFlgDettDistFinMod();
        this.flgMovInserimento = data.getFlgMovInserimento();
        this.flgCertifIncassi = data.getFlgCertifIncassi();
        this.flgCancellato =data.getFlgCancellato();
        this.version =version;
    }
}

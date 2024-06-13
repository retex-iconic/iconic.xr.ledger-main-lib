package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.tabGuidaIdeTransazione.TabGuidaIdeTransazioneBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tabGuidaIdeTransazione")
@Getter
@Setter
public class TabGuidaIdeTransazioneQueryEntity {
    @Id @NonNull private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_forme_pagamento", referencedColumnName = "id")
    private TabFormePagamentoQueryEntity formePagamento;
    @Column(name = "lista_01")
    private String lista_01;
    @Column(name = "padDir_01")
    private String padDir_01;
    @Column(name = "padChr_01")
    private String padChr_01;
    @Column(name = "posField_01")
    private Integer posField_01;
    @Column(name = "lenField_01")
    private Integer lenField_01;
    @Column(name = "flgEan_01")
    private String flgEan_01;
    @Column(name = "tipoField_01")
    private String tipoField_01;
    @Column(name = "ctrlField_01")
    private String ctrlField_01;
    @Column(name = "suggField_01")
    private String suggField_01;
    @Column(name = "lista_02")
    private String lista_02;
    @Column(name = "padDir_02")
    private String padDir_02;
    @Column(name = "padChr_02")
    private String padChr_02;
    @Column(name = "posField_02")
    private Integer posField_02;
    @Column(name = "lenField_02")
    private Integer lenField_02;
    @Column(name = "flgEan_02")
    private String flgEan_02;
    @Column(name = "tipoField_02")
    private String tipoField_02;
    @Column(name = "ctrlField_02")
    private String ctrlField_02;
    @Column(name = "suggField_02")
    private String suggField_02;
    @Column(name = "lista_03")
    private String lista_03;
    @Column(name = "padDir_03")
    private String padDir_03;
    @Column(name = "padChr_03")
    private String padChr_03;
    @Column(name = "posField_03")
    private Integer posField_03;
    @Column(name = "lenField_03")
    private Integer lenField_03;
    @Column(name = "flgEan_03")
    private String flgEan_03;
    @Column(name = "tipoField_03")
    private String tipoField_03;
    @Column(name = "ctrlField_03")
    private String ctrlField_03;
    @Column(name = "suggField_03")
    private String suggField_03;
    @Column(name = "lista_04")
    private String lista_04;
    @Column(name = "padDir_04")
    private String padDir_04;
    @Column(name = "padChr_04")
    private String padChr_04;
    @Column(name = "posField_04")
    private Integer posField_04;
    @Column(name = "lenField_04")
    private Integer lenField_04;
    @Column(name = "flgEan_04")
    private String flgEan_04;
    @Column(name = "tipoField_04")
    private String tipoField_04;
    @Column(name = "ctrlField_04")
    private String ctrlField_04;
    @Column(name = "suggField_04")
    private String suggField_04;
    @Column(name = "flgEanAltro")
    private String flgEanAltro;
    @Column(name = "descAltro")
    private String descAltro;
    @Column(name = "lenEan")
    private String lenEan;
    @Column(name = "flgCancellato")
    private String flgCancellato;
    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;
    @Column(name = "version")
    private Long version;

    public TabGuidaIdeTransazioneQueryEntity() {
    }

    public TabGuidaIdeTransazioneQueryEntity(@NonNull String id,
                                             TabGuidaIdeTransazioneBaseDTO data,
                                             Long version) {
        this.id = id;
        this.lista_01 = data.getLista_01();
        this.padDir_01 = data.getPadDir_01();
        this.padChr_01 = data.getPadChr_01();
        this.posField_01 = data.getPosField_01();
        this.lenField_01 = data.getLenField_01();
        this.flgEan_01 = data.getFlgEan_01();
        this.tipoField_01 = data.getTipoField_01();
        this.ctrlField_01 = data.getCtrlField_01();
        this.suggField_01 = data.getSuggField_01();
        this.lista_02 = data.getLista_02();
        this.padDir_02 = data.getPadDir_02();
        this.padChr_02 = data.getPadChr_02();
        this.posField_02 = data.getPosField_02();
        this.lenField_02 = data.getLenField_02();
        this.flgEan_02 = data.getFlgEan_02();
        this.tipoField_02 = data.getTipoField_02();
        this.ctrlField_02 = data.getCtrlField_02();
        this.suggField_02 = data.getSuggField_02();
        this.lista_03 = data.getLista_03();
        this.padDir_03 = data.getPadDir_03();
        this.padChr_03 = data.getPadChr_03();
        this.posField_03 = data.getPosField_03();
        this.lenField_03 = data.getLenField_03();
        this.flgEan_03 = data.getFlgEan_03();
        this.tipoField_03 = data.getTipoField_03();
        this.ctrlField_03 = data.getCtrlField_03();
        this.suggField_03 = data.getSuggField_03();
        this.lista_04 = data.getLista_04();
        this.padDir_04 = data.getPadDir_04();
        this.padChr_04 = data.getPadChr_04();
        this.posField_04 = data.getPosField_04();
        this.lenField_04 = data.getLenField_04();
        this.flgEan_04 = data.getFlgEan_04();
        this.tipoField_04 = data.getTipoField_04();
        this.ctrlField_04 = data.getCtrlField_04();
        this.suggField_04 = data.getSuggField_04();
        this.flgEanAltro = data.getFlgEanAltro();
        this.descAltro = data.getDescAltro();
        this.lenEan = data.getLenEan();
        this.flgCancellato = data.getFlgCancellato();
        this.version = version;
    }
}

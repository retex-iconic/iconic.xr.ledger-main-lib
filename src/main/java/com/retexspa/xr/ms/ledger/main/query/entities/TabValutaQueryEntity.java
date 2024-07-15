package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.tabValuta.TabValutaBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_valuta")
@Getter
@Setter
public class TabValutaQueryEntity {
    @Id
    @NonNull
    private String id;

    @Column(name = "codValuta")
    private String codValuta;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "flgValutaPrevalente")
    private String flgValutaPrevalente;

    @Column(name = "flgCambioFisso")
    private String flgCambioFisso;

    @Column(name = "flgAbilitazioneOrdini")
    private String flgAbilitazioneOrdini;

    @Column(name = "importoCambioValPrev")
    private BigDecimal importoCambioValPrev;

    @Column(name = "numeroDecimali")
    private Integer numeroDecimali;

    @Column(name = "formato")
    private String formato;

    @Column(name = "version")
    private Long version;

    @Column(name = "dataCancellazione")
    private LocalDateTime dataCancellazione;

    @Column(name = "flgCancellato")
    private String flgCancellato;

    public TabValutaQueryEntity() {
    }

    public TabValutaQueryEntity(@NonNull String id,
                                TabValutaBaseDTO data,
                                       Long version) {
        this.id = id;
        this.codValuta = data.getCodValuta();
        this.nome = data.getNome();
        this.descrizione = data.getDescrizione();
        this.flgValutaPrevalente = data.getFlgValutaPrevalente();
        this.flgCambioFisso = data.getFlgCambioFisso();
        this.flgAbilitazioneOrdini = data.getFlgAbilitazioneOrdini();
        this.importoCambioValPrev = data.getImportoCambioValPrev();
        this.numeroDecimali = data.getNumeroDecimali();
        this.formato = data.getFormato();
        this.flgCancellato =data.getFlgCancellato();
        this.version = version;
    }

}

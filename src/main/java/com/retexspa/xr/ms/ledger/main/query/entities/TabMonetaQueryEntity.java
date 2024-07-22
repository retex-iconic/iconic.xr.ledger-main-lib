package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.tabMoneta.TabMonetaBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_moneta")
@Getter
@Setter
public class TabMonetaQueryEntity {

    @Id
    @NonNull
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    private TabValutaQueryEntity tabValuta;
    @Column(name = "tipo_moneta")
    private String tipoMoneta;
    @Column(name = "taglio_cassetto")
    private String taglioCassetto;
    @Column(name = "descrizione_taglio")
    private String descrizioneTaglio;
    @Column(name = "valore_unitario")
    private BigDecimal valoreUnitario;
    @Column(name = "valore_tubetto")
    private BigDecimal valoreTubetto;
    @Column(name = "flg_ordini")
    private String flgOrdini;
    @Column(name = "flg_cassaforte")
    private String flgCassaforte;
    @Column(name = "flg_contasoldi_cm")
    private String flgContasoldiCm;
    @Column(name = "flg_contasoldi_hm")
    private String flgContasoldiHm;
    @Column(name = "flg_contasoldi_vb")
    private String flgContasoldiVb;
    @Column(name = "flg_contasoldi_cb")
    private String flgContasoldiCb;
    @Column(name = "flg_invio_banca")
    private String flgInvioBanca;
    @Column(name = "flg_cancellato")
    private String flgCancellato;
    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;
    @Column(name = "version")
    private Long version;

    public TabMonetaQueryEntity() {
    }

    public TabMonetaQueryEntity(
            @NonNull String id,
            TabMonetaBaseDTO data,
            Long version)  {
        this.id = id;
        this.tipoMoneta = data.getTipoMoneta();
        this.taglioCassetto = data.getTaglioCassetto();
        this.descrizioneTaglio = data.getDescrizioneTaglio();
        this.valoreUnitario = data.getValoreUnitario();
        this.valoreTubetto = data.getValoreTubetto();
        this.flgOrdini = data.getFlgOrdini();
        this.flgCassaforte =data.getFlgCassaforte();
        this.flgContasoldiCm = data.getFlgContasoldiCm();
        this.flgContasoldiHm = data.getFlgContasoldiHm();
        this.flgContasoldiVb = data.getFlgContasoldiVb();
        this.flgContasoldiCb = data.getFlgContasoldiCb();
        this.flgInvioBanca =data.getFlgInvioBanca();
        this.flgCancellato =data.getFlgCancellato();
        this.version =version;
    }
}

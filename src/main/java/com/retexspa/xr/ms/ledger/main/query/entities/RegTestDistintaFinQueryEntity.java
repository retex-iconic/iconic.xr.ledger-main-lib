package com.retexspa.xr.ms.ledger.main.query.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.retexspa.xr.ms.ledger.main.core.dto.regTestDistintaFin.RegTestDistintaFinBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "regTestDistinta")
@Getter
@Setter
public class RegTestDistintaFinQueryEntity {
    @Id @NonNull private String id;
    @Column(name = "codRiga")
    private Integer codRiga;

    @Column(name = "desRigaB")
    private String desRigaB;

    @Column(name = "desRigaL")
    private String desRigaL;

    @Column(name = "flgVisSoloMov")
    private String flgVisSoloMov;

    @Column(name = "flgQuadraturaCommerciale")
    private String flgQuadraturaCommerciale;

    @Column(name = "flgQuadraturaVersato")
    private String flgQuadraturaVersato;

    @Column(name = "flgQuadraturaServizi")
    private String flgQuadraturaServizi;

    @Column(name = "flgImpFatturato")
    private String flgImpFatturato;

    @Column(name = "flgImpNonFatturato")
    private String flgImpNonFatturato;

    @Column(name = "flgImpRimborsiFsIva")
    private String flgImpRimborsiFsIva;

    @Column(name = "flgFondoCassa")
    private String flgFondoCassa;

    @Column(name = "flgFondiCassetti")
    private String flgFondiCassetti;

    @Column(name = "flgFondiCassieri")
    private String flgFondiCassieri;

    @Column(name = "flgCancellato")
    private String flgCancellato;
    @Column(name = "data_cancellazione")
    private LocalDateTime dataCancellazione;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "regTestDistinta")
    @JsonIgnore
    private List<RegTestDistintaFinAttributoQueryEntity> attributi;
    @Column(name = "version")
    private Long version;

    public RegTestDistintaFinQueryEntity() {
    }

    public RegTestDistintaFinQueryEntity(@NonNull String id,
                                         RegTestDistintaFinBaseDTO data,
                                         Long version) {
        this.id = id;
        this.codRiga = data.getCodRiga();
        this.desRigaB = data.getDesRigaB();
        this.desRigaL = data.getDesRigaL();
        this.flgVisSoloMov = data.getFlgVisSoloMov();
        this.flgQuadraturaCommerciale = data.getFlgQuadraturaCommerciale();
        this.flgQuadraturaVersato = data.getFlgQuadraturaVersato();
        this.flgQuadraturaServizi = data.getFlgQuadraturaServizi();
        this.flgImpFatturato = data.getFlgImpFatturato();
        this.flgImpNonFatturato = data.getFlgImpNonFatturato();
        this.flgImpRimborsiFsIva = data.getFlgImpRimborsiFsIva();
        this.flgFondoCassa = data.getFlgFondoCassa();
        this.flgFondiCassetti = data.getFlgFondiCassetti();
        this.flgFondiCassieri = data.getFlgFondiCassieri();
        this.flgCancellato = data.getFlgCancellato();
        this.version = version;
    }
}

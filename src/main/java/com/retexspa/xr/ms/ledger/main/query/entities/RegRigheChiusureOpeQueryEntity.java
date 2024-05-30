package com.retexspa.xr.ms.ledger.main.query.entities;

import com.retexspa.xr.ms.ledger.main.core.dto.regRigheChiusureOpe.RegRigheChiusureOpeBaseDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regRigheChiusureOpe")
@Getter
@Setter
public class RegRigheChiusureOpeQueryEntity {
    @Id
    @NonNull
    private String id;
    @Column(name = "cod_riga")
    private Integer codRiga;
    @Column(name = "des_riga_b")
    private String desRigaB;
    @Column(name = "des_riga_l")
    private String desRigaL;
    @Column(name = "flg_cancellato")
    private String flgCancellato;
    @Column(name = "version")
    private Long version;

    public RegRigheChiusureOpeQueryEntity() {
    }

    public RegRigheChiusureOpeQueryEntity(
            @NonNull String id,
            RegRigheChiusureOpeBaseDTO data,
            Long version) {
        this.id = id;
        this.codRiga = data.getCodRiga();
        this.desRigaB = data.getDesRigaB();
        this.desRigaL = data.getDesRigaL();
        this.flgCancellato = data.getFlgCancellato();
        this.version = version;
    }
}

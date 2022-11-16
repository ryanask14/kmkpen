package id.co.askrindo.kmkpen.pen.model.master;

import javax.persistence.*;

@Entity
@Table(name = "m_mapping_kodepos_wilayah")
public class MMappingKodeposWilayah {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "kode_pos", length = 5)
    private String kodePos;

    @Column(name = "kode_kabkota", length = 5)
    private String kodeKabkota;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getKodeKabkota() {
        return kodeKabkota;
    }

    public void setKodeKabkota(String kodeKabkota) {
        this.kodeKabkota = kodeKabkota;
    }

}
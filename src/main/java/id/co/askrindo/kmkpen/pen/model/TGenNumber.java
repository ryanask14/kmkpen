package id.co.askrindo.kmkpen.pen.model;

import lombok.ToString;

import javax.persistence.*;

@ToString
@Entity
@Table(name = "t_gen_number")
public class TGenNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gen_number", nullable = false)
    private Long id;

    @Lob
    @Column(name = "toc", nullable = false)
    private String toc;

    @Lob
    @Column(name = "kode_cabang", nullable = false)
    private String kodeCabang;

    @Lob
    @Column(name = "tahun", nullable = false)
    private String tahun;

    @Column(name = "counter", nullable = false)
    private Long counter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToc() {
        return toc;
    }

    public void setToc(String toc) {
        this.toc = toc;
    }

    public String getKodeCabang() {
        return kodeCabang;
    }

    public void setKodeCabang(String kodeCabang) {
        this.kodeCabang = kodeCabang;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

}
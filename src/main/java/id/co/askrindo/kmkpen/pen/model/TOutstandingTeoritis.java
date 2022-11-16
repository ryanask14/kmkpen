package id.co.askrindo.kmkpen.pen.model;

import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@ToString
@Entity
@Table(name = "t_outstanding_teoritis")
public class TOutstandingTeoritis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "outstanding_teoritis_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_penjaminan", nullable = false)
    private TPenjaminan idPenjaminan;

    @Column(name = "tanggal_saldo", nullable = false)
    private LocalDate tanggalSaldo;

    @Column(name = "outstanding", nullable = false)
    private BigDecimal outstanding;

    @Column(name = "angsuran_pokok", nullable = false)
    private BigDecimal angsuranPokok;

    @Column(name = "angsuran_bunga", nullable = false)
    private BigDecimal angsuranBunga;

    @Column(name = "angsuran_denda", nullable = false)
    private BigDecimal angsuranDenda;

    @Column(name = "version", nullable = false)
    private Integer version;

    @Column(name = "created_by", nullable = false, length = 20)
    private String createdBy;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @Column(name = "modified_by", length = 20)
    private String modifiedBy;

    @Column(name = "modified_date")
    private Instant modifiedDate;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TPenjaminan getIdPenjaminan() {
        return idPenjaminan;
    }

    public void setIdPenjaminan(TPenjaminan idPenjaminan) {
        this.idPenjaminan = idPenjaminan;
    }

    public LocalDate getTanggalSaldo() {
        return tanggalSaldo;
    }

    public void setTanggalSaldo(LocalDate tanggalSaldo) {
        this.tanggalSaldo = tanggalSaldo;
    }

    public BigDecimal getOutstanding() {
        return outstanding;
    }

    public void setOutstanding(BigDecimal outstanding) {
        this.outstanding = outstanding;
    }

    public BigDecimal getAngsuranPokok() {
        return angsuranPokok;
    }

    public void setAngsuranPokok(BigDecimal angsuranPokok) {
        this.angsuranPokok = angsuranPokok;
    }

    public BigDecimal getAngsuranBunga() {
        return angsuranBunga;
    }

    public void setAngsuranBunga(BigDecimal angsuranBunga) {
        this.angsuranBunga = angsuranBunga;
    }

    public BigDecimal getAngsuranDenda() {
        return angsuranDenda;
    }

    public void setAngsuranDenda(BigDecimal angsuranDenda) {
        this.angsuranDenda = angsuranDenda;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
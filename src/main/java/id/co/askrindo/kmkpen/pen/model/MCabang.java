package id.co.askrindo.kmkpen.pen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_cabang")
public class MCabang {
    @Id
    @Column(name = "id_cabang", nullable = false, length = 11)
    private String id;

    @Column(name = "kode_bank_induk", length = 8)
    private String kodeBankInduk;

    @Column(name = "kode_cabang", nullable = false, length = 50)
    private String kodeCabang;

    @Column(name = "nama_cabang", nullable = false, length = 150)
    private String namaCabang;

    @Column(name = "alamat_cabang", length = 512)
    private String alamatCabang;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "is_pusat", nullable = false)
    private Boolean isPusat = false;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

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

    @Column(name = "kode_cabang_acs", length = 5)
    private String kodeCabangAcs;

    @Column(name = "id_customer_op", length = 12)
    private String idCustomerOp;

    @Column(name = "kota", length = 50)
    private String kota;

    @Column(name = "id_wilayah_ask", length = 3)
    private String idWilayahAsk;

    @Column(name = "telp", length = 30)
    private String telp;

    @Column(name = "fax", length = 30)
    private String fax;

    @Column(name = "is_wilayah")
    private Boolean isWilayah;

    @Column(name = "provinsi", length = 50)
    private String provinsi;

    @Column(name = "jenis_cabang", length = 10)
    private String jenisCabang;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKodeBankInduk() {
        return kodeBankInduk;
    }

    public void setKodeBankInduk(String kodeBankInduk) {
        this.kodeBankInduk = kodeBankInduk;
    }

    public String getKodeCabang() {
        return kodeCabang;
    }

    public void setKodeCabang(String kodeCabang) {
        this.kodeCabang = kodeCabang;
    }

    public String getNamaCabang() {
        return namaCabang;
    }

    public void setNamaCabang(String namaCabang) {
        this.namaCabang = namaCabang;
    }

    public String getAlamatCabang() {
        return alamatCabang;
    }

    public void setAlamatCabang(String alamatCabang) {
        this.alamatCabang = alamatCabang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsPusat() {
        return isPusat;
    }

    public void setIsPusat(Boolean isPusat) {
        this.isPusat = isPusat;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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

    public String getKodeCabangAcs() {
        return kodeCabangAcs;
    }

    public void setKodeCabangAcs(String kodeCabangAcs) {
        this.kodeCabangAcs = kodeCabangAcs;
    }

    public String getIdCustomerOp() {
        return idCustomerOp;
    }

    public void setIdCustomerOp(String idCustomerOp) {
        this.idCustomerOp = idCustomerOp;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getIdWilayahAsk() {
        return idWilayahAsk;
    }

    public void setIdWilayahAsk(String idWilayahAsk) {
        this.idWilayahAsk = idWilayahAsk;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Boolean getIsWilayah() {
        return isWilayah;
    }

    public void setIsWilayah(Boolean isWilayah) {
        this.isWilayah = isWilayah;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getJenisCabang() {
        return jenisCabang;
    }

    public void setJenisCabang(String jenisCabang) {
        this.jenisCabang = jenisCabang;
    }

}
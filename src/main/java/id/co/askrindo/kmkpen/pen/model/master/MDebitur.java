package id.co.askrindo.kmkpen.pen.model.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "m_debitur")
public class MDebitur {
    @Id
    @Column(name = "no_id_debitur", nullable = false, length = 16)
    private String id;

    @Column(name = "cif", length = 50)
    private String cif;

    @Column(name = "nama_debitur", nullable = false)
    private String namaDebitur;

    @Column(name = "alamat_debitur", nullable = false, length = 512)
    private String alamatDebitur;

    @Column(name = "kode_pos", length = 6)
    private String kodePos;

    @Column(name = "tempat_lahir", length = 100)
    private String tempatLahir;

    @Column(name = "tgl_lahir", nullable = false)
    private LocalDate tglLahir;

    @Column(name = "jenis_kelamin")
    private Integer jenisKelamin;

    @Column(name = "no_telepon", length = 20)
    private String noTelepon;

    @Column(name = "no_hp_debitur", nullable = false, length = 20)
    private String noHpDebitur;

    @Column(name = "pendidikan")
    private Integer pendidikan;

    @Column(name = "marital_status")
    private Integer maritalStatus;

    @Column(name = "jenis_identitas", length = 15)
    private String jenisIdentitas;

    @Column(name = "npwp", length = 40)
    private String npwp;

    @Column(name = "no_ijin_usaha", length = 100)
    private String noIjinUsaha;

    @Column(name = "tgl_mulai_usaha")
    private LocalDate tglMulaiUsaha;

    @Column(name = "modal_usaha", precision = 18, scale = 2)
    private BigDecimal modalUsaha;

    @Column(name = "jumlah_tenaga_kerja")
    private Integer jumlahTenagaKerja;

    @Column(name = "omset_usaha", nullable = false, precision = 18, scale = 2)
    private BigDecimal omsetUsaha;

    @Column(name = "kekayaan_bersih", nullable = false, precision = 18, scale = 2)
    private BigDecimal kekayaanBersih;

    @Column(name = "jenis_pekerjaan", nullable = false)
    private Integer jenisPekerjaan;

    @Column(name = "status_kepegawaian", length = 1)
    private String statusKepegawaian;

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

    @Column(name = "status_ejamku", nullable = false)
    private Boolean statusEjamku = false;

    @Column(name = "ket_ejamku", length = 1000)
    private String ketEjamku;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNamaDebitur() {
        return namaDebitur;
    }

    public void setNamaDebitur(String namaDebitur) {
        this.namaDebitur = namaDebitur;
    }

    public String getAlamatDebitur() {
        return alamatDebitur;
    }

    public void setAlamatDebitur(String alamatDebitur) {
        this.alamatDebitur = alamatDebitur;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public LocalDate getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    public Integer getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(Integer jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getNoHpDebitur() {
        return noHpDebitur;
    }

    public void setNoHpDebitur(String noHpDebitur) {
        this.noHpDebitur = noHpDebitur;
    }

    public Integer getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(Integer pendidikan) {
        this.pendidikan = pendidikan;
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getJenisIdentitas() {
        return jenisIdentitas;
    }

    public void setJenisIdentitas(String jenisIdentitas) {
        this.jenisIdentitas = jenisIdentitas;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNoIjinUsaha() {
        return noIjinUsaha;
    }

    public void setNoIjinUsaha(String noIjinUsaha) {
        this.noIjinUsaha = noIjinUsaha;
    }

    public LocalDate getTglMulaiUsaha() {
        return tglMulaiUsaha;
    }

    public void setTglMulaiUsaha(LocalDate tglMulaiUsaha) {
        this.tglMulaiUsaha = tglMulaiUsaha;
    }

    public BigDecimal getModalUsaha() {
        return modalUsaha;
    }

    public void setModalUsaha(BigDecimal modalUsaha) {
        this.modalUsaha = modalUsaha;
    }

    public Integer getJumlahTenagaKerja() {
        return jumlahTenagaKerja;
    }

    public void setJumlahTenagaKerja(Integer jumlahTenagaKerja) {
        this.jumlahTenagaKerja = jumlahTenagaKerja;
    }

    public BigDecimal getOmsetUsaha() {
        return omsetUsaha;
    }

    public void setOmsetUsaha(BigDecimal omsetUsaha) {
        this.omsetUsaha = omsetUsaha;
    }

    public BigDecimal getKekayaanBersih() {
        return kekayaanBersih;
    }

    public void setKekayaanBersih(BigDecimal kekayaanBersih) {
        this.kekayaanBersih = kekayaanBersih;
    }

    public Integer getJenisPekerjaan() {
        return jenisPekerjaan;
    }

    public void setJenisPekerjaan(Integer jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    public String getStatusKepegawaian() {
        return statusKepegawaian;
    }

    public void setStatusKepegawaian(String statusKepegawaian) {
        this.statusKepegawaian = statusKepegawaian;
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

    public Boolean getStatusEjamku() {
        return statusEjamku;
    }

    public void setStatusEjamku(Boolean statusEjamku) {
        this.statusEjamku = statusEjamku;
    }

    public String getKetEjamku() {
        return ketEjamku;
    }

    public void setKetEjamku(String ketEjamku) {
        this.ketEjamku = ketEjamku;
    }

}
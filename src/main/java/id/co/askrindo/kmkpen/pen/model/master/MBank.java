package id.co.askrindo.kmkpen.pen.model.master;

import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@ToString
@Entity
@Table(name = "m_bank")
public class MBank {

    @Id
    @Column(name = "kode_bank", nullable = false, length = 8)
    private String id;

    @Column(name = "nama_bank", nullable = false, length = 50)
    private String namaBank;

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

    @Column(name = "no_pks", nullable = false, length = 100)
    private String noPks;

    @Column(name = "tgl_mulai")
    private LocalDate tglMulai;

    @Column(name = "tgl_akhir")
    private LocalDate tglAkhir;

    @Column(name = "kode_bank_acs", nullable = false, length = 8)
    private String kodeBankAcs;

    @Column(name = "short_code", length = 10)
    private String shortCode;

    @Column(name = "id_r_p_asuransi")
    private Integer idRPAsuransi;

    @Column(name = "id_aktifitas", length = 2)
    private String idAktifitas;

    @Column(name = "no_pks_askrindo")
    private String noPksAskrindo;

    @Column(name = "jenis_bank", nullable = false)
    private Integer jenisBank;

    @Column(name = "jml_daluarsa_tamdat")
    private Integer jmlDaluarsaTamdat;

    @OneToMany(mappedBy = "kodeBank")
    private Set<MMappingBank> mMappingBanks = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
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

    public String getNoPks() {
        return noPks;
    }

    public void setNoPks(String noPks) {
        this.noPks = noPks;
    }

    public LocalDate getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(LocalDate tglMulai) {
        this.tglMulai = tglMulai;
    }

    public LocalDate getTglAkhir() {
        return tglAkhir;
    }

    public void setTglAkhir(LocalDate tglAkhir) {
        this.tglAkhir = tglAkhir;
    }

    public String getKodeBankAcs() {
        return kodeBankAcs;
    }

    public void setKodeBankAcs(String kodeBankAcs) {
        this.kodeBankAcs = kodeBankAcs;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public Integer getIdRPAsuransi() {
        return idRPAsuransi;
    }

    public void setIdRPAsuransi(Integer idRPAsuransi) {
        this.idRPAsuransi = idRPAsuransi;
    }

    public String getIdAktifitas() {
        return idAktifitas;
    }

    public void setIdAktifitas(String idAktifitas) {
        this.idAktifitas = idAktifitas;
    }

    public String getNoPksAskrindo() {
        return noPksAskrindo;
    }

    public void setNoPksAskrindo(String noPksAskrindo) {
        this.noPksAskrindo = noPksAskrindo;
    }

    public Integer getJenisBank() {
        return jenisBank;
    }

    public void setJenisBank(Integer jenisBank) {
        this.jenisBank = jenisBank;
    }

    public Integer getJmlDaluarsaTamdat() {
        return jmlDaluarsaTamdat;
    }

    public void setJmlDaluarsaTamdat(Integer jmlDaluarsaTamdat) {
        this.jmlDaluarsaTamdat = jmlDaluarsaTamdat;
    }

    public Set<MMappingBank> getMMappingBanks() {
        return mMappingBanks;
    }

    public void setMMappingBanks(Set<MMappingBank> mMappingBanks) {
        this.mMappingBanks = mMappingBanks;
    }

}
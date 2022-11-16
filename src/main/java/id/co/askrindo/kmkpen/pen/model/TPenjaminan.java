package id.co.askrindo.kmkpen.pen.model;

import id.co.askrindo.kmkpen.pen.model.master.MBank;
import id.co.askrindo.kmkpen.pen.model.master.MMappingBank;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "t_penjaminan")
public class TPenjaminan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_penjaminan", nullable = false)
    private Long id;

    @Column(name = "transaction_id_bank", nullable = false, length = 50)
    private String transactionIdBank;

    @Column(name = "kode_cabang_bank", nullable = false, length = 8)
    private String kodeCabangBank;

    @Column(name = "nama_cabang_bank")
    private String namaCabangBank;

    @Column(name = "kode_cabang_askrindo", nullable = false, length = 3)
    private String kodeCabangAskrindo;

    @Column(name = "no_rekening_pinjaman", length = 50)
    private String noRekeningPinjaman;

    @Column(name = "no_rek_lama")
    private String noRekLama;

    @Column(name = "cif", length = 50)
    private String cif;

    @Column(name = "no_perjanjian_kredit", length = 50)
    private String noPerjanjianKredit;

    @Column(name = "no_pk_lama")
    private String noPkLama;

    @Column(name = "tgl_pk")
    private LocalDate tglPk;

    @Column(name = "tgl_pk_lama")
    private LocalDate tglPkLama;

    @Column(name = "tgl_awal_pertanggungan")
    private LocalDate tglAwalPertanggungan;

    @Column(name = "tgl_akhir_pertanggungan")
    private LocalDate tglAkhirPertanggungan;

    @Column(name = "jangka_waktu")
    private Integer jangkaWaktu;

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

    @Column(name = "no_id_debitur", nullable = false, length = 40)
    private String noIdDebitur;

    @Column(name = "npwp", length = 40)
    private String npwp;

    @Column(name = "no_ijin_usaha", length = 100)
    private String noIjinUsaha;

    @Column(name = "tgl_mulai_usaha")
    private LocalDate tglMulaiUsaha;

    @Column(name = "modal_usaha")
    private BigDecimal modalUsaha;

    @Column(name = "jumlah_tenaga_kerja")
    private BigDecimal jumlahTenagaKerja;

    @Column(name = "omset_usaha", nullable = false)
    private BigDecimal omsetUsaha;

    @Column(name = "kekayaan_bersih", nullable = false)
    private BigDecimal kekayaanBersih;

    @Column(name = "jenis_pekerjaan", nullable = false)
    private Integer jenisPekerjaan;

    @Column(name = "status_kepegawaian", length = 1)
    private String statusKepegawaian;

    @Column(name = "jenis_kredit", nullable = false, length = 15)
    private String jenisKredit;

    @Column(name = "plafond_kredit", nullable = false, precision = 18, scale = 2)
    private BigDecimal plafondKredit;

    @Column(name = "bakidebet", precision = 18, scale = 2)
    private BigDecimal bakidebet;

    @Column(name = "nilai_pertanggungan", nullable = false, precision = 18, scale = 2)
    private BigDecimal nilaiPertanggungan;

    @Column(name = "type_tujuan_kredit", length = 1)
    private String typeTujuanKredit;

    @Column(name = "suku_bunga_kredit", length = 10)
    private String sukuBungaKredit;

    @Column(name = "currency", length = 10)
    private String currency;

    @Column(name = "sektor_ekonomi", nullable = false, length = 10)
    private String sektorEkonomi;

    @Column(name = "coverage", nullable = false, precision = 5, scale = 2)
    private BigDecimal coverage;

    @Column(name = "kolektibilitas_kredit", nullable = false, length = 20)
    private String kolektibilitasKredit;

    @Column(name = "loan_type", length = 20)
    private String loanType;

    @Column(name = "mekanisme_penyaluran", length = 20)
    private String mekanismePenyaluran;

    @Column(name = "is_cac", nullable = false)
    private Boolean isCac = false;

    @Column(name = "sumber", nullable = false)
    private Integer sumber;

    @Column(name = "no_sertifikat", length = 30)
    private String noSertifikat;

    @Column(name = "tgl_sertifikat")
    private LocalDate tglSertifikat;

    @Column(name = "tgl_rekam_sertifikat")
    private LocalDate tglRekamSertifikat;

    @Column(name = "rate", precision = 7, scale = 5)
    private BigDecimal rate;

    @Column(name = "total_ijp")
    private BigDecimal totalIjp;

    @Column(name = "status_penjaminan_id", nullable = false)
    private Integer statusPenjaminanId;

    @Column(name = "jenis_pengajuan", nullable = false)
    private String jenisPengajuan;

    @Column(name = "no_sertifikat_sebelumnya")
    private String noSertifikatSebelumnya;

    @Column(name = "no_pks", nullable = false, length = 100)
    private String noPks;

    @Column(name = "keterangan")
    private String keterangan;

    @Column(name = "version", nullable = false)
    private Integer version;

    @Column(name = "created_by", nullable = false, length = 20)
    private String createdBy;

    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate;

    @Column(name = "modified_by", length = 20)
    private String modifiedBy;

    @Column(name = "modified_date")
    private Instant modifiedDate;

    @Column(name = "plafon_disetujui")
    private BigDecimal plafonDisetujui;

    @Column(name = "alasan_penolakan")
    private String alasanPenolakan;

    @Column(name = "no_reg_air")
    private String noRegAir;

    @Column(name = "ket_audit_trail", length = 1000)
    private String ketAuditTrail;

    @Column(name = "exception_flag")
    private Integer exceptionFlag;

    @Column(name = "status_sikp", nullable = false)
    private Integer statusSikp;

    @Column(name = "is_cancel")
    private Boolean isCancel;

    @Column(name = "status_update_sikp")
    private Integer statusUpdateSikp;

    @Column(name = "status_cetak", nullable = false)
    private Integer statusCetak;

    @Column(name = "jangka_waktu_hari")
    private Integer jangkaWaktuHari;

    @Column(name = "id_penjaminan_prev")
    private Long idPenjaminanPrev;

    @Column(name = "ket_sikp", length = 1000)
    private String ketSikp;

    @Column(name = "jenis_pembatalan")
    private Integer jenisPembatalan;

    @Column(name = "is_penagihan")
    private Boolean isPenagihan;

    @Column(name = "persetujuan_bank", nullable = false)
    private Boolean persetujuanBank = false;

    @Column(name = "is_proses_approval", nullable = false)
    private Boolean isProsesApproval = false;

    @Column(name = "dokumen_pembatalan")
    @Type(type = "org.hibernate.type.TextType")
    private String dokumenPembatalan;

    @Column(name = "tgl_endorse")
    private Instant tglEndorse;

    @Column(name = "tgl_surat_pembatalan")
    private Instant tglSuratPembatalan;

    @Column(name = "no_surat_pembatalan")
    private String noSuratPembatalan;

    @Column(name = "is_endorsed")
    private Boolean isEndorsed;

    @Column(name = "is_proses_endorse")
    private Boolean isProsesEndorse;

    @Column(name = "is_proses_approval_koreksi")
    private Boolean isProsesApprovalKoreksi;

    @Column(name = "tgl_penjaminan")
    private LocalDate tglPenjaminan;

    @Column(name = "ket_validasi_ejamku", length = 50)
    private String ketValidasiEjamku;

    @Column(name = "validasi_ejamku")
    private Boolean validasiEjamku;

    @Column(name = "is_tagih_djppr")
    private Boolean isTagihDjppr;

    @Column(name = "is_lunas_dipercepat")
    private Boolean isLunasDipercepat;

    @Column(name = "tgl_lunas_dipercepat")
    private LocalDate tglLunasDipercepat;

    @Column(name = "is_update_rekening", nullable = false)
    private Boolean isUpdateRekening = false;

    @Column(name = "is_ijp_bayar")
    private Boolean isIjpBayar;

    @Column(name = "jenis_pen", length = 4)
    private String jenisPen;

    @Column(name = "tgl_awal_kredit")
    private LocalDate tglAwalKredit;

    @Column(name = "tgl_akhir_kredit")
    private LocalDate tglAkhirKredit;

    @Column(name = "jangka_waktu_kredit")
    private Integer jangkaWaktuKredit;

    @OneToMany(mappedBy = "kodeBank")
    private Set<MMappingBank> mMappingBanks = new LinkedHashSet<>();

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kode_bank", nullable = false)
    private MBank kodeBank;

    public MBank getKodeBank() {
        return kodeBank;
    }

    public void setKodeBank(MBank kodeBank) {
        this.kodeBank = kodeBank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionIdBank() {
        return transactionIdBank;
    }

    public void setTransactionIdBank(String transactionIdBank) {
        this.transactionIdBank = transactionIdBank;
    }

    public String getKodeCabangBank() {
        return kodeCabangBank;
    }

    public void setKodeCabangBank(String kodeCabangBank) {
        this.kodeCabangBank = kodeCabangBank;
    }

    public String getNamaCabangBank() {
        return namaCabangBank;
    }

    public void setNamaCabangBank(String namaCabangBank) {
        this.namaCabangBank = namaCabangBank;
    }

    public String getKodeCabangAskrindo() {
        return kodeCabangAskrindo;
    }

    public void setKodeCabangAskrindo(String kodeCabangAskrindo) {
        this.kodeCabangAskrindo = kodeCabangAskrindo;
    }

    public String getNoRekeningPinjaman() {
        return noRekeningPinjaman;
    }

    public void setNoRekeningPinjaman(String noRekeningPinjaman) {
        this.noRekeningPinjaman = noRekeningPinjaman;
    }

    public String getNoRekLama() {
        return noRekLama;
    }

    public void setNoRekLama(String noRekLama) {
        this.noRekLama = noRekLama;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNoPerjanjianKredit() {
        return noPerjanjianKredit;
    }

    public void setNoPerjanjianKredit(String noPerjanjianKredit) {
        this.noPerjanjianKredit = noPerjanjianKredit;
    }

    public String getNoPkLama() {
        return noPkLama;
    }

    public void setNoPkLama(String noPkLama) {
        this.noPkLama = noPkLama;
    }

    public LocalDate getTglPk() {
        return tglPk;
    }

    public void setTglPk(LocalDate tglPk) {
        this.tglPk = tglPk;
    }

    public LocalDate getTglPkLama() {
        return tglPkLama;
    }

    public void setTglPkLama(LocalDate tglPkLama) {
        this.tglPkLama = tglPkLama;
    }

    public LocalDate getTglAwalPertanggungan() {
        return tglAwalPertanggungan;
    }

    public void setTglAwalPertanggungan(LocalDate tglAwalPertanggungan) {
        this.tglAwalPertanggungan = tglAwalPertanggungan;
    }

    public LocalDate getTglAkhirPertanggungan() {
        return tglAkhirPertanggungan;
    }

    public void setTglAkhirPertanggungan(LocalDate tglAkhirPertanggungan) {
        this.tglAkhirPertanggungan = tglAkhirPertanggungan;
    }

    public Integer getJangkaWaktu() {
        return jangkaWaktu;
    }

    public void setJangkaWaktu(Integer jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
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

    public String getNoIdDebitur() {
        return noIdDebitur;
    }

    public void setNoIdDebitur(String noIdDebitur) {
        this.noIdDebitur = noIdDebitur;
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

    public BigDecimal getJumlahTenagaKerja() {
        return jumlahTenagaKerja;
    }

    public void setJumlahTenagaKerja(BigDecimal jumlahTenagaKerja) {
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

    public String getJenisKredit() {
        return jenisKredit;
    }

    public void setJenisKredit(String jenisKredit) {
        this.jenisKredit = jenisKredit;
    }

    public BigDecimal getPlafondKredit() {
        return plafondKredit;
    }

    public void setPlafondKredit(BigDecimal plafondKredit) {
        this.plafondKredit = plafondKredit;
    }

    public BigDecimal getBakidebet() {
        return bakidebet;
    }

    public void setBakidebet(BigDecimal bakidebet) {
        this.bakidebet = bakidebet;
    }

    public BigDecimal getNilaiPertanggungan() {
        return nilaiPertanggungan;
    }

    public void setNilaiPertanggungan(BigDecimal nilaiPertanggungan) {
        this.nilaiPertanggungan = nilaiPertanggungan;
    }

    public String getTypeTujuanKredit() {
        return typeTujuanKredit;
    }

    public void setTypeTujuanKredit(String typeTujuanKredit) {
        this.typeTujuanKredit = typeTujuanKredit;
    }

    public String getSukuBungaKredit() {
        return sukuBungaKredit;
    }

    public void setSukuBungaKredit(String sukuBungaKredit) {
        this.sukuBungaKredit = sukuBungaKredit;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSektorEkonomi() {
        return sektorEkonomi;
    }

    public void setSektorEkonomi(String sektorEkonomi) {
        this.sektorEkonomi = sektorEkonomi;
    }

    public BigDecimal getCoverage() {
        return coverage;
    }

    public void setCoverage(BigDecimal coverage) {
        this.coverage = coverage;
    }

    public String getKolektibilitasKredit() {
        return kolektibilitasKredit;
    }

    public void setKolektibilitasKredit(String kolektibilitasKredit) {
        this.kolektibilitasKredit = kolektibilitasKredit;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getMekanismePenyaluran() {
        return mekanismePenyaluran;
    }

    public void setMekanismePenyaluran(String mekanismePenyaluran) {
        this.mekanismePenyaluran = mekanismePenyaluran;
    }

    public Boolean getIsCac() {
        return isCac;
    }

    public void setIsCac(Boolean isCac) {
        this.isCac = isCac;
    }

    public Integer getSumber() {
        return sumber;
    }

    public void setSumber(Integer sumber) {
        this.sumber = sumber;
    }

    public String getNoSertifikat() {
        return noSertifikat;
    }

    public void setNoSertifikat(String noSertifikat) {
        this.noSertifikat = noSertifikat;
    }

    public LocalDate getTglSertifikat() {
        return tglSertifikat;
    }

    public void setTglSertifikat(LocalDate tglSertifikat) {
        this.tglSertifikat = tglSertifikat;
    }

    public LocalDate getTglRekamSertifikat() {
        return tglRekamSertifikat;
    }

    public void setTglRekamSertifikat(LocalDate tglRekamSertifikat) {
        this.tglRekamSertifikat = tglRekamSertifikat;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getTotalIjp() {
        return totalIjp;
    }

    public void setTotalIjp(BigDecimal totalIjp) {
        this.totalIjp = totalIjp;
    }

    public Integer getStatusPenjaminanId() {
        return statusPenjaminanId;
    }

    public void setStatusPenjaminanId(Integer statusPenjaminanId) {
        this.statusPenjaminanId = statusPenjaminanId;
    }

    public String getJenisPengajuan() {
        return jenisPengajuan;
    }

    public void setJenisPengajuan(String jenisPengajuan) {
        this.jenisPengajuan = jenisPengajuan;
    }

    public String getNoSertifikatSebelumnya() {
        return noSertifikatSebelumnya;
    }

    public void setNoSertifikatSebelumnya(String noSertifikatSebelumnya) {
        this.noSertifikatSebelumnya = noSertifikatSebelumnya;
    }

    public String getNoPks() {
        return noPks;
    }

    public void setNoPks(String noPks) {
        this.noPks = noPks;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
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

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
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

    public BigDecimal getPlafonDisetujui() {
        return plafonDisetujui;
    }

    public void setPlafonDisetujui(BigDecimal plafonDisetujui) {
        this.plafonDisetujui = plafonDisetujui;
    }

    public String getAlasanPenolakan() {
        return alasanPenolakan;
    }

    public void setAlasanPenolakan(String alasanPenolakan) {
        this.alasanPenolakan = alasanPenolakan;
    }

    public String getNoRegAir() {
        return noRegAir;
    }

    public void setNoRegAir(String noRegAir) {
        this.noRegAir = noRegAir;
    }

    public String getKetAuditTrail() {
        return ketAuditTrail;
    }

    public void setKetAuditTrail(String ketAuditTrail) {
        this.ketAuditTrail = ketAuditTrail;
    }

    public Integer getExceptionFlag() {
        return exceptionFlag;
    }

    public void setExceptionFlag(Integer exceptionFlag) {
        this.exceptionFlag = exceptionFlag;
    }

    public Integer getStatusSikp() {
        return statusSikp;
    }

    public void setStatusSikp(Integer statusSikp) {
        this.statusSikp = statusSikp;
    }

    public Boolean getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(Boolean isCancel) {
        this.isCancel = isCancel;
    }

    public Integer getStatusUpdateSikp() {
        return statusUpdateSikp;
    }

    public void setStatusUpdateSikp(Integer statusUpdateSikp) {
        this.statusUpdateSikp = statusUpdateSikp;
    }

    public Integer getStatusCetak() {
        return statusCetak;
    }

    public void setStatusCetak(Integer statusCetak) {
        this.statusCetak = statusCetak;
    }

    public Integer getJangkaWaktuHari() {
        return jangkaWaktuHari;
    }

    public void setJangkaWaktuHari(Integer jangkaWaktuHari) {
        this.jangkaWaktuHari = jangkaWaktuHari;
    }

    public Long getIdPenjaminanPrev() {
        return idPenjaminanPrev;
    }

    public void setIdPenjaminanPrev(Long idPenjaminanPrev) {
        this.idPenjaminanPrev = idPenjaminanPrev;
    }

    public String getKetSikp() {
        return ketSikp;
    }

    public void setKetSikp(String ketSikp) {
        this.ketSikp = ketSikp;
    }

    public Integer getJenisPembatalan() {
        return jenisPembatalan;
    }

    public void setJenisPembatalan(Integer jenisPembatalan) {
        this.jenisPembatalan = jenisPembatalan;
    }

    public Boolean getIsPenagihan() {
        return isPenagihan;
    }

    public void setIsPenagihan(Boolean isPenagihan) {
        this.isPenagihan = isPenagihan;
    }

    public Boolean getPersetujuanBank() {
        return persetujuanBank;
    }

    public void setPersetujuanBank(Boolean persetujuanBank) {
        this.persetujuanBank = persetujuanBank;
    }

    public Boolean getIsProsesApproval() {
        return isProsesApproval;
    }

    public void setIsProsesApproval(Boolean isProsesApproval) {
        this.isProsesApproval = isProsesApproval;
    }

    public String getDokumenPembatalan() {
        return dokumenPembatalan;
    }

    public void setDokumenPembatalan(String dokumenPembatalan) {
        this.dokumenPembatalan = dokumenPembatalan;
    }

    public Instant getTglEndorse() {
        return tglEndorse;
    }

    public void setTglEndorse(Instant tglEndorse) {
        this.tglEndorse = tglEndorse;
    }

    public Instant getTglSuratPembatalan() {
        return tglSuratPembatalan;
    }

    public void setTglSuratPembatalan(Instant tglSuratPembatalan) {
        this.tglSuratPembatalan = tglSuratPembatalan;
    }

    public String getNoSuratPembatalan() {
        return noSuratPembatalan;
    }

    public void setNoSuratPembatalan(String noSuratPembatalan) {
        this.noSuratPembatalan = noSuratPembatalan;
    }

    public Boolean getIsEndorsed() {
        return isEndorsed;
    }

    public void setIsEndorsed(Boolean isEndorsed) {
        this.isEndorsed = isEndorsed;
    }

    public Boolean getIsProsesEndorse() {
        return isProsesEndorse;
    }

    public void setIsProsesEndorse(Boolean isProsesEndorse) {
        this.isProsesEndorse = isProsesEndorse;
    }

    public Boolean getIsProsesApprovalKoreksi() {
        return isProsesApprovalKoreksi;
    }

    public void setIsProsesApprovalKoreksi(Boolean isProsesApprovalKoreksi) {
        this.isProsesApprovalKoreksi = isProsesApprovalKoreksi;
    }

    public LocalDate getTglPenjaminan() {
        return tglPenjaminan;
    }

    public void setTglPenjaminan(LocalDate tglPenjaminan) {
        this.tglPenjaminan = tglPenjaminan;
    }

    public String getKetValidasiEjamku() {
        return ketValidasiEjamku;
    }

    public void setKetValidasiEjamku(String ketValidasiEjamku) {
        this.ketValidasiEjamku = ketValidasiEjamku;
    }

    public Boolean getValidasiEjamku() {
        return validasiEjamku;
    }

    public void setValidasiEjamku(Boolean validasiEjamku) {
        this.validasiEjamku = validasiEjamku;
    }

    public Boolean getIsTagihDjppr() {
        return isTagihDjppr;
    }

    public void setIsTagihDjppr(Boolean isTagihDjppr) {
        this.isTagihDjppr = isTagihDjppr;
    }

    public Boolean getIsLunasDipercepat() {
        return isLunasDipercepat;
    }

    public void setIsLunasDipercepat(Boolean isLunasDipercepat) {
        this.isLunasDipercepat = isLunasDipercepat;
    }

    public LocalDate getTglLunasDipercepat() {
        return tglLunasDipercepat;
    }

    public void setTglLunasDipercepat(LocalDate tglLunasDipercepat) {
        this.tglLunasDipercepat = tglLunasDipercepat;
    }

    public Boolean getIsUpdateRekening() {
        return isUpdateRekening;
    }

    public void setIsUpdateRekening(Boolean isUpdateRekening) {
        this.isUpdateRekening = isUpdateRekening;
    }

    public Boolean getIsIjpBayar() {
        return isIjpBayar;
    }

    public void setIsIjpBayar(Boolean isIjpBayar) {
        this.isIjpBayar = isIjpBayar;
    }

    public String getJenisPen() {
        return jenisPen;
    }

    public void setJenisPen(String jenisPen) {
        this.jenisPen = jenisPen;
    }

    public LocalDate getTglAwalKredit() {
        return tglAwalKredit;
    }

    public void setTglAwalKredit(LocalDate tglAwalKredit) {
        this.tglAwalKredit = tglAwalKredit;
    }

    public LocalDate getTglAkhirKredit() {
        return tglAkhirKredit;
    }

    public void setTglAkhirKredit(LocalDate tglAkhirKredit) {
        this.tglAkhirKredit = tglAkhirKredit;
    }

    public Integer getJangkaWaktuKredit() {
        return jangkaWaktuKredit;
    }

    public void setJangkaWaktuKredit(Integer jangkaWaktuKredit) {
        this.jangkaWaktuKredit = jangkaWaktuKredit;
    }

/*
    TODO [JPA Buddy] create field to map the 'penjaminan_prev' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "penjaminan_prev", columnDefinition = "jsonb")
    private Object penjaminanPrev;
*/
}
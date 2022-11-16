package id.co.askrindo.kmkpen.pen.model;

import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@ToString
@Entity
@Table(name = "t_penjaminan_ijp")
public class TPenjaminanIjp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "penjaminan_ijp_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_penjaminan", nullable = false)
    private TPenjaminan idPenjaminan;

    @Column(name = "tahun_ke", nullable = false)
    private Integer tahunKe;

    @Column(name = "tgl_premi")
    private LocalDate tglPremi;

    @Column(name = "premi", nullable = false)
    private BigDecimal premi;

    @Column(name = "jatuh_tempo")
    private LocalDate jatuhTempo;

    @Column(name = "premi_dibayar")
    private BigDecimal premiDibayar;

    @Column(name = "status_bayar", nullable = false)
    private Boolean statusBayar = false;

    @Lob
    @Column(name = "no_bukti_bayar")
    private String noBuktiBayar;

    @Column(name = "tgl_bayar")
    private LocalDate tglBayar;

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

    @Column(name = "cadangan", precision = 18, scale = 2)
    private BigDecimal cadangan;

    @Column(name = "id_jurnal_produksi_ijp")
    private Long idJurnalProduksiIjp;

    @Column(name = "premi_nett", precision = 18, scale = 2)
    private BigDecimal premiNett;

    @Column(name = "status_sikp", nullable = false)
    private Boolean statusSikp = false;

    @Column(name = "is_koreksi")
    private Boolean isKoreksi;

    @Column(name = "tgl_penagihan")
    private LocalDate tglPenagihan;

    @Column(name = "bulan_penagihan")
    private Integer bulanPenagihan;

    @Column(name = "tahun_penagihan")
    private Integer tahunPenagihan;

    @Column(name = "pajak", precision = 18, scale = 2)
    private BigDecimal pajak;

    @Column(name = "piutang_ijp", precision = 18, scale = 2)
    private BigDecimal piutangIjp;

    @Column(name = "is_bayar_djppr")
    private Boolean isBayarDjppr;

    @Column(name = "id_tagihan_djppr")
    private Long idTagihanDjppr;

    @Column(name = "is_audit_bpkp")
    private Boolean isAuditBpkp;

    @Column(name = "is_lunas_dipercepat")
    private Boolean isLunasDipercepat;

    @Column(name = "no_sp2d", length = 30)
    private String noSp2d;

    @Column(name = "no_ba_djppr", length = 30)
    private String noBaDjppr;

    @Column(name = "tgl_ba_djppr")
    private LocalDate tglBaDjppr;

    @Column(name = "cadangan_ejamku", precision = 18, scale = 2)
    private BigDecimal cadanganEjamku;

    @Column(name = "premi_ejamku", precision = 18, scale = 2)
    private BigDecimal premiEjamku;

    @Column(name = "jml_hari")
    private Integer jmlHari;

    @Column(name = "jml_hari_tahunan")
    private Integer jmlHariTahunan;

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

    public Integer getTahunKe() {
        return tahunKe;
    }

    public void setTahunKe(Integer tahunKe) {
        this.tahunKe = tahunKe;
    }

    public LocalDate getTglPremi() {
        return tglPremi;
    }

    public void setTglPremi(LocalDate tglPremi) {
        this.tglPremi = tglPremi;
    }

    public BigDecimal getPremi() {
        return premi;
    }

    public void setPremi(BigDecimal premi) {
        this.premi = premi;
    }

    public LocalDate getJatuhTempo() {
        return jatuhTempo;
    }

    public void setJatuhTempo(LocalDate jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    public BigDecimal getPremiDibayar() {
        return premiDibayar;
    }

    public void setPremiDibayar(BigDecimal premiDibayar) {
        this.premiDibayar = premiDibayar;
    }

    public Boolean getStatusBayar() {
        return statusBayar;
    }

    public void setStatusBayar(Boolean statusBayar) {
        this.statusBayar = statusBayar;
    }

    public String getNoBuktiBayar() {
        return noBuktiBayar;
    }

    public void setNoBuktiBayar(String noBuktiBayar) {
        this.noBuktiBayar = noBuktiBayar;
    }

    public LocalDate getTglBayar() {
        return tglBayar;
    }

    public void setTglBayar(LocalDate tglBayar) {
        this.tglBayar = tglBayar;
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

    public BigDecimal getCadangan() {
        return cadangan;
    }

    public void setCadangan(BigDecimal cadangan) {
        this.cadangan = cadangan;
    }

    public Long getIdJurnalProduksiIjp() {
        return idJurnalProduksiIjp;
    }

    public void setIdJurnalProduksiIjp(Long idJurnalProduksiIjp) {
        this.idJurnalProduksiIjp = idJurnalProduksiIjp;
    }

    public BigDecimal getPremiNett() {
        return premiNett;
    }

    public void setPremiNett(BigDecimal premiNett) {
        this.premiNett = premiNett;
    }

    public Boolean getStatusSikp() {
        return statusSikp;
    }

    public void setStatusSikp(Boolean statusSikp) {
        this.statusSikp = statusSikp;
    }

    public Boolean getIsKoreksi() {
        return isKoreksi;
    }

    public void setIsKoreksi(Boolean isKoreksi) {
        this.isKoreksi = isKoreksi;
    }

    public LocalDate getTglPenagihan() {
        return tglPenagihan;
    }

    public void setTglPenagihan(LocalDate tglPenagihan) {
        this.tglPenagihan = tglPenagihan;
    }

    public Integer getBulanPenagihan() {
        return bulanPenagihan;
    }

    public void setBulanPenagihan(Integer bulanPenagihan) {
        this.bulanPenagihan = bulanPenagihan;
    }

    public Integer getTahunPenagihan() {
        return tahunPenagihan;
    }

    public void setTahunPenagihan(Integer tahunPenagihan) {
        this.tahunPenagihan = tahunPenagihan;
    }

    public BigDecimal getPajak() {
        return pajak;
    }

    public void setPajak(BigDecimal pajak) {
        this.pajak = pajak;
    }

    public BigDecimal getPiutangIjp() {
        return piutangIjp;
    }

    public void setPiutangIjp(BigDecimal piutangIjp) {
        this.piutangIjp = piutangIjp;
    }

    public Boolean getIsBayarDjppr() {
        return isBayarDjppr;
    }

    public void setIsBayarDjppr(Boolean isBayarDjppr) {
        this.isBayarDjppr = isBayarDjppr;
    }

    public Long getIdTagihanDjppr() {
        return idTagihanDjppr;
    }

    public void setIdTagihanDjppr(Long idTagihanDjppr) {
        this.idTagihanDjppr = idTagihanDjppr;
    }

    public Boolean getIsAuditBpkp() {
        return isAuditBpkp;
    }

    public void setIsAuditBpkp(Boolean isAuditBpkp) {
        this.isAuditBpkp = isAuditBpkp;
    }

    public Boolean getIsLunasDipercepat() {
        return isLunasDipercepat;
    }

    public void setIsLunasDipercepat(Boolean isLunasDipercepat) {
        this.isLunasDipercepat = isLunasDipercepat;
    }

    public String getNoSp2d() {
        return noSp2d;
    }

    public void setNoSp2d(String noSp2d) {
        this.noSp2d = noSp2d;
    }

    public String getNoBaDjppr() {
        return noBaDjppr;
    }

    public void setNoBaDjppr(String noBaDjppr) {
        this.noBaDjppr = noBaDjppr;
    }

    public LocalDate getTglBaDjppr() {
        return tglBaDjppr;
    }

    public void setTglBaDjppr(LocalDate tglBaDjppr) {
        this.tglBaDjppr = tglBaDjppr;
    }

    public BigDecimal getCadanganEjamku() {
        return cadanganEjamku;
    }

    public void setCadanganEjamku(BigDecimal cadanganEjamku) {
        this.cadanganEjamku = cadanganEjamku;
    }

    public BigDecimal getPremiEjamku() {
        return premiEjamku;
    }

    public void setPremiEjamku(BigDecimal premiEjamku) {
        this.premiEjamku = premiEjamku;
    }

    public Integer getJmlHari() {
        return jmlHari;
    }

    public void setJmlHari(Integer jmlHari) {
        this.jmlHari = jmlHari;
    }

    public Integer getJmlHariTahunan() {
        return jmlHariTahunan;
    }

    public void setJmlHariTahunan(Integer jmlHariTahunan) {
        this.jmlHariTahunan = jmlHariTahunan;
    }

}
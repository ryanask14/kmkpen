package id.co.askrindo.kmkpen.pen.model;

import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "log_sikp")
@ToString
public class LogSikp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_log", nullable = false)
    private Long id;

    @Column(name = "no_rekening", nullable = false)
    private String noRekening;

    @Column(name = "no_aplikasi", nullable = false)
    private String noAplikasi;

    @Column(name = "no_sertifikat", nullable = false)
    private String noSertifikat;

    @Column(name = "id_penjaminan", nullable = false)
    private Long idPenjaminan;

    @Column(name = "id_debitur", nullable = false)
    private String idDebitur;

    @Column(name = "tgl_premi", nullable = false)
    private LocalDate tglPremi;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "keterangan")
    private String keterangan;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @Column(name = "json_body")
    @Type(type = "org.hibernate.type.TextType")
    private String jsonBody;

    @Column(name = "penjaminan_ijp_id")
    private Long penjaminanIjpId;

    @Column(name = "tahun_ke")
    private Long tahunKe;

    @Column(name = "service_name", length = 50)
    private String serviceName;

    @Column(name = "json_response")
    @Type(type = "org.hibernate.type.TextType")
    private String jsonResponse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getNoAplikasi() {
        return noAplikasi;
    }

    public void setNoAplikasi(String noAplikasi) {
        this.noAplikasi = noAplikasi;
    }

    public String getNoSertifikat() {
        return noSertifikat;
    }

    public void setNoSertifikat(String noSertifikat) {
        this.noSertifikat = noSertifikat;
    }

    public Long getIdPenjaminan() {
        return idPenjaminan;
    }

    public void setIdPenjaminan(Long idPenjaminan) {
        this.idPenjaminan = idPenjaminan;
    }

    public String getIdDebitur() {
        return idDebitur;
    }

    public void setIdDebitur(String idDebitur) {
        this.idDebitur = idDebitur;
    }

    public LocalDate getTglPremi() {
        return tglPremi;
    }

    public void setTglPremi(LocalDate tglPremi) {
        this.tglPremi = tglPremi;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getJsonBody() {
        return jsonBody;
    }

    public void setJsonBody(String jsonBody) {
        this.jsonBody = jsonBody;
    }

    public Long getPenjaminanIjpId() {
        return penjaminanIjpId;
    }

    public void setPenjaminanIjpId(Long penjaminanIjpId) {
        this.penjaminanIjpId = penjaminanIjpId;
    }

    public Long getTahunKe() {
        return tahunKe;
    }

    public void setTahunKe(Long tahunKe) {
        this.tahunKe = tahunKe;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getJsonResponse() {
        return jsonResponse;
    }

    public void setJsonResponse(String jsonResponse) {
        this.jsonResponse = jsonResponse;
    }

}
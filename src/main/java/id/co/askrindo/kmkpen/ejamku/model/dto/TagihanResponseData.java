package id.co.askrindo.kmkpen.ejamku.model.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nomor_tagihan",
        "nomor_rekening",
        "kode_bank",
        "outstanding",
        "tahun",
        "nilai_ijp",
        "periode",
        "id_tagihan",
        "status_tagihan",
        "keterangan",
        "tgl_bayar",
        "tgl_kirim",
        "nilai_dibayar"
})
@Generated("jsonschema2pojo")
public class TagihanResponseData {

    @JsonProperty("nomor_tagihan")
    private String nomorTagihan;
    @JsonProperty("nomor_rekening")
    private String nomorRekening;
    @JsonProperty("kode_bank")
    private String kodeBank;
    @JsonProperty("outstanding")
    private Integer outstanding;
    @JsonProperty("tahun")
    private Integer tahun;
    @JsonProperty("nilai_ijp")
    private Integer nilaiIjp;
    @JsonProperty("periode")
    private Integer periode;
    @JsonProperty("id_tagihan")
    private Integer idTagihan;
    @JsonProperty("status_tagihan")
    private Integer statusTagihan;
    @JsonProperty("keterangan")
    private String keterangan;
    @JsonProperty("tgl_bayar")
    private String tglBayar;
    @JsonProperty("tgl_kirim")
    private String tglKirim;
    @JsonProperty("nilai_dibayar")
    private Integer nilaiDibayar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nomor_tagihan")
    public String getNomorTagihan() {
        return nomorTagihan;
    }

    @JsonProperty("nomor_tagihan")
    public void setNomorTagihan(String nomorTagihan) {
        this.nomorTagihan = nomorTagihan;
    }

    @JsonProperty("nomor_rekening")
    public String getNomorRekening() {
        return nomorRekening;
    }

    @JsonProperty("nomor_rekening")
    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    @JsonProperty("kode_bank")
    public String getKodeBank() {
        return kodeBank;
    }

    @JsonProperty("kode_bank")
    public void setKodeBank(String kodeBank) {
        this.kodeBank = kodeBank;
    }

    @JsonProperty("outstanding")
    public Integer getOutstanding() {
        return outstanding;
    }

    @JsonProperty("outstanding")
    public void setOutstanding(Integer outstanding) {
        this.outstanding = outstanding;
    }

    @JsonProperty("tahun")
    public Integer getTahun() {
        return tahun;
    }

    @JsonProperty("tahun")
    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    @JsonProperty("nilai_ijp")
    public Integer getNilaiIjp() {
        return nilaiIjp;
    }

    @JsonProperty("nilai_ijp")
    public void setNilaiIjp(Integer nilaiIjp) {
        this.nilaiIjp = nilaiIjp;
    }

    @JsonProperty("periode")
    public Integer getPeriode() {
        return periode;
    }

    @JsonProperty("periode")
    public void setPeriode(Integer periode) {
        this.periode = periode;
    }

    @JsonProperty("id_tagihan")
    public Integer getIdTagihan() {
        return idTagihan;
    }

    @JsonProperty("id_tagihan")
    public void setIdTagihan(Integer idTagihan) {
        this.idTagihan = idTagihan;
    }

    @JsonProperty("status_tagihan")
    public Integer getStatusTagihan() {
        return statusTagihan;
    }

    @JsonProperty("status_tagihan")
    public void setStatusTagihan(Integer statusTagihan) {
        this.statusTagihan = statusTagihan;
    }

    @JsonProperty("keterangan")
    public String getKeterangan() {
        return keterangan;
    }

    @JsonProperty("keterangan")
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @JsonProperty("tgl_bayar")
    public String getTglBayar() {
        return tglBayar;
    }

    @JsonProperty("tgl_bayar")
    public void setTglBayar(String tglBayar) {
        this.tglBayar = tglBayar;
    }

    @JsonProperty("tgl_kirim")
    public String getTglKirim() {
        return tglKirim;
    }

    @JsonProperty("tgl_kirim")
    public void setTglKirim(String tglKirim) {
        this.tglKirim = tglKirim;
    }

    @JsonProperty("nilai_dibayar")
    public Integer getNilaiDibayar() {
        return nilaiDibayar;
    }

    @JsonProperty("nilai_dibayar")
    public void setNilaiDibayar(Integer nilaiDibayar) {
        this.nilaiDibayar = nilaiDibayar;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
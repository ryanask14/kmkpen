package id.co.askrindo.kmkpen.ejamku.model.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rekening_baru",
        "kode_bank",
        "nik",
        "rekening_lama",
        "status_akad",
        "status_rekening",
        "nomor_akad",
        "tgl_akad",
        "tgl_penarikan",
        "tgl_jatuh_tempo",
        "nilai_akad",
        "tgl_penjaminan",
        "nomor_penjaminan",
        "nilai_dijamin",
        "sektor"
})
@Generated("jsonschema2pojo")
@ToString
public class Akad {

    @JsonProperty("rekening_baru")
    private String rekeningBaru;
    @JsonProperty("kode_bank")
    private String kodeBank;
    @JsonProperty("nik")
    private String nik;
    @JsonProperty("rekening_lama")
    private Object rekeningLama;
    @JsonProperty("status_akad")
    private String statusAkad;
    @JsonProperty("status_rekening")
    private Integer statusRekening;
    @JsonProperty("nomor_akad")
    private String nomorAkad;
    @JsonProperty("tgl_akad")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Date tglAkad;
    @JsonProperty("tgl_penarikan")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Date tglPenarikan;
    @JsonProperty("tgl_jatuh_tempo")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Date tglJatuhTempo;
    @JsonProperty("nilai_akad")
    private BigDecimal nilaiAkad;
    @JsonProperty("tgl_penjaminan")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Date tglPenjaminan;
    @JsonProperty("nomor_penjaminan")
    private String nomorPenjaminan;
    @JsonProperty("nilai_dijamin")
    private BigDecimal nilaiDijamin;
    @JsonProperty("sektor")
    private String sektor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rekening_baru")
    public String getRekeningBaru() {
        return rekeningBaru;
    }

    @JsonProperty("rekening_baru")
    public void setRekeningBaru(String rekeningBaru) {
        this.rekeningBaru = rekeningBaru;
    }

    @JsonProperty("kode_bank")
    public String getKodeBank() {
        return kodeBank;
    }

    @JsonProperty("kode_bank")
    public void setKodeBank(String kodeBank) {
        this.kodeBank = kodeBank;
    }

    @JsonProperty("nik")
    public String getNik() {
        return nik;
    }

    @JsonProperty("nik")
    public void setNik(String nik) {
        this.nik = nik;
    }

    @JsonProperty("rekening_lama")
    public Object getRekeningLama() {
        return rekeningLama;
    }

    @JsonProperty("rekening_lama")
    public void setRekeningLama(Object rekeningLama) {
        this.rekeningLama = rekeningLama;
    }

    @JsonProperty("status_akad")
    public String getStatusAkad() {
        return statusAkad;
    }

    @JsonProperty("status_akad")
    public void setStatusAkad(String statusAkad) {
        this.statusAkad = statusAkad;
    }

    @JsonProperty("status_rekening")
    public Integer getStatusRekening() {
        return statusRekening;
    }

    @JsonProperty("status_rekening")
    public void setStatusRekening(Integer statusRekening) {
        this.statusRekening = statusRekening;
    }

    @JsonProperty("nomor_akad")
    public String getNomorAkad() {
        return nomorAkad;
    }

    @JsonProperty("nomor_akad")
    public void setNomorAkad(String nomorAkad) {
        this.nomorAkad = nomorAkad;
    }

    @JsonProperty("tgl_akad")
    public Date getTglAkad() {
        return tglAkad;
    }

    @JsonProperty("tgl_akad")
    public void setTglAkad(Date tglAkad) {
        this.tglAkad = tglAkad;
    }

    @JsonProperty("tgl_penarikan")
    public Date getTglPenarikan() {
        return tglPenarikan;
    }

    @JsonProperty("tgl_penarikan")
    public void setTglPenarikan(Date tglPenarikan) {
        this.tglPenarikan = tglPenarikan;
    }

    @JsonProperty("tgl_jatuh_tempo")
    public Date getTglJatuhTempo() {
        return tglJatuhTempo;
    }

    @JsonProperty("tgl_jatuh_tempo")
    public void setTglJatuhTempo(Date tglJatuhTempo) {
        this.tglJatuhTempo = tglJatuhTempo;
    }

    @JsonProperty("nilai_akad")
    public BigDecimal getNilaiAkad() {
        return nilaiAkad;
    }

    @JsonProperty("nilai_akad")
    public void setNilaiAkad(BigDecimal nilaiAkad) {
        this.nilaiAkad = nilaiAkad;
    }

    @JsonProperty("tgl_penjaminan")
    public Date getTglPenjaminan() {
        return tglPenjaminan;
    }

    @JsonProperty("tgl_penjaminan")
    public void setTglPenjaminan(Date tglPenjaminan) {
        this.tglPenjaminan = tglPenjaminan;
    }

    @JsonProperty("nomor_penjaminan")
    public String getNomorPenjaminan() {
        return nomorPenjaminan;
    }

    @JsonProperty("nomor_penjaminan")
    public void setNomorPenjaminan(String nomorPenjaminan) {
        this.nomorPenjaminan = nomorPenjaminan;
    }

    @JsonProperty("nilai_dijamin")
    public BigDecimal getNilaiDijamin() {
        return nilaiDijamin;
    }

    @JsonProperty("nilai_dijamin")
    public void setNilaiDijamin(BigDecimal nilaiDijamin) {
        this.nilaiDijamin = nilaiDijamin;
    }

    @JsonProperty("sektor")
    public String getSektor() {
        return sektor;
    }

    @JsonProperty("sektor")
    public void setSektor(String sektor) {
        this.sektor = sektor;
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
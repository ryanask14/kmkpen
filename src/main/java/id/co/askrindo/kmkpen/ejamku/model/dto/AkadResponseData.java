package id.co.askrindo.kmkpen.ejamku.model.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
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
        "sektor",
        "aktif"
})
@Generated("jsonschema2pojo")
public class AkadResponseData {

    @JsonProperty("rekening_baru")
    private String rekeningBaru;
    @JsonProperty("kode_bank")
    private String kodeBank;
    @JsonProperty("nik")
    private String nik;
    @JsonProperty("rekening_lama")
    private String rekeningLama;
    @JsonProperty("status_akad")
    private String statusAkad;
    @JsonProperty("status_rekening")
    private Integer statusRekening;
    @JsonProperty("nomor_akad")
    private String nomorAkad;
    @JsonProperty("tgl_akad")
    private String tglAkad;
    @JsonProperty("tgl_penarikan")
    private String tglPenarikan;
    @JsonProperty("tgl_jatuh_tempo")
    private String tglJatuhTempo;
    @JsonProperty("nilai_akad")
    private Integer nilaiAkad;
    @JsonProperty("tgl_penjaminan")
    private String tglPenjaminan;
    @JsonProperty("nomor_penjaminan")
    private String nomorPenjaminan;
    @JsonProperty("nilai_dijamin")
    private Integer nilaiDijamin;
    @JsonProperty("sektor")
    private String sektor;
    @JsonProperty("aktif")
    private Boolean aktif;
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
    public String getRekeningLama() {
        return rekeningLama;
    }

    @JsonProperty("rekening_lama")
    public void setRekeningLama(String rekeningLama) {
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
    public String getTglAkad() {
        return tglAkad;
    }

    @JsonProperty("tgl_akad")
    public void setTglAkad(String tglAkad) {
        this.tglAkad = tglAkad;
    }

    @JsonProperty("tgl_penarikan")
    public String getTglPenarikan() {
        return tglPenarikan;
    }

    @JsonProperty("tgl_penarikan")
    public void setTglPenarikan(String tglPenarikan) {
        this.tglPenarikan = tglPenarikan;
    }

    @JsonProperty("tgl_jatuh_tempo")
    public String getTglJatuhTempo() {
        return tglJatuhTempo;
    }

    @JsonProperty("tgl_jatuh_tempo")
    public void setTglJatuhTempo(String tglJatuhTempo) {
        this.tglJatuhTempo = tglJatuhTempo;
    }

    @JsonProperty("nilai_akad")
    public Integer getNilaiAkad() {
        return nilaiAkad;
    }

    @JsonProperty("nilai_akad")
    public void setNilaiAkad(Integer nilaiAkad) {
        this.nilaiAkad = nilaiAkad;
    }

    @JsonProperty("tgl_penjaminan")
    public String getTglPenjaminan() {
        return tglPenjaminan;
    }

    @JsonProperty("tgl_penjaminan")
    public void setTglPenjaminan(String tglPenjaminan) {
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
    public Integer getNilaiDijamin() {
        return nilaiDijamin;
    }

    @JsonProperty("nilai_dijamin")
    public void setNilaiDijamin(Integer nilaiDijamin) {
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

    @JsonProperty("aktif")
    public Boolean getAktif() {
        return aktif;
    }

    @JsonProperty("aktif")
    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
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

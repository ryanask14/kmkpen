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
        "periode"
})
@Generated("jsonschema2pojo")
public class Tagihan {

    @JsonProperty("nomor_tagihan")
    private String nomorTagihan;
    @JsonProperty("nomor_rekening")
    private String nomorRekening;
    @JsonProperty("kode_bank")
    private String kodeBank;
    @JsonProperty("outstanding")
    private Double outstanding;
    @JsonProperty("tahun")
    private Integer tahun;
    @JsonProperty("nilai_ijp")
    private Integer nilaiIjp;
    @JsonProperty("periode")
    private Integer periode;
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
    public Double getOutstanding() {
        return outstanding;
    }

    @JsonProperty("outstanding")
    public void setOutstanding(Double outstanding) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

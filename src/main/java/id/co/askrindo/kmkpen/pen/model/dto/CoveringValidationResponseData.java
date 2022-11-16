package id.co.askrindo.kmkpen.pen.model.dto;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "noTransaksiBank",
        "cabangRekanan",
        "statusSertifikat",
        "noRekening",
        "noSertifikat",
        "tglSertifikat",
        "tglRekam",
        "linkSertifikat",
        "noSp3",
        "tglSp3",
        "statusDebitur"
})
@Generated("jsonschema2pojo")
public class CoveringValidationResponseData {

    @JsonProperty("noTransaksiBank")
    private String noTransaksiBank;
    @JsonProperty("cabangRekanan")
    private String cabangRekanan;
    @JsonProperty("statusSertifikat")
    private String statusSertifikat;
    @JsonProperty("noRekening")
    private String noRekening;
    @JsonProperty("noSertifikat")
    private String noSertifikat;
    @JsonProperty("tglSertifikat")
    private String tglSertifikat;
    @JsonProperty("tglRekam")
    private String tglRekam;
    @JsonProperty("linkSertifikat")
    private String linkSertifikat;
    @JsonProperty("noSp3")
    private String noSp3;
    @JsonProperty("tglSp3")
    private String tglSp3;
    @JsonProperty("statusDebitur")
    private String statusDebitur;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("noTransaksiBank")
    public String getNoTransaksiBank() {
        return noTransaksiBank;
    }

    @JsonProperty("noTransaksiBank")
    public void setNoTransaksiBank(String noTransaksiBank) {
        this.noTransaksiBank = noTransaksiBank;
    }

    @JsonProperty("cabangRekanan")
    public String getCabangRekanan() {
        return cabangRekanan;
    }

    @JsonProperty("cabangRekanan")
    public void setCabangRekanan(String cabangRekanan) {
        this.cabangRekanan = cabangRekanan;
    }

    @JsonProperty("statusSertifikat")
    public String getStatusSertifikat() {
        return statusSertifikat;
    }

    @JsonProperty("statusSertifikat")
    public void setStatusSertifikat(String statusSertifikat) {
        this.statusSertifikat = statusSertifikat;
    }

    @JsonProperty("noRekening")
    public String getNoRekening() {
        return noRekening;
    }

    @JsonProperty("noRekening")
    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    @JsonProperty("noSertifikat")
    public String getNoSertifikat() {
        return noSertifikat;
    }

    @JsonProperty("noSertifikat")
    public void setNoSertifikat(String noSertifikat) {
        this.noSertifikat = noSertifikat;
    }

    @JsonProperty("tglSertifikat")
    public String getTglSertifikat() {
        return tglSertifikat;
    }

    @JsonProperty("tglSertifikat")
    public void setTglSertifikat(String tglSertifikat) {
        this.tglSertifikat = tglSertifikat;
    }

    @JsonProperty("tglRekam")
    public String getTglRekam() {
        return tglRekam;
    }

    @JsonProperty("tglRekam")
    public void setTglRekam(String tglRekam) {
        this.tglRekam = tglRekam;
    }

    @JsonProperty("linkSertifikat")
    public String getLinkSertifikat() {
        return linkSertifikat;
    }

    @JsonProperty("linkSertifikat")
    public void setLinkSertifikat(String linkSertifikat) {
        this.linkSertifikat = linkSertifikat;
    }

    @JsonProperty("noSp3")
    public String getNoSp3() {
        return noSp3;
    }

    @JsonProperty("noSp3")
    public void setNoSp3(String noSp3) {
        this.noSp3 = noSp3;
    }

    @JsonProperty("tglSp3")
    public String getTglSp3() {
        return tglSp3;
    }

    @JsonProperty("tglSp3")
    public void setTglSp3(String tglSp3) {
        this.tglSp3 = tglSp3;
    }

    @JsonProperty("statusDebitur")
    public String getStatusDebitur() {
        return statusDebitur;
    }

    @JsonProperty("statusDebitur")
    public void setStatusDebitur(String statusDebitur) {
        this.statusDebitur = statusDebitur;
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
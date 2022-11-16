package id.co.askrindo.kmkpen.pen.model.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "noRekening",
        "noIdentitas",
        "nomorAplikasi"
})
@Generated("jsonschema2pojo")
public class InquiryRequest {

    @JsonProperty("noRekening")
    private String noRekening;
    @JsonProperty("noIdentitas")
    private String noIdentitas;
    @JsonProperty("nomorAplikasi")
    private String nomorAplikasi;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("noRekening")
    public String getNoRekening() {
        return noRekening;
    }

    @JsonProperty("noRekening")
    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    @JsonProperty("noIdentitas")
    public String getNoIdentitas() {
        return noIdentitas;
    }

    @JsonProperty("noIdentitas")
    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    @JsonProperty("nomorAplikasi")
    public String getNomorAplikasi() {
        return nomorAplikasi;
    }

    @JsonProperty("nomorAplikasi")
    public void setNomorAplikasi(String nomorAplikasi) {
        this.nomorAplikasi = nomorAplikasi;
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
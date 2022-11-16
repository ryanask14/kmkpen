package id.co.askrindo.kmkpen.pen.model.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "jenisAgunan",
        "jenisPengikatan",
        "nilaiAgunan"
})
@Generated("jsonschema2pojo")
public class ListAgunan {

    @JsonProperty("jenisAgunan")
    private String jenisAgunan;
    @JsonProperty("jenisPengikatan")
    private String jenisPengikatan;
    @JsonProperty("nilaiAgunan")
    private Integer nilaiAgunan;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jenisAgunan")
    public String getJenisAgunan() {
        return jenisAgunan;
    }

    @JsonProperty("jenisAgunan")
    public void setJenisAgunan(String jenisAgunan) {
        this.jenisAgunan = jenisAgunan;
    }

    @JsonProperty("jenisPengikatan")
    public String getJenisPengikatan() {
        return jenisPengikatan;
    }

    @JsonProperty("jenisPengikatan")
    public void setJenisPengikatan(String jenisPengikatan) {
        this.jenisPengikatan = jenisPengikatan;
    }

    @JsonProperty("nilaiAgunan")
    public Integer getNilaiAgunan() {
        return nilaiAgunan;
    }

    @JsonProperty("nilaiAgunan")
    public void setNilaiAgunan(Integer nilaiAgunan) {
        this.nilaiAgunan = nilaiAgunan;
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

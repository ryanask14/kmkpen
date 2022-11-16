package id.co.askrindo.kmkpen.pen.model.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tanggalSaldo",
        "outstanding",
        "angsuranPokok",
        "angsuranBunga",
        "angsuranDenda"
})
@Generated("jsonschema2pojo")
public class ListOutstanding {

    @JsonProperty("tanggalSaldo")
    private String tanggalSaldo;
    @JsonProperty("outstanding")
    private BigDecimal outstanding;
    @JsonProperty("angsuranPokok")
    private BigDecimal angsuranPokok;
    @JsonProperty("angsuranBunga")
    private BigDecimal angsuranBunga;
    @JsonProperty("angsuranDenda")
    private BigDecimal angsuranDenda;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tanggalSaldo")
    public String getTanggalSaldo() {
        return tanggalSaldo;
    }

    @JsonProperty("tanggalSaldo")
    public void setTanggalSaldo(String tanggalSaldo) {
        this.tanggalSaldo = tanggalSaldo;
    }

    @JsonProperty("outstanding")
    public BigDecimal getOutstanding() {
        return outstanding;
    }

    @JsonProperty("outstanding")
    public void setOutstanding(BigDecimal outstanding) {
        this.outstanding = outstanding;
    }

    @JsonProperty("angsuranPokok")
    public BigDecimal getAngsuranPokok() {
        return angsuranPokok;
    }

    @JsonProperty("angsuranPokok")
    public void setAngsuranPokok(BigDecimal angsuranPokok) {
        this.angsuranPokok = angsuranPokok;
    }

    @JsonProperty("angsuranBunga")
    public BigDecimal getAngsuranBunga() {
        return angsuranBunga;
    }

    @JsonProperty("angsuranBunga")
    public void setAngsuranBunga(BigDecimal angsuranBunga) {
        this.angsuranBunga = angsuranBunga;
    }

    @JsonProperty("angsuranDenda")
    public BigDecimal getAngsuranDenda() {
        return angsuranDenda;
    }

    @JsonProperty("angsuranDenda")
    public void setAngsuranDenda(BigDecimal angsuranDenda) {
        this.angsuranDenda = angsuranDenda;
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

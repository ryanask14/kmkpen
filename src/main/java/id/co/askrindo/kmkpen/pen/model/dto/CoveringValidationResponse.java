package id.co.askrindo.kmkpen.pen.model.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "message",
        "transactionID",
        "trxDateResponse",
        "data"
})
@Generated("jsonschema2pojo")
public class CoveringValidationResponse {

    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("transactionID")
    private String transactionID;
    @JsonProperty("trxDateResponse")
    private String trxDateResponse;
    @JsonProperty("data")
    private CoveringValidationResponseData data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public Boolean getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("transactionID")
    public String getTransactionID() {
        return transactionID;
    }

    @JsonProperty("transactionID")
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    @JsonProperty("trxDateResponse")
    public String getTrxDateResponse() {
        return trxDateResponse;
    }

    @JsonProperty("trxDateResponse")
    public void setTrxDateResponse(String trxDateResponse) {
        this.trxDateResponse = trxDateResponse;
    }

    @JsonProperty("data")
    public CoveringValidationResponseData getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(CoveringValidationResponseData data) {
        this.data = data;
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

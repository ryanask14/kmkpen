package id.co.askrindo.kmkpen.pen.model.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "errorCode",
        "errorType",
        "errorMessage",
        "trxDateResponse",
        "cabangRekanan"
})
@Generated("jsonschema2pojo")
public class ListError {

    public ListError(Boolean status, String errorCode, String errorType, String errorMessage, String trxDateResponse, String cabangRekanan) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorType = errorType;
        this.errorMessage = errorMessage;
        this.trxDateResponse = trxDateResponse;
        this.cabangRekanan = cabangRekanan;
    }

    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("errorCode")
    private String errorCode;
    @JsonProperty("errorType")
    private String errorType;
    @JsonProperty("errorMessage")
    private String errorMessage;
    @JsonProperty("trxDateResponse")
    private String trxDateResponse;
    @JsonProperty("cabangRekanan")
    private String cabangRekanan;
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

    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("errorType")
    public String getErrorType() {
        return errorType;
    }

    @JsonProperty("errorType")
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty("errorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @JsonProperty("trxDateResponse")
    public String getTrxDateResponse() {
        return trxDateResponse;
    }

    @JsonProperty("trxDateResponse")
    public void setTrxDateResponse(String trxDateResponse) {
        this.trxDateResponse = trxDateResponse;
    }

    @JsonProperty("cabangRekanan")
    public String getCabangRekanan() {
        return cabangRekanan;
    }

    @JsonProperty("cabangRekanan")
    public void setCabangRekanan(String cabangRekanan) {
        this.cabangRekanan = cabangRekanan;
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
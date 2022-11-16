package id.co.askrindo.kmkpen.pen.model.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "error",
        "trxDateResponse",
        "listError"
})
@Generated("jsonschema2pojo")
public class CoveringValidationResponseTolak {

    public CoveringValidationResponseTolak(Boolean error, String trxDateResponse, List<ListError> listError) {
        this.error = error;
        this.trxDateResponse = trxDateResponse;
        this.listError = listError;
    }

    @JsonProperty("error")
        private Boolean error;
        @JsonProperty("trxDateResponse")
        private String trxDateResponse;
        @JsonProperty("listError")
        private List<ListError> listError = null;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("error")
        public Boolean getError() {
            return error;
        }

        @JsonProperty("error")
        public void setError(Boolean error) {
            this.error = error;
        }

        @JsonProperty("trxDateResponse")
        public String getTrxDateResponse() {
            return trxDateResponse;
        }

        @JsonProperty("trxDateResponse")
        public void setTrxDateResponse(String trxDateResponse) {
            this.trxDateResponse = trxDateResponse;
        }

        @JsonProperty("listError")
        public List<ListError> getListError() {
            return listError;
        }

        @JsonProperty("listError")
        public void setListError(List<ListError> listError) {
            this.listError = listError;
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

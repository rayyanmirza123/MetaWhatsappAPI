package com.whatsapp.api.domain.errors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Error data.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorData {
	@JsonProperty("messaging_product") String messagingProduct;
    @JsonProperty("details") String details;
//TODO: convert to List<String>
    @JsonProperty("blame_field_specs") Object blameFieldSpecs;
}

package com.whatsapp.api.domain.errors;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * An object representing errors from the whatsapp api
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {
	
	@JsonProperty("code") Integer code;
	@JsonProperty("details") String details;
    @Deprecated(forRemoval = true)
    @JsonProperty("error_subcode") Integer errorSubcode;

    @JsonProperty("fbtrace_id") String fbtraceId;
    @JsonProperty("message") @JsonAlias({"message",}) String message;
    @JsonProperty("messaging_product") String messagingProduct;
    @JsonProperty("error_data") ErrorData errorData;
    @JsonProperty("type") String type;

    @JsonProperty("is_transient") Boolean isTransient;
    @JsonProperty("error_user_title") String errorUserSubtitle;
    @JsonProperty("error_user_msg") String errorUserMsg;
}

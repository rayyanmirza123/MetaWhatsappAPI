package com.whatsapp.api.domain.media;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Upload response.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UploadResponse {
	@JsonProperty("id") String id;
}

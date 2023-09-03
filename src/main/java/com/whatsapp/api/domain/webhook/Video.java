package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Video.
 *
 * @param sha256   The checksum of the media.
 * @param mimeType The mime type of the media.                 The caption that describes the media.
 * @param caption  Added to Webhooks if it has been previously specified.                 The caption that describes the media.
 * @param id       The ID of the medi
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Video {
	
    @JsonProperty("mime_type") String mimeType;

    @JsonProperty("sha256") String sha256;

    @JsonProperty("caption") String caption;

    @JsonProperty("id") String id;
}

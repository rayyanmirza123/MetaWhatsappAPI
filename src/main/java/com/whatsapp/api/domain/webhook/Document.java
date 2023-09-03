package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * When messages type is set to document, this object is included in the messages object.
 *
 * @param filename Name for the file on the sender's device
 * @param mimeType Mime type of the document file
 * @param sha256   Hash
 * @param id       ID for the document
 * @param caption  Caption for the document, if provided
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Document {

    @JsonProperty("filename") String filename;

    @JsonProperty("mime_type") String mimeType;

    @JsonProperty("sha256") String sha256;

    @JsonProperty("id") String id;

    @JsonProperty("caption") String caption;
}

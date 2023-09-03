package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.whatsapp.api.domain.errors.Error;
import com.whatsapp.api.domain.messages.type.ParameterType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Document parameter.
 */

@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(Include.NON_NULL)
public class DocumentParameter extends Parameter {

    private Document document;


    /**
     * Instantiates a new Document parameter.
     */
    public DocumentParameter() {
        super(ParameterType.DOCUMENT);
    }


    /**
     * Instantiates a new Document parameter.
     *
     * @param document the document
     */
    public DocumentParameter(Document document) {
        super(ParameterType.DOCUMENT);
        this.document = document;
    }

    /**
     * Gets document.
     *
     * @return the document
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets document.
     *
     * @param document the document
     * @return the document
     */
    public DocumentParameter setDocument(Document document) {
        this.document = document;
        return this;
    }
}

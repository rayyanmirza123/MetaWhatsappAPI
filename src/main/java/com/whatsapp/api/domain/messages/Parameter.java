package com.whatsapp.api.domain.messages;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.messages.type.ParameterType;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Parameter.
 */

@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parameter {
    @JsonProperty("type")
    private final ParameterType type;

    /**
     * Instantiates a new Parameter.
     *
     * @param type the type
     */
    protected Parameter(ParameterType type) {
        this.type = type;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public ParameterType getType() {
        return type;
    }
}

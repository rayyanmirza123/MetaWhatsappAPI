package com.whatsapp.api.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Cursors.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cursors {
    @JsonProperty("before") String before;

    @JsonProperty("after") String after;
}
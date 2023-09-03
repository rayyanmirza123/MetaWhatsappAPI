package com.whatsapp.api.domain.phone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.phone.type.CodeMethodType;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Request code.
 *
 * @param codeMethod Required. Specifies the method for verification. Supported options are: SMS or VOICE.
 * @param language   Required. Specifies your locale.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class RequestCode {
	
    @JsonProperty("code_method") CodeMethodType codeMethod;

    @JsonProperty("language") LanguageType language;
}
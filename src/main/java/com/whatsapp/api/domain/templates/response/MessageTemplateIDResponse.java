package com.whatsapp.api.domain.templates.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Message template id response.
 *
 * @deprecated use {@link com.whatsapp.api.domain.templates.MessageTemplate} instead
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
@Deprecated(forRemoval = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageTemplateIDResponse {
	@JsonProperty("id") String id;
}

package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;
import com.whatsapp.api.domain.webhook.type.FieldType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Changes that triggered the Webhooks call.
 *
 * @param field A value object. Contains details of the changes related to the specified field.
 * @param value Contains the type of notification you are getting on that Webhook. Currently, the only option for this API is “messages”.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Change {
	/*
	Contains the type of notification you are getting on that Webhook. Currently, the only option for this API is “messages”.
	 */
	        @JsonProperty("field") FieldType field;
	/*
	A value object. Contains details of the changes related to the specified field.
	 */
	        @JsonProperty("value") Value value;
}
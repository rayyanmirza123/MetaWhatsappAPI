package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Metadata.
 *
 * @param phoneNumberId      The ID of the phone number receiving the Webhooks. You can use this phone_number_id to send messages back to customers.
 * @param displayPhoneNumber The phone number of the business account that is receiving the Webhooks.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Metadata {
	/*
	The ID of the phone number receiving the Webhooks. You can use this phone_number_id to send messages back to customers.
	 */
	        @JsonProperty("phone_number_id") String phoneNumberId;
	/*
	The phone number of the business account that is receiving the Webhooks.
	 */
	        @JsonProperty("display_phone_number") String displayPhoneNumber;
}
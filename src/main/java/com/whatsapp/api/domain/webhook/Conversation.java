package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Conversation.
 *
 * @param expirationTimestamp The timestamp when the current ongoing conversation expires. This field is not present in all Webhook types.
 * @param origin              Describes where the conversation originated from. See {@link Origin} object for more information.
 * @param id                  The ID of the conversation the given status notification belongs to.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Conversation {
    @JsonProperty("expiration_timestamp") String expirationTimestamp;

    @JsonProperty("origin") Origin origin;

    @JsonProperty("id") String id;

}
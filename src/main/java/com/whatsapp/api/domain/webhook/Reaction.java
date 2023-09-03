package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Reaction.
 *
 * @param emoji     The emoji used for the reaction.
 * @param messageId Specifies the wamid of the message received that contained the reaction.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Reaction {
	
    @JsonProperty("emoji") String emoji;

    @JsonProperty("message_id") String messageId;
}
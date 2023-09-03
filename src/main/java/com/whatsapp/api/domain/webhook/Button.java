package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Button.
 *
 * @param payload The developer-defined payload for the button when a business account sends interactive messages.
 * @param text    The button text
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Button {

    @JsonProperty("payload") String payload;

    @JsonProperty("text") String text;
}
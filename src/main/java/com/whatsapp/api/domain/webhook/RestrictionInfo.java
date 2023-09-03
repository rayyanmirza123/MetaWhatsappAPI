package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;
import com.whatsapp.api.domain.webhook.type.RestrictionType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Restriction info.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class RestrictionInfo {
	
    @JsonProperty("restriction_type") RestrictionType restrictionType;

    @JsonProperty("expiration") String expiration;
}

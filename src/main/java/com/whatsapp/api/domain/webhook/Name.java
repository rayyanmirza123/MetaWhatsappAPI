package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Name.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Name {
	
    @JsonProperty("prefix") String prefix;

    @JsonProperty("last_name") String lastName;

    @JsonProperty("middle_name") String middleName;

    @JsonProperty("suffix") String suffix;

    @JsonProperty("first_name") String firstName;

    @JsonProperty("formatted_name") String formattedName;
}
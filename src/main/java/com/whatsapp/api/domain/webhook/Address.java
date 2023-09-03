package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Address.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Address {

    @JsonProperty("zip") String zip;

    @JsonProperty("country") String country;

    @JsonProperty("country_code") String countryCode;

    @JsonProperty("city") String city;

    @JsonProperty("street") String street;

    @JsonProperty("state") String state;

    @JsonProperty("type") String type;
}
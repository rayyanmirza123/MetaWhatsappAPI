package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Location.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Location {
    @JsonProperty("address") String address;

    @JsonProperty("latitude") double latitude;

    @JsonProperty("name") String name;

    @JsonProperty("longitude") double longitude;

    @JsonProperty("url") String url;
}
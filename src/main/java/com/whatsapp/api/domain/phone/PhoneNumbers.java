package com.whatsapp.api.domain.phone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.response.Paging;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The Object with PhoneNumbers
 *
 * @param data   an objetc with a PhoneNumber list
 * @param paging paging
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class PhoneNumbers {
	
    @JsonProperty("data") List<PhoneNumber> data;

    @JsonProperty("paging") Paging paging;
}
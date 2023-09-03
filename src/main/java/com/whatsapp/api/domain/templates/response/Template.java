package com.whatsapp.api.domain.templates.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.Component;
import com.whatsapp.api.domain.templates.type.Category;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type Data item.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Template {
    @JsonProperty("components") List<Component<?>> components;

    @JsonProperty("name") String name;

    @JsonProperty("language") String language;

    @JsonProperty("id") String id;

    @JsonProperty("category") Category category;
    @JsonProperty("previous_category") Category previousCategory;
    @JsonProperty("status") String status;
}
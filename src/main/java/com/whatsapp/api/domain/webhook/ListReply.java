package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type List reply.
 *
 * @param description The description of the selected row.
 * @param id          The unique identifier (ID) of the selected row.
 * @param title       The title of the selected row.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class ListReply {
    @JsonProperty("description")
    String description;

    @JsonProperty("id")
    String id;

    @JsonProperty("title")
    String title;

}
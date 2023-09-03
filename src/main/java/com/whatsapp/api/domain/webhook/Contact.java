package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type Contact.
 *
 * @param profile The {@link Profile} object.
 * @param waId    The WhatsApp ID of the customer. You can send messages using this wa_id.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Contact {
    @JsonProperty("profile") Profile profile;

    @JsonProperty("name") Name name;

    @JsonProperty("phones") List<Phone> phones;

    @JsonProperty("wa_id") String waId;

}
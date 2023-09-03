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
 * Generic webhook class wrapper. All Webhooks messages have this.
 *
 * @param changes Changes that triggered the Webhooks call. This field contains an array of change objects.
 * @param id      The ID of Whatsapp Business Accounts this Webhook belongs to.
 * @param time    Time for the entry. (WhatsApp Business Management API)
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Entry {

    /*
    	Changes that triggered the Webhooks call. This field contains an array of change objects.
     */
    @JsonProperty("changes") List<Change> changes;
    /*
        The ID of Whatsapp Business Accounts this Webhook belongs to.
    */
    @JsonProperty("id") String id;


    @JsonProperty("time") long time;
}
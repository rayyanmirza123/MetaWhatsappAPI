package com.whatsapp.api.domain.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.ButtonType;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Quick reply button.
 */

@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuickReplyButton extends Button {
    /**
     * Instantiates a new Quick reply button.
     */
    protected QuickReplyButton() {
        super(ButtonType.QUICK_REPLY);
    }

    /**
     * Instantiates a new Quick reply button.
     *
     * @param text the text
     */
    public QuickReplyButton(String text) {
        super(ButtonType.QUICK_REPLY, text);
    }


}

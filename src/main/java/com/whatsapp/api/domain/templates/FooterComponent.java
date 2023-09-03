package com.whatsapp.api.domain.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.ComponentType;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Footer component.
 */

@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FooterComponent extends Component<FooterComponent> {


    /**
     * Instantiates a new Footer component.
     */
    public FooterComponent() {
        super(ComponentType.FOOTER);
    }


}

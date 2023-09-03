package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.whatsapp.api.domain.errors.Error;
import com.whatsapp.api.domain.messages.type.ComponentType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(Include.NON_NULL)

public class HeaderComponent extends Component<HeaderComponent> {
    /**
     * Instantiates a new Component.
     */
    public HeaderComponent() {
        super(ComponentType.HEADER);
    }


}

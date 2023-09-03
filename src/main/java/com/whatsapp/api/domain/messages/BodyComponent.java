package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.errors.Error;
import com.whatsapp.api.domain.messages.type.ComponentType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * The type Body component, to send template messages
 */

@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BodyComponent extends Component<BodyComponent> {


    /**
     * Instantiates a new Body component, to send template messages
     */
    public BodyComponent() {
        super(ComponentType.BODY);
    }


}

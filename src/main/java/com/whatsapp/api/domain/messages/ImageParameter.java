package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.errors.Error;
import com.whatsapp.api.domain.messages.type.ParameterType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Image parameter.
 */

@Getter
@Setter
@ToString(includeFieldNames=true)
public class ImageParameter extends Parameter {
    @JsonProperty("image")
    private Image image;

    /**
     * Instantiates a new Image parameter.
     */
    public ImageParameter() {
        super(ParameterType.IMAGE);
    }

    /**
     * Instantiates a new Image parameter.
     *
     * @param image the image
     */
    public ImageParameter(Image image) {
        super(ParameterType.IMAGE);
        this.image = image;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     * @return the image
     */
    public ImageParameter setImage(Image image) {
        this.image = image;
        return this;
    }
}

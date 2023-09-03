package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.messages.type.ParameterType;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Video parameter.
 */

@Getter
@Setter
@ToString(includeFieldNames=true)
public class VideoParameter extends Parameter {
    @JsonProperty("video")
    private Video video;


    /**
     * Instantiates a new Parameter.
     */
    public VideoParameter() {
        super(ParameterType.VIDEO);
    }


    /**
     * Instantiates a new Video parameter.
     *
     * @param type  the type
     * @param video the video
     */
    public VideoParameter(ParameterType type, Video video) {
        super(type);
        this.video = video;
    }

    /**
     * Gets video.
     *
     * @return the video
     */
    public Video getVideo() {
        return video;
    }

    /**
     * Sets video.
     *
     * @param video the video
     * @return the video
     */
    public VideoParameter setVideo(Video video) {
        this.video = video;
        return this;
    }
}

package com.whatsapp.api.domain.media;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.whatsapp.api.domain.messages.Button;
import com.whatsapp.api.domain.messages.Section;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @param fileName file name
 * @param content  file content
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaFile {
	String fileName;
	byte[] content;
}

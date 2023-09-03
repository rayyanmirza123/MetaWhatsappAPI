package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * To mark the message as read, you must first create Read message object
 * 
 * @see <a href="https://developers.facebook.com/docs/whatsapp/cloud-api/guides/mark-message-as-read">API documentation - messages</a>
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class ReadMessage {
	
	@JsonProperty("messaging_product")
    private final String messagingProduct = "whatsapp";
	
    @JsonProperty("status")
    private String status = "read";

    @JsonProperty("message_id")
    private String messageId;

	public ReadMessage(String messageId) {
		super();
		this.messageId = messageId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the messageId
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * @return the messagingProduct
	 */
	public String getMessagingProduct() {
		return messagingProduct;
	}
}

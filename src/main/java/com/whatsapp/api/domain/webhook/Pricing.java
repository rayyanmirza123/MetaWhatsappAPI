package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Pricing.
 *
 * @param pricingModel Type of pricing model being used. Current supported values are:<ul>                     <li>"CBP" (conversation-based pricing): See Conversation-Based Pricing for rates based on recipient country.</li>                     <li>"NBP" (notification-based pricing): Notifications are also known as Template Messages (click here for details on pricing).</li>                     </ul>                     This pricing model will be deprecated in a future release early 2022.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Pricing {
	
    @JsonProperty("pricing_model") String pricingModel;

    @JsonProperty("category") String category;

    @JsonProperty("billable") boolean billable;


}
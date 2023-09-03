package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatsapp.api.domain.templates.type.LanguageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Product.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames=true)
public class Product {
	
    @JsonProperty("quantity") String quantity;

    @JsonProperty("product_retailer_id") String productRetailerId;

    @JsonProperty("item_price") String itemPrice;

    @JsonProperty("currency") String currency;
}
package com.demo.shop.purchase.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemList{
	@JsonProperty("item_id")
	private int itemId;
	private int qty;
}
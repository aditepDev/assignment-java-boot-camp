package com.demo.shop.item.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemDetailResponse {

        @JsonProperty("item_id")
        private long itemId;
        @JsonProperty("item_name")
        private String itemName;
        @JsonProperty("item_description")
        private String itemDetail;
        @JsonProperty("item_price")
        private double itemPrice;
        @JsonProperty("item_image")
        private String itemImage;


}

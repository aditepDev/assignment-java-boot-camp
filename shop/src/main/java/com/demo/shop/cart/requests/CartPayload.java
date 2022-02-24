package com.demo.shop.cart.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CartPayload {
    @JsonProperty("item_id")
    private long itemId;
    private int qty;


    public void validate() throws Exception {

        if(this.itemId <= 0){
        throw new Exception("cart.itemId.error");
        }
        if(this.qty < 0){
           throw new Exception("cart.qty.error");
        }
    }
}

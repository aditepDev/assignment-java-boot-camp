package com.demo.shop.cart.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Checkout {
    @JsonProperty("total_price")
    private double totalPrice;
    @JsonProperty("total_qty")
    private int totalQty;


    public static Checkout packCheckout(List<ItemList> ItemLists) {
        Checkout checkout = new Checkout();
        checkout.setTotalQty(ItemLists.stream().mapToInt(ItemList::getQty).sum());
        checkout.setTotalPrice(ItemLists.stream().mapToDouble(ItemList::getItemPrice).sum() * checkout.getTotalQty());
        return checkout;
    }
}
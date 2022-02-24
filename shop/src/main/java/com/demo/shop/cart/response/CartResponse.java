package com.demo.shop.cart.response;

import java.util.List;

import com.demo.shop.cart.model.Cart;
import com.demo.shop.member.model.Member;
import lombok.Data;

@Data
public class CartResponse {
    private UserDetail userDetail;
    private List<ItemList> itemList;
    private Payment payment;
    private Checkout checkout;

    public static CartResponse packCartResponse(List<Cart> carts, Member member) {
        CartResponse cartResponse = new CartResponse();
        cartResponse.setItemList(ItemList.packItemList(carts));
        cartResponse.setCheckout(Checkout.packCheckout(cartResponse.getItemList()));
        cartResponse.setPayment(Payment.packPayment(member));
        cartResponse.setUserDetail(UserDetail.packUserDetail(member));
        return cartResponse;
    }

}
package com.demo.shop.cart.business;

import com.demo.shop.cart.model.Cart;
import com.demo.shop.cart.requests.CartPayload;
import com.demo.shop.cart.response.CartResponse;
import com.demo.shop.cart.service.CartService;
import com.demo.shop.item.model.Item;
import com.demo.shop.item.service.ItemService;
import com.demo.shop.member.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartBusiness {

    @Autowired
    ItemService itemService;
    @Autowired
    CartService cartService;

    public Cart updateItemCart(CartPayload cartPayload, Member member) throws Exception {

        Cart cart = new Cart();
        Optional<Item> item = itemService.findOneById(cartPayload.getItemId());
        if (item.isPresent()) {
            cart = cartService.checkCartByMemberAndItem(member, item.get());

            cart.setItem(item.get());
            cart.setQty(cartPayload.getQty());
            cart.setMember(member);

            if (cart.getCartId() != 0 && cartPayload.getQty() == 0) {
                cartService.deleteItemOnCart(cart);
            } else if (cartPayload.getQty() != 0) {
                return cart = cartService.saveCart(cart);
            }
        } else {
            throw new Exception("cart.item.null");
        }

        return cart;
    }


    public CartResponse findItemCart(Member member) {
        List<Cart> carts = cartService.findCartByMember(member);
        return CartResponse.packCartResponse(carts, member);
    }

    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }
}

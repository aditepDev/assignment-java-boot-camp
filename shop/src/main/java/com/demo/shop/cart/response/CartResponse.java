package com.demo.shop.cart.response;

import java.util.List;
import lombok.Data;

@Data
public class CartResponse{
	private UserDetail userDetail;
	private List<ItemList> itemList;
	private Payment payment;
	private Checkout checkout;
}
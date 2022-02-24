package com.demo.shop.cart.controller;

import com.demo.shop.cart.business.CartBusiness;
import com.demo.shop.cart.requests.CartPayload;
import com.demo.shop.member.model.Member;
import com.demo.shop.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    CartBusiness cartBusiness;
    @Autowired
    MemberService memberService;

    @PostMapping(value = "")
    public ResponseEntity<Void> updateItemCart(@RequestBody CartPayload cartPayload) throws Exception {
        cartPayload.validate();
        Member member = memberService.memberMork();
        cartBusiness.updateItemCart(cartPayload, member);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}

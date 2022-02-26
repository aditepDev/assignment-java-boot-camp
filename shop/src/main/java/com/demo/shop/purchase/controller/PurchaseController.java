package com.demo.shop.purchase.controller;

import com.demo.shop.member.constant.MemberMork;
import com.demo.shop.member.model.Member;
import com.demo.shop.member.service.MemberService;
import com.demo.shop.purchase.business.PurchaseBusiness;
import com.demo.shop.purchase.model.Purchase;
import com.demo.shop.purchase.response.BillDetail;
import com.demo.shop.purchase.response.CheckOutResponse;
import com.demo.shop.purchase.requests.CheckOutRequest;
import com.demo.shop.purchase.response.PurchaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class PurchaseController {

    @Autowired
    PurchaseBusiness purchaseBusiness;
    @Autowired
    MemberService memberService;

    @PostMapping(value = "/check_out")
    public ResponseEntity<PurchaseResponse> purchase(@RequestBody CheckOutRequest checkOutRequest) throws Exception {
        Member member = memberService.memberMork();

        PurchaseResponse purchaseResponse = purchaseBusiness.checkOut(checkOutRequest, member, UUID.randomUUID().toString());
        return new ResponseEntity<PurchaseResponse>(purchaseResponse,HttpStatus.CREATED);
    }

    @GetMapping(value = "/bill/{invoiceNo}")
    public ResponseEntity<CheckOutResponse> bill(@PathVariable String invoiceNo) throws Exception {
        CheckOutResponse checkOutResponse = purchaseBusiness.bill(invoiceNo);
        return new ResponseEntity<CheckOutResponse>(checkOutResponse,HttpStatus.CREATED);
    }
}

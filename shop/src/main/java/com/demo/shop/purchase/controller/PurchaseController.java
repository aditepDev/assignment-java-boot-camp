package com.demo.shop.purchase.controller;

import com.demo.shop.purchase.business.PurchaseBusiness;
import com.demo.shop.purchase.response.CheckOutResponse;
import com.demo.shop.purchase.requests.CheckOutRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    @Autowired
    PurchaseBusiness purchaseBusiness;

    @PostMapping(value = "/check_out")
    public ResponseEntity<CheckOutResponse> purchase(@RequestBody CheckOutRequest checkOutRequest){
        CheckOutResponse checkOutResponse = purchaseBusiness.CheckOut(checkOutRequest);
        return new ResponseEntity<CheckOutResponse>(checkOutResponse,HttpStatus.CREATED);
    }
}

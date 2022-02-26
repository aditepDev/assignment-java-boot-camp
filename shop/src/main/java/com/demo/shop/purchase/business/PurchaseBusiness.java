package com.demo.shop.purchase.business;

import com.demo.shop.purchase.response.CheckOutResponse;
import com.demo.shop.purchase.requests.CheckOutRequest;
import org.springframework.stereotype.Service;

@Service
public class PurchaseBusiness {


    public CheckOutResponse CheckOut(CheckOutRequest checkOutRequest) {
        CheckOutResponse checkOutResponse = new CheckOutResponse();
        return  checkOutResponse;
    }
}

package com.demo.shop.mork;

import com.demo.shop.cart.model.Cart;
import com.demo.shop.purchase.requests.CheckOutRequest;
import com.demo.shop.purchase.requests.ItemList;
import com.demo.shop.purchase.requests.UserDetail;

import java.util.ArrayList;
import java.util.List;

public class MockPayload {
    public static CheckOutRequest getCheckOutRequest() {
        CheckOutRequest checkOutRequest = new CheckOutRequest();

        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(getItemList());
        checkOutRequest.setItemList(itemLists);
        checkOutRequest.setUserDetail(getUserDetail());


        return checkOutRequest;

    }

    public static UserDetail getUserDetail() {
        UserDetail userDetail = new UserDetail();
        userDetail.setUserName("test test");
        userDetail.setUserAddress("93 ม.3 ต.บ้านเลื่อม อ.เมือง จ.อุดรธานี 41000");
        userDetail.setUserTel("0800000000");
        return userDetail;
    }

    public static  ItemList getItemList(){
        ItemList itemList = new ItemList();
        itemList.setItemId(1);
        itemList.setQty(2);
        return itemList;
    }
}
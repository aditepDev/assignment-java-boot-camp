package com.demo.shop.purchase.business;

import com.demo.shop.item.model.Item;
import com.demo.shop.item.repository.ItemRepository;
import com.demo.shop.item.service.ItemService;
import com.demo.shop.member.model.Member;
import com.demo.shop.mork.MockData;
import com.demo.shop.mork.MockPayload;
import com.demo.shop.purchase.model.Purchase;
import com.demo.shop.purchase.model.PurchaseItem;
import com.demo.shop.purchase.repository.PurchaseItemRepository;
import com.demo.shop.purchase.repository.PurchaseRepository;
import com.demo.shop.purchase.requests.CheckOutRequest;
import com.demo.shop.purchase.requests.ItemList;
import com.demo.shop.purchase.service.PurchaseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DataJpaTest
class PurchaseBusinessTest {
    @Mock
    PurchaseItemRepository purchaseItemRepository;
    @Mock
    PurchaseRepository purchaseRepository;
    @Mock
    ItemRepository itemRepository;

    @InjectMocks
    PurchaseBusiness purchaseBusiness;
    @InjectMocks
    PurchaseService purchaseService;
    @InjectMocks
    ItemService itemService;
    @BeforeEach
    void setup() {
        purchaseService.setPurchaseItemRepository(purchaseItemRepository);
        purchaseService.setPurchaseRepository(purchaseRepository);
        itemService.setItemRepository(itemRepository);
        purchaseBusiness.setPurchaseService(purchaseService);
        purchaseBusiness.setItemService(itemService);

    }


    @Test
    void checkOut() throws Exception {
        // Arrange
        CheckOutRequest payload = MockPayload.getCheckOutRequest();
        Member member = MockData.getMember();
        Item item = MockData.getItem();

        // Act
        // เช็คของ
        // savePurchase
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(1);
        purchase.setAddress(payload.getUserDetail().getUserAddress());
        purchase.setMember(member);
        purchase.setName(payload.getUserDetail().getUserName());
        purchase.setTel(payload.getUserDetail().getUserTel());
        purchase.setQty(2);
        purchase.setTotal(20);
        PurchaseItem purchaseItem = new PurchaseItem();
        purchaseItem.setPurchaseItemId(1);
        purchaseItem.setPurchase(purchase);
        purchaseItem.setItem(item);
        purchaseItem.setQty(payload.getItemList().get(0).getQty());
        purchaseItem.setPrice(item.getItemPrice());
        purchaseItem.setItemDetail(item.getItemDetail());
        purchaseItem.setItemName(item.getItemName());
        purchaseItem.setItemImage("item.jpg");
        List<PurchaseItem> purchaseItems = new ArrayList<>();
        purchaseItems.add(purchaseItem);
        purchase.setPurchaseItem(purchaseItems);

        when(itemRepository.findById(payload.getItemList().get(0).getItemId())).thenReturn(Optional.of(item));
        when(purchaseRepository.save(purchase)).thenReturn(purchase);

        // savePurchaseItem
        purchase  = purchaseRepository.save(purchase);
//        purchase  = purchaseBusiness.checkOut(payload,member);
//        System.out.println(purchase);
        // assert , verify
        assertEquals(1,purchase.getPurchaseItem().size());
    }

}
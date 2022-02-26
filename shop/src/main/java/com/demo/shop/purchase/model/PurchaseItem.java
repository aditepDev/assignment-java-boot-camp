package com.demo.shop.purchase.model;

import com.demo.shop.item.model.Item;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="purchase_item")
public class PurchaseItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long purchaseItemId;
    @ManyToOne
    @JoinColumn(name = "purchase_purchase_id")
    private Purchase purchase;
    @ManyToOne
    @JoinColumn(name = "item_item_id")
    private Item item;
    private String itemName;
    private String itemDetail;
    private String itemImage;
    private int qty;
    private int price;

}

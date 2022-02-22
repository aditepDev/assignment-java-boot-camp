package com.demo.shop.item.model;

import com.demo.shop.item.response.ItemDetailResponse;
import com.demo.shop.item.response.ItemFullDetailResponse;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long itemId;
    public String itemName;
    public double itemPrice;
    public String itemDetail;
    public float itemRating;

    public static ItemFullDetailResponse packItemFullDetail(Item item, List<String> itemImages){
        ItemFullDetailResponse itemDetail = new ItemFullDetailResponse();
        itemDetail.setItemDetail(item.getItemDetail());
        itemDetail.setItemId(item.getItemId());
        itemDetail.setItemImage(itemImages);
        itemDetail.setItemPrice(item.getItemPrice());
        itemDetail.setItemName(item.getItemName());
        itemDetail.setItemRating(item.getItemRating());
        return  itemDetail;
    }

    public static ItemDetailResponse packItemDetail(Item item, ItemImage itemImage){
        ItemDetailResponse itemDetail = new ItemDetailResponse();
        itemDetail.setItemDetail(item.getItemDetail());
        itemDetail.setItemId(item.getItemId());
        itemDetail.setItemImage(itemImage.getItem_image());
        itemDetail.setItemPrice(item.getItemPrice());
        itemDetail.setItemName(item.getItemName());
        return  itemDetail;
    }
}

package com.demo.shop.item.model;

import com.demo.shop.item.response.ItemDetailResponse;
import com.demo.shop.item.response.ItemFullDetailResponse;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    private String itemName;
    private double itemPrice;
    private String itemDetail;
    private float itemRating;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item", cascade = CascadeType.ALL)
    private List<ItemImage> itemImage;

    public static ItemFullDetailResponse packItemFullDetail(Item item) {
        ItemFullDetailResponse itemDetail = new ItemFullDetailResponse();
        itemDetail.setItemDetail(item.getItemDetail());
        itemDetail.setItemId(item.getItemId());
        itemDetail.setItemImage(item.getItemImage().stream().map(ItemImage::getItemImage).collect(Collectors.toList()));
        itemDetail.setItemPrice(item.getItemPrice());
        itemDetail.setItemName(item.getItemName());
        itemDetail.setItemRating(item.getItemRating());
        return itemDetail;
    }

    public static ItemDetailResponse packItemDetail(Item item) {
        ItemDetailResponse itemDetail = new ItemDetailResponse();
        itemDetail.setItemDetail(item.getItemDetail());
        itemDetail.setItemId(item.getItemId());

        String itemItem = null;
        if (!item.getItemImage().isEmpty()) {
            itemItem =  item.getItemImage().stream().map(ItemImage::getItemImage).findFirst().get();
        }

        itemDetail.setItemImage(itemItem);
        itemDetail.setItemPrice(item.getItemPrice());
        itemDetail.setItemName(item.getItemName());
        return itemDetail;
    }
}

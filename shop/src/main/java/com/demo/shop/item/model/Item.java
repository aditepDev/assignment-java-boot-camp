package com.demo.shop.item.model;

import com.demo.shop.item.response.ItemDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.context.annotation.PropertySource;

import javax.persistence.*;

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



    public static ItemDetail packItemDetail(Item item, ItemImage itemImage){
        ItemDetail itemDetail = new ItemDetail();
        itemDetail.setItemDetail(item.getItemDetail());
        itemDetail.setItemId(item.getItemId());
        itemDetail.setItemImage(itemImage.getItem_image());
        itemDetail.setItemPrice(item.getItemPrice());
        itemDetail.setItemName(item.getItemName());
        return  itemDetail;
    }
}

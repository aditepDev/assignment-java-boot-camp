package com.demo.shop.item.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    private String itemName;
    private double itemPrice;
    private String itemDetail;
}

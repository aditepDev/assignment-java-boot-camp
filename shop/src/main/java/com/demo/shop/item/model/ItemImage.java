package com.demo.shop.item.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="item_image")
public class ItemImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long item_image_id;
    private String item_image;
    @ManyToOne
    @JoinColumn(name="item_id")
    private Item item;
}

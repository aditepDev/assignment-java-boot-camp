package com.demo.shop.product.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String productName;
    private double productPrice;
    private String productDetail;
}

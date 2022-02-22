package com.demo.shop.product.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_image_id;
    private String product_image;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
}

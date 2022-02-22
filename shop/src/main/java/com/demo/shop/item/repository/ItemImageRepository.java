package com.demo.shop.item.repository;

import com.demo.shop.item.model.ItemImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemImageRepository extends JpaRepository<ItemImage,Long> {
}

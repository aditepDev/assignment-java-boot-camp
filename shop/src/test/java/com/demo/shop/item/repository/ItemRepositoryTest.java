package com.demo.shop.item.repository;

import com.demo.shop.item.model.Item;
import com.demo.shop.item.service.ItemService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DataJpaTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    @DisplayName("ค้นหาสินค้าด้วยชื่อสินค้า")
    void findAllByItemNameContainingIgnoreCase() {
        // Arrange
        Item item = new Item();
        item.setItemId(1);
        item.setItemDetail("detail");
        item.setItemName("mame");
        item.setItemPrice(10.0);
        item.setItemRating(4);
        itemRepository.save(item);
        // ACt
        List<Item> result = itemRepository.findAllByItemNameContainingIgnoreCase("mame");
        // Assert
        assertEquals(1,result.size());
    }
}
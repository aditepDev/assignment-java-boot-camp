package com.demo.shop.item.business;

import com.demo.shop.item.model.Item;
import com.demo.shop.item.model.ItemImage;
import com.demo.shop.item.repository.ItemRepository;
import com.demo.shop.item.response.ItemDetailResponse;
import com.demo.shop.item.response.ItemFullDetailResponse;
import com.demo.shop.item.service.ItemService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ItemBusinessTest {

    @Mock
    private ItemRepository itemRepository;

    @Test
    @DisplayName("แสดงสินค้่าทั้งหมดในร้าน")
    void findItemAll() {
        // Arrange
        List<Item> items = getItemsMork();
        when(itemRepository.findAll()).thenReturn(items);
        // Act
        ItemService itemService = new ItemService();
        itemService.setItemRepository(itemRepository);

        ItemBusiness itemBusiness = new ItemBusiness();
        itemBusiness.setItemService(itemService);
        List<ItemDetailResponse> result = itemBusiness.findItemAll();
        // assert , verify
        assertEquals(1,result.size());

    }

    @Test
    @DisplayName("ค้นหาสินค้าด้วยชื่อสินค้า")
    void findAllByItemNameLike() {
        // Arrange
        List<Item> items = getItemsMork();
        when(itemRepository.findAllByItemNameContainingIgnoreCase("name")).thenReturn(items);
        // Act
        ItemService itemService = new ItemService();
        itemService.setItemRepository(itemRepository);
        ItemBusiness itemBusiness = new ItemBusiness();
        itemBusiness.setItemService(itemService);
        List<ItemDetailResponse> result = itemBusiness.findAllByItemNameLike("name");
        // assert , verify
        assertEquals(1,result.size());
    }

    @Test
    @DisplayName("แสดงสินค้าตาม Id ที่เลือก")
    void findItemOneById() {
        // Arrange
        Item item = getItemMork();
        when(itemRepository.findById(1L)).thenReturn(Optional.of(item));
        // Acc
        ItemService itemService = new ItemService();
        itemService.setItemRepository(itemRepository);
        ItemBusiness itemBusiness = new ItemBusiness();
        itemBusiness.setItemService(itemService);
        ItemFullDetailResponse result = itemBusiness.findItemOneById(1L);
        // assert , verify
        assertEquals(1,result.getItemId());

    }

    private List<Item> getItemsMork() {
        List<Item> items = new ArrayList<>();
        items.add(getItemMork());
        return items;
    }
    private Item getItemMork() {
        Item item = new Item();
        item.setItemId(1);
        item.setItemDetail("detail");
        item.setItemName("mame");
        item.setItemPrice(10.0);
        item.setItemRating(4);
        List<ItemImage>  itemImages = new ArrayList<>();
        ItemImage itemImage = new ItemImage();
        itemImage.setItemImage("item.jpg");
        itemImage.setItem(item);
        itemImage.setItemImageId(1);
        itemImages.add(itemImage);
        item.setItemImage(itemImages);
        return item;
    }
}
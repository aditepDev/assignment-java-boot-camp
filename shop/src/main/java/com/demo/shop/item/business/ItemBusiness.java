package com.demo.shop.item.business;

import com.demo.shop.item.model.Item;
import com.demo.shop.item.model.ItemImage;
import com.demo.shop.item.response.ItemDetailResponse;
import com.demo.shop.item.response.ItemFullDetailResponse;
import com.demo.shop.item.service.ItemImageService;
import com.demo.shop.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemBusiness {

    @Autowired
    ItemService itemService;
    @Autowired
    ItemImageService itemImageService;

    public List<ItemDetailResponse> findItemAll() {
       List<Item> items  = itemService.findAll();
        return getItemDetails(items);
    }


    public List<ItemDetailResponse> findAllByItemNameLike(String name) {
        List<Item> items =  itemService.findAllByItemNameLike(name);
        return getItemDetails(items);
    }


    public ItemFullDetailResponse findItemOneById(long itemId){
        Optional<Item> itemOptional = itemService.findOneById(itemId);
    if (itemOptional.isPresent()){
        List<String> itemImage = itemImageService.findAllByItem(itemOptional.get()).stream().map(ItemImage::getItem_image).collect(Collectors.toList());
        return Item.packItemFullDetail(itemOptional.get(),itemImage);
    }
        return new ItemFullDetailResponse();

    }

    private List<ItemDetailResponse> getItemDetails(List<Item> items) {
        List<ItemDetailResponse> itemDetails = new ArrayList<>();
        for (Item item: items) {
            ItemImage itemImage = itemImageService.findTopByItem(item);
            ItemDetailResponse itemDetail = Item.packItemDetail(item,itemImage);
            itemDetails.add(itemDetail);
        }
        return itemDetails;
    }

}

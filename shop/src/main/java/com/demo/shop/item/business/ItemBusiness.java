package com.demo.shop.item.business;

import com.demo.shop.item.model.Item;
import com.demo.shop.item.model.ItemImage;
import com.demo.shop.item.response.ItemDetail;
import com.demo.shop.item.service.ItemImageService;
import com.demo.shop.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemBusiness {

    @Autowired
    ItemService itemService;
    @Autowired
    ItemImageService itemImageService;

    public List<ItemDetail> findItemAll() {
       List<Item> items  = itemService.findAll();
        return getItemDetails(items);
    }


    public List<ItemDetail> findAllByItemNameLike(String name) {
        List<Item> items =  itemService.findAllByItemNameLike(name);
        return getItemDetails(items);
    }



    private List<ItemDetail> getItemDetails(List<Item> items) {
        List<ItemDetail> itemDetails = new ArrayList<>();
        for (Item item: items) {
            ItemImage itemImage = itemImageService.findTopByItem(item);
            ItemDetail  itemDetail = Item.packItemDetail(item,itemImage);
            itemDetails.add(itemDetail);
        }
        return itemDetails;
    }

}

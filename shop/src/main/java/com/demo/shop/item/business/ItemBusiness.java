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
        return ItemDetailResponse.packItemDetail(itemService.findAll());
    }

    public List<ItemDetailResponse> findAllByItemNameLike(String name) {
        return ItemDetailResponse.packItemDetail(itemService.findAllByItemNameLike(name));
    }

    public ItemFullDetailResponse findItemOneById(long itemId){
        return ItemFullDetailResponse.packItemFullDetail(itemService.findOneById(itemId));
    }


}

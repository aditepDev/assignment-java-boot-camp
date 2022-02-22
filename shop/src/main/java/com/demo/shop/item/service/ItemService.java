package com.demo.shop.item.service;

import com.demo.shop.item.model.Item;
import com.demo.shop.item.model.ItemImage;
import com.demo.shop.item.repository.ItemRepository;
import com.demo.shop.item.response.ItemDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> findAll(){
    return itemRepository.findAll();
    }

    public List<Item> findAllByItemNameLike(String name){
        return itemRepository.findAllByItemNameContainingIgnoreCase(name);
    }



}

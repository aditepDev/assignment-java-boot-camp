package com.demo.shop.item.service;

import com.demo.shop.item.model.Item;
import com.demo.shop.item.model.ItemImage;
import com.demo.shop.item.repository.ItemImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemImageService {
        @Autowired
        ItemImageRepository itemImageRepository;

        public ItemImage findTopByItem(Item item){
                return  itemImageRepository.findTopByItem(item);
        }
}

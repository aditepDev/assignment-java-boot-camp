package com.demo.shop.item.controller;

import com.demo.shop.item.business.ItemBusiness;
import com.demo.shop.item.model.Item;
import com.demo.shop.item.response.ItemDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    ItemBusiness itemBusiness;

    @GetMapping(value = "/")
    public ResponseEntity<List<ItemDetail>> findProductAll() {
        return ResponseEntity.ok(itemBusiness.findItemAll());
    }

    @GetMapping(value = "")
    public ResponseEntity<List<ItemDetail>> findProductFilter(@RequestParam String name) {
        System.out.println(name);
        return ResponseEntity.ok(itemBusiness.findAllByItemNameLike(name));
    }
}
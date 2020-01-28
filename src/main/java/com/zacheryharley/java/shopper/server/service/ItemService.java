package com.zacheryharley.java.shopper.server.service;

import com.zacheryharley.java.shopper.server.model.Item;

import java.util.UUID;

public class ItemService {

    public Item getByBarcode(String barcode){
        Item item = new Item();
        item.setBarcode(barcode);
        item.setId(UUID.randomUUID().toString());
        item.setName("Beans");
        return item;
    }

    public Item getById(String itemId) {
        Item item = new Item();
        item.setBarcode("1010101010101010");
        item.setId(itemId);
        item.setName("Beans");
        return item;
    }
}

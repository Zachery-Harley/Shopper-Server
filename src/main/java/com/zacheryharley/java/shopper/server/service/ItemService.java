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

}

package com.zacheryharley.java.shopper.server.controller;

import com.zacheryharley.java.shopper.server.model.Item;
import com.zacheryharley.java.shopper.server.model.ItemRepresentation;
import com.zacheryharley.java.shopper.server.model.assembler.ItemRepresentationAssembler;
import com.zacheryharley.java.shopper.server.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1.0/items")
public class ItemController {
    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping(path = "/barcode/{barcode}")
    public ItemRepresentation getItemByBarcode(@PathVariable String barcode) {
        ItemRepresentationAssembler model = new ItemRepresentationAssembler();
        return model.toModel(itemService.getByBarcode(barcode));
    }

    @GetMapping(path = "/{itemId}")
    public Item getItem(@PathVariable String itemId) {
        return itemService.getById(itemId);
    }

}

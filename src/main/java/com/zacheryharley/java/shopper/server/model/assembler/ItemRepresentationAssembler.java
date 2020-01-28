package com.zacheryharley.java.shopper.server.model.assembler;

import com.zacheryharley.java.shopper.server.controller.ItemController;
import com.zacheryharley.java.shopper.server.model.Item;
import com.zacheryharley.java.shopper.server.model.ItemRepresentation;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class ItemRepresentationAssembler extends RepresentationModelAssemblerSupport<Item, ItemRepresentation> {

    public ItemRepresentationAssembler() {
        super(ItemController.class, ItemRepresentation.class);
    }

    @Override
    public ItemRepresentation toModel(Item entity) {
        ItemRepresentation itemModel = this.createModelWithId(entity.getId(), entity);
        itemModel.setName(entity.getName());
        return itemModel;
    }
}

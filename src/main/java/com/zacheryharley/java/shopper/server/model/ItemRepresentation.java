package com.zacheryharley.java.shopper.server.model;

import org.springframework.hateoas.RepresentationModel;

public class ItemRepresentation extends RepresentationModel<ItemRepresentation> {
    private String name;
    private String barcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

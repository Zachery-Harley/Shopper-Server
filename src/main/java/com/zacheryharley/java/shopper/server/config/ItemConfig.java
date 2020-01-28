package com.zacheryharley.java.shopper.server.config;

import com.zacheryharley.java.shopper.server.controller.ItemController;
import com.zacheryharley.java.shopper.server.service.ItemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ItemConfig {

    @Bean
    public ItemController getItemController(ItemService itemService) {
        return new ItemController(itemService);
    }

    @Bean
    public ItemService getItemService() {
        return new ItemService();
    }

}

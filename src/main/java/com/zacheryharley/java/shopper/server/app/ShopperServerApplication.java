package com.zacheryharley.java.shopper.server.app;

import com.zacheryharley.java.shopper.server.config.ItemConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(ItemConfig.class)
@SpringBootApplication
public class ShopperServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopperServerApplication.class, args);
    }

}

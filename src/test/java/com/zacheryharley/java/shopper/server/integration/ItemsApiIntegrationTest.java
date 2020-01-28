package com.zacheryharley.java.shopper.server.integration;

import com.zacheryharley.java.shopper.server.util.SampleBarcode;
import org.junit.jupiter.api.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.client.Traverson;

import javax.annotation.Resources;
import java.net.URI;
import java.net.URISyntaxException;

public class ItemsApiIntegrationTest extends RestBaseIntegrationTest {
    private static final String GET_ITEMS_BY_BARCODE = "/api/v1.0/items/barcode?barcode=";
    private static final String GET_ITEMS_BY_NAME = "/api/v1.0/items/search/?name=";
    private static final String GET_ITEMS_BY_STORE = "/api/v1.0/items/search/?shop=";
    private static final String GET_ITEMS_BY_CATEGORY = "/api/v1.0/items/search/?category=";

    @Test
    public void shouldGetItemWithValidBarCode() throws URISyntaxException {
        Traverson traverson = new Traverson(new URI(baseURL() + GET_ITEMS_BY_BARCODE + SampleBarcode.EAN13()), MediaTypes.HAL_JSON);
        traverson.follow("items");
    }

}

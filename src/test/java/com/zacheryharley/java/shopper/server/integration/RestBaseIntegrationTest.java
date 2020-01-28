package com.zacheryharley.java.shopper.server.integration;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestBaseIntegrationTest {
    private static final String BASE_URL = "http://localhost:";

    @LocalServerPort
    int serverPort;

    @Autowired
    TestRestTemplate restTemplate;

    String baseURL() {
        return BASE_URL + serverPort;
    }

}

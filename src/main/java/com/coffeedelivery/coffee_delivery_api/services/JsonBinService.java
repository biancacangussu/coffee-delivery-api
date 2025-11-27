package com.coffeedelivery.coffee_delivery_api.services;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class JsonBinService {

    private final RestTemplate restTemplate;

    public JsonBinService() {
        this.restTemplate = new RestTemplate();
    }

    private final String BIN_ID = "69279061ae596e708f730f4b";
    private final String API_KEY = "$2a$10$xuS3VKdNNM2t8OgH3BXNm.G/6ZB6tU7sLGHP.k7uapgUh.juo2Sk6";

    public Map<String, Object> getData() {
        String url = "https://api.jsonbin.io/v3/b/" + BIN_ID;

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Master-Key", API_KEY);

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<Map> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                Map.class
        );

        return (Map<String, Object>) response.getBody().get("record");
    }

    public void updateData(Map<String, Object> data) {
        String url = "https://api.jsonbin.io/v3/b/" + BIN_ID;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-Master-Key", API_KEY);

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(data, headers);

        restTemplate.exchange(url, HttpMethod.PUT, entity, String.class);
    }
}

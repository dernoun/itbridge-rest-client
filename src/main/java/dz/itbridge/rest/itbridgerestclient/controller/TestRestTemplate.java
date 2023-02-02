package dz.itbridge.rest.itbridgerestclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestTemplate {

    @GetMapping("/")
    public String getDataString() {
        return "it works";
    }
    
}

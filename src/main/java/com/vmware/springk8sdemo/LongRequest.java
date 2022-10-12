package com.vmware.springk8sdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LongRequest {

    @GetMapping("/longrequest")
    public String longRequest(){
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Request done after 10 seconds";
    }

    @GetMapping("/overlylongrequest")
    public String overlyLongRequest(){
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "This overly long request should never return anything";
    }
}

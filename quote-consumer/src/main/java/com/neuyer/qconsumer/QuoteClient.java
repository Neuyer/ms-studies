package com.neuyer.qconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "ms-quotes", url = "http://localhost:8765/ms-quotes")
public interface QuoteClient {
    @GetMapping("/quotes")
    public String getQuote();
}

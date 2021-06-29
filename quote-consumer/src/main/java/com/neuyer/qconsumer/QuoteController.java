package com.neuyer.qconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

    @Autowired
    QuoteClient quoteClient;

    @GetMapping
    public ResponseEntity<String> getDia() {
        String message = quoteClient.getQuote();

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}

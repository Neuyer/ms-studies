package com.neuyer.msquotes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class QuotesController {

    @GetMapping
    public ResponseEntity<String> getQuote() {
        return new ResponseEntity<String>("Bom dia!", HttpStatus.OK);
    }

    @GetMapping("/error")
    public ResponseEntity<String> getError() {
        throw new RuntimeException("shiiiiii");
//        return new ResponseEntity<String>("Bom dia!", HttpStatus.OK);
    }

}

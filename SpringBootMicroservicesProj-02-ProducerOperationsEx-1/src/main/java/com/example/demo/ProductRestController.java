package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductRestController {
    @GetMapping("/show")
    public ResponseEntity<String> showMsg() {
            ResponseEntity<String> resp = 
                            new ResponseEntity<String>("WELCOME", HttpStatus.OK);
            return resp;
    }
}
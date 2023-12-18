package com.apps.appproduct.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/product")
@RestController
public class ProductController {

    @GetMapping("/health-check")
    public String check() {
        log.info("PRODUCT CONTROLLER");
        return"product ok";
    }

}

package com.apps.apporder.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @GetMapping("/health-check")
    public String check() {
        log.info("ORDER CONTROLLER");
        return "order ok";
    }

}

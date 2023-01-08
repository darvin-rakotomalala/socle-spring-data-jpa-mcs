package com.poc.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @ApiOperation(value = "health check")
    @GetMapping("/healthz")
    public Boolean healthz() {
        return true;
    }

}

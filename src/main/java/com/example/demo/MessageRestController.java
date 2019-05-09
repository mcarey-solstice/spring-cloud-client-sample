package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageRestController {

    @Value("${message:Hello default}")
    private String message;

    @Value("${version:0.0.1}")
    private String version;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }

    @RequestMapping("/version")
    String getVersion() { return this.version; }
}

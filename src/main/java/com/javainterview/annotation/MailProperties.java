package com.javainterview.annotation;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "mail")
@Data
@Component
public class MailProperties {

    private String from;
    private String host;
    private String port;
}

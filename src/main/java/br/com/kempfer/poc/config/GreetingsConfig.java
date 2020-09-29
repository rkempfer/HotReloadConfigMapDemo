package br.com.kempfer.poc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = "greeting")
public class GreetingsConfig {

    private String message = "default message";

    public String getMessage() {
        return this.message;
    }

    public void setMessage (String message) {
        this.message = message;
    }
}

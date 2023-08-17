package com.bartek.GitHub.config;

import feign.Retryer;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

public class FeignConfig {
    @Bean
    public Retryer retryer() {
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 6);
    }
    @Bean
    public ErrorDecoder errorDecoder() {
        return new MyErrorDecoder();
    }
}

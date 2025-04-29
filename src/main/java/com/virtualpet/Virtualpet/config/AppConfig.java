package com.virtualpet.Virtualpet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.text.NumberFormat;
import java.util.Locale;

@Configuration
public class AppConfig {

    @Bean
    public NumberFormat currencyFormatter() {
        return NumberFormat.getCurrencyInstance(Locale.US);
    }
}
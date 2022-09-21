package com.example.springutf8;

import org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

@Configuration
public class FiltersUTF8Config {

    @Bean
    public OrderedCharacterEncodingFilter setUTF8OrderedCharacterEncodingFilter() {
        var filter = new OrderedCharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        filter.setOrder(HIGHEST_PRECEDENCE);
        return filter;
    }

}

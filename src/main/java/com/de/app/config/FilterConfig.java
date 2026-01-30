package com.de.app.config;

import com.de.app.filter.AuthenticationFilter;
import com.de.app.filter.LoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {


    @Bean
    public FilterRegistrationBean<LoggingFilter> logFilter(LoggingFilter filter) {
        FilterRegistrationBean<LoggingFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(filter);
        registrationBean.setOrder(1); // runs first
        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean<AuthenticationFilter> authFilter(AuthenticationFilter filter) {
        FilterRegistrationBean<AuthenticationFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(filter);
        registrationBean.setOrder(3); // run after logFilter
        return registrationBean;
    }
}
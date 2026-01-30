package com.de.app.filter;

import jakarta.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AuthenticationFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(AuthenticationFilter.class);
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        logger.info("AuthenticationFilter executed");
        chain.doFilter(request, response);
    }
}
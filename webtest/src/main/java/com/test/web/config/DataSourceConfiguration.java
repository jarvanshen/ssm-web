package com.test.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfiguration {

    @Value("${webtest.private.material}")
    private String salt;

    public String getSalt() {
        return salt;
    }
}

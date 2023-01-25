package com.pos.configurations;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class GolbalConfiguration {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder data = DataSourceBuilder.create();
        data.driverClassName("org.h2.Driver");
        data.url("jdbc:h2:mem:testDb");
        data.username("SA");
        data.password("");
        return data.build();
    }
}

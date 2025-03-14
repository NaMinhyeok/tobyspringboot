package org.nmh.tobyspringboot;

import jakarta.annotation.PostConstruct;
import org.nmh.config.MySpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@MySpringBootApplication
public class TobyspringbootApplication {
    private final JdbcTemplate jdbcTemplate;

    public TobyspringbootApplication(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    void init() {
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS hello (name varchar(50) PRIMARY KEY, count int)");
    }

    public static void main(String[] args) {
        SpringApplication.run(TobyspringbootApplication.class, args);
    }

}

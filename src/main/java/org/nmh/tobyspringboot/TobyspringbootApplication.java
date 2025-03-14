package org.nmh.tobyspringboot;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
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

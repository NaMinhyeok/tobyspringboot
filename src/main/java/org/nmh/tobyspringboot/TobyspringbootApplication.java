package org.nmh.tobyspringboot;

import org.nmh.config.MySpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@MySpringBootApplication
public class TobyspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TobyspringbootApplication.class, args);
    }

}

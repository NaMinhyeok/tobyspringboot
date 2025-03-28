package org.nmh.tobyspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RequestMapping
@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(String name) {

        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        return helloService.sayHello(Objects.requireNonNull(name));
    }

    @GetMapping("/count")
    public String count(String name) {
        return name + ": " + helloService.countOf(name);
    }
}

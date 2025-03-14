package org.nmh.tobyspringboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.IntStream;

@HelloBootTest
public class HelloServiceCountTest {
    @Autowired
    private HelloService helloService;
    @Autowired
    private HelloRepository helloRepository;

    @Test
    void sayHelloIncreaseCount() {
        IntStream.rangeClosed(1, 10).forEach(count -> {
            helloService.sayHello("Minhyeok");
            Assertions.assertThat(helloRepository.countOf("Minhyeok")).isEqualTo(count);
        });
    }
}

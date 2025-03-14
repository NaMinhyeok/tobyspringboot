package org.nmh.tobyspringboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
public class HelloRepositoryTest {
    @Autowired
    private HelloRepository helloRepository;

    @Test
    void findHelloFailed() {
        Assertions.assertThat(helloRepository.findHello("Minhyeok")).isNull();
    }

    @Test
    void increaseCount() {
        Assertions.assertThat(helloRepository.countOf("Minhyeok")).isEqualTo(0);

        helloRepository.increaseCount("Minhyeok");
        Assertions.assertThat(helloRepository.countOf("Minhyeok")).isEqualTo(1);

        helloRepository.increaseCount("Minhyeok");
        Assertions.assertThat(helloRepository.countOf("Minhyeok")).isEqualTo(2);
    }
}

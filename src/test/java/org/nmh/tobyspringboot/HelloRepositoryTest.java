package org.nmh.tobyspringboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@HelloBootTest
public class HelloRepositoryTest {
    @Autowired
    private HelloRepository helloRepository;

    @Test
    void findHelloFailed() {
        Hello actual = helloRepository.findHello("Minhyeok");
        Assertions.assertThat(actual).isNull();
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

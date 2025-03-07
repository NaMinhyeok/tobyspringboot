package org.nmh.tobyspringboot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.api.BDDAssertions.thenThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

public class HelloControllerTest {
    @Test
    void helloController() {
        // given
        HelloController helloController = new HelloController(name -> name);
        // when
        String actual = helloController.hello("Test");
        // then
        then(actual).isEqualTo("Test");
    }

    @Test
    void failsHelloController() {
        // given
        HelloController helloController = new HelloController(name -> name);
        // when
        // then
        assertAll(
            ()->thenThrownBy(()->helloController.hello(null))
                .isInstanceOf(IllegalArgumentException.class),
            ()->thenThrownBy(()->helloController.hello("      "))
                .isInstanceOf(IllegalArgumentException.class)
        );
    }
}

package org.nmh.tobyspringboot;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.*;

public class HelloServiceTest {

    @Test
    void simpleHelloService() {
        // given
        SimpleHelloService helloService = new SimpleHelloService();
        // when
        String actual = helloService.sayHello("Test");
        // then
        then(actual).isEqualTo("Hello Test");
    }

    @Test
    void helloDecorator() {
        // given
        HelloDecorator decorator = new HelloDecorator(name -> name);
        // when
        String actual = decorator.sayHello("Test");
        // then
        then(actual).isEqualTo("*Test*");
    }
}

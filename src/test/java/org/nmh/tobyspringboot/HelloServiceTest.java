package org.nmh.tobyspringboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.*;

public class HelloServiceTest {

    @Test
    void simpleHelloService() {
        // given
        SimpleHelloService helloService = new SimpleHelloService(helloRepositoryStub);
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

    private static final HelloRepository helloRepositoryStub = new HelloRepository() {
        @Override
        public Hello findHello(String name) {
            return null;
        }

        @Override
        public void increaseCount(String name) {

        }
    };
}

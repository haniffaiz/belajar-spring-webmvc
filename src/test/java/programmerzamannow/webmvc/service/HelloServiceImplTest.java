package programmerzamannow.webmvc.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloServiceImplTest {

    @Autowired
    private HelloService helloService;
    //yang di expose interfacenya

    @Test
    void helloGuest() {
        assertEquals("Hello Guest", helloService.hello(null));
        assertEquals("Hello Hanif", helloService.hello("Hanif"));
    }
}
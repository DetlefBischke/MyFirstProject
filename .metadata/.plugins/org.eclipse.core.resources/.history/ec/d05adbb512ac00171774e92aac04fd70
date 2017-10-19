package com.db.app.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by phoenix on 14.08.17.
 */
public class HelloTest {

    private MainService mainService;

    @BeforeEach
    public void setup() {
       mainService=MainServiceFactory.getInstance();
    }

    @Test
    @DisplayName("Das ist der Hello Test")
    public void helloTest() {
        assertEquals("Hello World",mainService.sayHello());
    }

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }
}

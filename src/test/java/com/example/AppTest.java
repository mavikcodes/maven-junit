package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void greetShouldIncludeName() {
        String result = App.greet("Ana");
        assertEquals("Hello, Ana!", result);
    }

    @Test
    void greetDefault() {
        String result = App.greet("");
        assertEquals("Hello, !", result);
    }
}
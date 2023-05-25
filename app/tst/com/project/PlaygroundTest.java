package com.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlaygroundTest {
    @Test
    void appHasAGreeting() {
        Playground classUnderTest = new Playground();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}

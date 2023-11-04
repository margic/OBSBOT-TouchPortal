package com.margic.obsbot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PluginTest {
    @Test void appHasAGreeting() {
        Plugin classUnderTest = new Plugin();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}

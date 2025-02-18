package es.unileon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class JacocoTest {

    @Test
    public void whenEmptyString_thenAccept() {
        Jacoco palindromeTester = new Jacoco();
        assertFalse(palindromeTester.isEmpty(""));
        assertTrue(palindromeTester.isEmpty("True"));
    }
}
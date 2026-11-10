package com.example.vvce.calsi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
    void testAddition() {
        assertEquals(15.0, App.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5.0, App.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50.0, App.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, App.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> App.divide(10, 0)
        );
    }


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}

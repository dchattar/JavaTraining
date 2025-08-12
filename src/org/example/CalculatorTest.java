package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testDividePositiveNumbers() {
        Calculator demo = new Calculator();
        assertEquals(2, demo.divide(4, 2));
    }

    @Test
    void testDivideNegativeNumbers() {
        Calculator demo = new Calculator();
        assertEquals(-2, demo.divide(-4, 2));
        assertEquals(-2, demo.divide(4, -2));
        assertEquals(2, demo.divide(-4, -2));
    }

    @Test
    void testDivideByZero() {
        Calculator demo = new Calculator();
        assertDoesNotThrow(() -> demo.divide(4, 0));
    }

    @Test
    void testDivideZeroNumerator() {
        Calculator demo = new Calculator();
        assertEquals(0, demo.divide(0, 5));
    }

    @Test
    void testMultiplyPositiveNumbers() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.multiply(4, 2));
    }

    @Test
    void testMultiplyNegativeNumbers() {
        Calculator calc = new Calculator();
        assertEquals(-8, calc.multiply(-4, 2));
        assertEquals(-8, calc.multiply(4, -2));
        assertEquals(8, calc.multiply(-4, -2));
    }

    @Test
    void testMultiplyWithZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.multiply(0, 5));
        assertEquals(0, calc.multiply(5, 0));
        assertEquals(0, calc.multiply(0, 0));
    }
}
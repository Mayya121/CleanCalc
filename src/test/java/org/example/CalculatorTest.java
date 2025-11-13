package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void addWorks() {
        assertEquals(5.0, c.add(2, 3), 1e-9);
    }

    @Test
    void subtractWorks() {
        assertEquals(-1.0, c.subtract(2, 3), 1e-9);
    }

    @Test
    void multiplyWorks() {
        assertEquals(6.0, c.multiply(2, 3), 1e-9);
    }

    @Test
    void divideWorks() {
        assertEquals(2.5, c.divide(5, 2), 1e-9);
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> c.divide(1, 0));
    }
}
package ua.ellka.calculator.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorServiceImpl calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    void testAdd() {
        assertEquals(5, calculatorService.add(2, 3));
        assertEquals(-1, calculatorService.add(-2, 1));
        assertEquals(0, calculatorService.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(4, calculatorService.subtract(7, 3));
        assertEquals(-3, calculatorService.subtract(0, 3));
        assertEquals(0, calculatorService.subtract(5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculatorService.multiply(3, 5));
        assertEquals(-6, calculatorService.multiply(-2, 3));
        assertEquals(0, calculatorService.multiply(0, 10));
    }

    @Test
    void testDivide() {
        assertEquals(3, calculatorService.divide(9, 3));
        assertEquals(-2, calculatorService.divide(4, -2));
        assertEquals(0, calculatorService.divide(0, 5));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

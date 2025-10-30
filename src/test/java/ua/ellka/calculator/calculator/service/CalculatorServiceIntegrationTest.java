package ua.ellka.calculator.calculator.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorServiceIntegrationTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    void testAdd() {
        int result = calculatorService.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        int result = calculatorService.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiply() {
        int result = calculatorService.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    void testDivide() {
        int result = calculatorService.divide(8, 2);
        assertEquals(4, result);
    }

    @Test
    void testDivideByZero_ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

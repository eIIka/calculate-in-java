package ua.ellka.calculator.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.ellka.calculator.calculator.model.OperationRequest;
import ua.ellka.calculator.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam int a, @RequestParam int b) {
        return calculatorService.divide(a, b);
    }

    @PostMapping("/add")
    public int addPost(@RequestBody OperationRequest request) {
        return calculatorService.add(request.getA(), request.getB());
    }
}

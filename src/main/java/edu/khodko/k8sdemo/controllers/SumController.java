package edu.khodko.k8sdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SumController {
    @GetMapping("/sum")
    public Map<String, Integer> sum(@RequestParam int num1, @RequestParam int num2) {
        return Map.of("sum", num1 + num2);
    }
}

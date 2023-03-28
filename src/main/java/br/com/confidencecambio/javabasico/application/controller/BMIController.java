package br.com.confidencecambio.javabasico.application.controller;

import br.com.confidencecambio.javabasico.application.dtos.CustomerBMIResponseDTO;
import br.com.confidencecambio.javabasico.domain.service.BMICalculatorServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/bmi")
@RequiredArgsConstructor
public class BMIController {

    private final BMICalculatorServiceImpl bmiCalculatorServiceImpl;

    @Operation(summary = "calculate BMI")
    @GetMapping(path = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerBMIResponseDTO> bmiCalculate(
            @RequestParam(value = "weight") String weight,
            @RequestParam(value = "height") String height) throws Exception {

        try {
            return ResponseEntity.ok(this.bmiCalculatorServiceImpl.customerBmi(weight, height));
        } catch (Exception e) {
            log.error("ERROR - EXECUTING BMI CALCULATE");
            throw new Exception(e);
        }
    }
}

package br.com.confidencecambio.javabasico.domain.service;

import br.com.confidencecambio.javabasico.application.dtos.CustomerBMIResponseDTO;

public interface BMICalculatorService {
    CustomerBMIResponseDTO customerBmi(String weight, String height);
}

package br.com.confidencecambio.javabasico.domain.service;

import br.com.confidencecambio.javabasico.application.dtos.CustomerBMIResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class BMICalculatorServiceImpl implements BMICalculatorService {

    private static final String EMPTY = "";

    @Override
    public CustomerBMIResponseDTO customerBmi(String weight, String height) {

        CustomerBMIResponseDTO customerBMIResponse = new CustomerBMIResponseDTO();

        if (weight != null && !weight.isEmpty() &&
                height != null && !height.isEmpty()) {

            String bmi = bmi(weight, height);
            customerBMIResponse.setValueBMI(bmi);
        } else {
            log.info("weight and height is empty your null ");
            customerBMIResponse.setValueBMI(EMPTY);
        }

        return customerBMIResponse;
    }

    private String bmi(String weight, String height) {

        double weigthDouble = Double.parseDouble(weight);
        double heigthDouble = Double.parseDouble(height);
        double bmi = weigthDouble / (heigthDouble * heigthDouble);

        if (bmi < 18.5) {
            log.info("your BMI is Underweight <= 18.5");
            return "Underweight";
        } else if (bmi < 25) {
            log.info("your BMI is Normal <= 25");
            return "Normal";
        } else if (bmi < 30) {
            log.info("your BMI is Overweight <= 30");
            return "Overweight";
        } else {
            log.info("your BMI is Obese > 30");
            return "Obese";
        }
    }
}

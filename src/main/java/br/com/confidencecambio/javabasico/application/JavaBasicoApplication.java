package br.com.confidencecambio.javabasico.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"br.com.confidencecambio.javabasico"})
public class JavaBasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBasicoApplication.class, args);
		log.info("http://localhost:8080/bmi/calculate?weight=90&height=1.80");
	}

}

package com.ph.CalculadoraIMC;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraImcApplication {
	
	double userWeight;
	double userHeight;
	double imc;

	CalculadoraImcApplication(double userWeight, double userHeight){
		this.userHeight = userHeight;
		this.userWeight = userWeight;
	}
	
	void calculateIMC() {
		imc = userWeight/Math.pow(userHeight, 2);
	}
	
	void printMessage() {
		DecimalFormat format = new DecimalFormat("0.00");
		if (imc >= 16 & imc <= 16.9) {
            System.out.println("Seu IMC: " + format.format(imc) + "\nIMC de 16 à 16.9 - Muito abaixo do peso");
        }
        else  if (imc >= 17 & imc <= 18.4) {
        	System.out.println("Seu IMC: " + format.format(imc) + "\nIMC de 17 à 18.4 - Abaixo do peso");
        }
        else  if (imc >= 18.5 & imc <= 24.9) {
        	System.out.println("Seu IMC: " + format.format(imc) + "\nIMC de 18.5 à 24.9 - Peso normal");
        }
        else  if (imc >= 25 & imc <= 29.9) {
        	System.out.println("Seu IMC: " + format.format(imc) + "\nIMC de 25 à 29.9 - Acima do peso");
        }
        else  if (imc >= 30 & imc <= 34.9) {
        	System.out.println("Seu IMC: " + format.format(imc) + "\nIMC de 30 à 34.9 - Obesidade Grau I");
        }
        else  if (imc >= 35 & imc <= 40) {
        	System.out.println("Seu IMC: " + format.format(imc) + "\nIMC de 35 à 40 - Obesidade Grau II");
        }
        else if (imc < 40){
        	System.out.println("Seu IMC: " + format.format(imc) + "\nIMC maior que 40 - Obesidade Grau III");
        }
        /*else {
        	System.out.println("Algum dado foi inserido incorretamente. Tente novamente.");
        }*/
	}

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraImcApplication.class, args);
		
		Scanner s = new Scanner(System.in);
        
        System.out.println("Insira seu peso (Em kilogramas)");
        double W = s.nextDouble();
        while (W < 0) {
            System.out.println( "Dado impossível. Insira novamente.");
            System.out.println("Insira seu peso (Em kilogramas)");
	        W = s.nextDouble();
        }
	     System.out.println("Insira sua altura (Em metros)");
        double H = s.nextDouble();
        while (H < 0) {
        	System.out.println( "Dado impossível. Insira novamente.");
            System.out.println("Insira sua altura (Em metros)");
	        H = s.nextDouble();
        }
        CalculadoraImcApplication valueIMC = new CalculadoraImcApplication(W, H);
        valueIMC.calculateIMC();
        valueIMC.printMessage();
	}
	

}

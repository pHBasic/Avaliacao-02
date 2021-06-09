package com.pH.main;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalculadoraIMC {
	    public static void main(String[] args) {
	        DecimalFormat format = new DecimalFormat("0.00");
	        //Formata��o para o print do IMC
	        
	        double userWeight = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso (Em kilogramas): "));
	        while (userWeight < 0) {
	            JOptionPane.showMessageDialog(null, "Dado imposs�vel. Insira novamente.");
	            userWeight = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura (Em kilogramas): "));
	        /*Verificar se h� entrada de valores negativos.
	        Caso haja, pede um novo valor e sobrep�e o anterior at� se inserir um n�o-negativo*/
	        }
	        
	        double userHeight = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura (Em metros): "));
	        while (userHeight < 0) {
	            JOptionPane.showMessageDialog(null, "Dado imposs�vel. Insira novamente.");
	            userHeight = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura (Em metros): "));
	            /*Verificar se h� entrada de valores negativos.
	        Caso haja, pede um novo valor e sobrep�e o anterior at� se inserir um n�o-negativo*/
	        }
	        
	        double imc = userWeight/(userHeight * userHeight);
	        //C�lculo do imc
	        
	        if (imc >= 16 & imc <= 16.9) {
	            JOptionPane.showMessageDialog(null, "Seu IMC: " + format.format(imc) + "\nIMC de 16 � 16.9 - Muito abaixo do peso");
	        }
	        else  if (imc >= 17 & imc <= 18.4) {
	            JOptionPane.showMessageDialog(null, "Seu IMC: " + format.format(imc) + "\nIMC de 17 � 18.4 - Abaixo do peso");
	        }
	        else  if (imc >= 18.5 & imc <= 24.9) {
	            JOptionPane.showMessageDialog(null, "Seu IMC: " + format.format(imc) + "\nIMC de 18.5 � 24.9 - Peso normal");
	        }
	        else  if (imc >= 25 & imc <= 29.9) {
	            JOptionPane.showMessageDialog(null, "Seu IMC: " + format.format(imc) + "\nIMC de 25 � 29.9 - Acima do peso");
	        }
	        else  if (imc >= 30 & imc <= 34.9) {
	            JOptionPane.showMessageDialog(null, "Seu IMC: " + format.format(imc) + "\nIMC de 30 � 34.9 - Obesidade Grau I");
	        }
	        else  if (imc >= 35 & imc <= 40) {
	            JOptionPane.showMessageDialog(null, "Seu IMC: " + format.format(imc) + "\nIMC de 35 � 40 - Obesidade Grau II");
	        }
	        else {
	            JOptionPane.showMessageDialog(null, "Seu IMC: " + format.format(imc) + "\nIMC maior que 40 - Obesidade Grau III");
	        }
	    }
}

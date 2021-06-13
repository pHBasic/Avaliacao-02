package com.ph.calculadoraimc.model;

public class Imc {
	
	private float userHeight;
	private float userWeight;
	private float IMC;
	private String printIMC;
 
	
	public String getprintIMC() {
		if(IMC < 18.5) {
            this.printIMC = IMC + ",você está abaixo do userWeight, risco: Elevado!";
        }else if(IMC >= 18.5 && IMC < 25) {
            this.printIMC = IMC + ",você está no userWeight ideal, risco: Inexistente!";
        }else if(IMC >= 25 && IMC < 30) {
            this.printIMC =IMC +",você está com excesso de userWeight, risco: Elevado!";
        }else if(IMC >= 30 && IMC < 35) {
            this.printIMC = IMC +",você está com obesidade grau 1, risco: Muito Elevado!";
        }else if(IMC >= 35 && IMC < 40) {
            this.printIMC = IMC +",você está com obesidade grau 2, risco: Muitíssimo Elevado!";
        }else if(IMC >= 40) {
            this.printIMC = IMC +",você está com obesidade grau 3, risco: Obesidade Mórbida!";
        }
        return printIMC;
	}
	public void setprintIMC(String printIMC) {
		this.printIMC = printIMC;
	}
	public float getIMC() {
		return IMC;
	}
	public void setIMC(float userWeight, float userHeight) {
		IMC = userWeight/(userHeight*userHeight);
	}
	public float getuserHeight() {
		return userHeight;
	}
	public void setuserHeight(float userHeight) {
		this.userHeight = userHeight;
	}
	public float getuserWeight() {
		return userWeight;
	}
	public void setuserWeight(float userWeight) {
		this.userWeight = userWeight;
	}

}

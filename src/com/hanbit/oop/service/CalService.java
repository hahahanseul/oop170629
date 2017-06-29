package com.hanbit.oop.service;

public class CalService {
	public String calcBMI(double height, double weight) {
		double bmi=weight/(height*height);
		String result="";
		if(bmi>=30.0){
			result="비만";
		}else if(bmi>=25.0){
			result="과체중";
		}else if(bmi>=18.5){
			result="정상";
		}else{
			result="저체중";
		}
		return result;
	}
	public String calcPlus(String a, String b){
		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
	}
	public String calcMinus(String a, String b){
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	public String calcMultiply(String a, String b){
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	public String calcDivide(String a, String b){
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
	public String calcTax(String salary){
		String result="";
		return result;
	}
	public String calcTime(String second){
		String result="";
		return result;
	}
}
	
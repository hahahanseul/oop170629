package com.hanbit.oop.service;


public class TaxCalculatorService {
	public int execute (String name, int salary, double taxRate){
		int tax=(int)(salary*taxRate);
		return tax;
	}
}

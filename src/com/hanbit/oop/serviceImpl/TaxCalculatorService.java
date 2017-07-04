package com.hanbit.oop.serviceImpl;


public class TaxCalculatorService {
	private String name;
	private double salary, taxRate, tax;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public int getSalary(){
		return (int)salary;
	}
	public void setTaxrate(){
		this.taxRate=0.097;
	}
	public double getTaxrate(){
		return taxRate;
	}
	public void setTax(){
		this.tax=salary*taxRate;
	}
	public int getTax(){
		return (int)tax;
	}
}

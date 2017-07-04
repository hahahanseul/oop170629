package com.hanbit.oop.serviceImpl;

public class CalendarService {
	private int year,month,date,day;
	private String toString;
	public void setYear(int year){
		this.year=year;
	}
	public int getyear(){
		return year;
	}
	public void getMonth(int month){
		this.month=month;
	}
	public int getMonth(){
		return month;
	}
	public void date(int date){
		this.date=date;
	}
	public int date(){
		return date;
	}
	public void setDay(int day){
		this.day=day;
	}
	public int day(){
		return day;
	}
	public String toString(){
		return year +"월 "+month+"월 "+date+"일 "+day+"요일";
	}
}

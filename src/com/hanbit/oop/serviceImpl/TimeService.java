package com.hanbit.oop.serviceImpl;

public class TimeService {
	public int[] execute(int rawSec){
		int[] time=new int[3];
		time[0]=rawSec/3600;
		time[1]=(rawSec%3600)/60;
		time[2]=(rawSec%3600)%60;
		return time;
	}
}

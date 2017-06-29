package com.hanbit.oop.service;

import java.util.Scanner;

public class GradeService {
	//field
	private int kor, eng, math, total, avg;
	private String grade, ment, name,major;
	public void setKor(int kor) {
		this.kor=kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
	}
	public void setTotal(){
		this.total=kor+eng+math;
	}
	public int getTotal(){
		return total;
	}
	public void setAvg(){
		this.avg=total/3;
	}
	public void setGrade(){
		setTotal();
		setAvg();
		switch(avg/10){
			case 10 : case 9 : 
				this.grade="A학점입니다. 장학금 대상입니다!";
			break; 			
			case 8 : 
				this.grade="B학점입니다. 3학점 이수 성공!";
			break; 			
			case 7 : 
				this.grade="C학점입니다. 2학점 이수 성공!";
			break; 			
			case 6 : 
				this.grade="D학점입니다. 1학점 이수 성공!";
			break; 			
			case 5 :
				this.grade="fail";
			break;
			default : 
				this.grade="FAIL";
			break;
		}
	}
	public String getGrade(){
		return grade;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setMajor(String major){
		this.major=major;
	}
	public String getMajor(){
		return major;
	}
	public String toString(){
		return "====================================================\n"
				+"이름    전공     성적\n"
				+"---------------------------------------------------\n"
				+name+"\t"+major+"\t"+grade+"\n"
				+"===================================================\n";
	}
}
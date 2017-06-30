package com.hanbit.oop.service;

import java.util.Scanner;

import com.hanbit.oop.domain.GradeBean;

public class GradeService {
	GradeBean session;
	public GradeService(){
		session = new GradeBean();
	}
	
	public int getTotal(GradeBean g){
		return g.getKor()+g.getEng()+g.getMath();
	}
	public int getAvg(int total){
		return total/3;
	}
	public String getGrade(int avg,GradeBean g){
		String grade="";
		switch(avg/10){
			case 10 : case 9 : 
				grade="A학점입니다. 장학금 대상입니다!";
			break; 			
			case 8 : 
				grade="B학점입니다. 3학점 이수 성공!";
			break; 			
			case 7 : 
				grade="C학점입니다. 2학점 이수 성공!";
			break; 			
			case 6 : 
				grade="D학점입니다. 1학점 이수 성공!";
			break; 			
			case 5 :
				grade="fail";
			break;
			default : 
				grade="FAIL";
			break;
		}
		return g.getName() + ", "+ g.getMajor()+ ", "+avg+"점, "+grade ;	
	}
}
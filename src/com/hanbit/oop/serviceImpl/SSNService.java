package com.hanbit.oop.serviceImpl;

public class SSNService {
	public String execute(String name2, String ssn){
		String sYear="",gender="" ,result="";
		int year=0, age=0, gap=0;
		year=Integer.parseInt(ssn.substring(0,2));
		char ch = ssn.charAt(7);
		if(17-year>=0){
			age=2017-(year+2000);
		}else{
			age=2017-(year+1900);
		}
		switch (ch){
			case '1': case '3':
				gender="남";
			break;
			case '2': case '4':
				gender="여";
			break;
			case '5': case '6':
				gender="외국인";
			break;
			default : 
				gender="주민등록번호를 다시 입력하세요.";
		}
		result=age+","+gender;

		return result;
	}
}

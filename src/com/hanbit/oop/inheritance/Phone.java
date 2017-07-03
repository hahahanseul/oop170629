package com.hanbit.oop.inheritance;

public class Phone {
	protected String name, phoneNo, call;
	public final static String KIND="집전화";
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo(){
		return phoneNo;
	}
	public void setCall(String call){
		this.call = call;
	}
	public String getCall(){
		return call;
	}
	public String toString(){
		return String.format("%s에게 %s번호로 %s집전화기를 사용해서 %s라고 통화했다.",name, phoneNo,KIND,call);
	}
	
}

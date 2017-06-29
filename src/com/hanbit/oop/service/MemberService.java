package com.hanbit.oop.service;

public class MemberService {
	private String id, pw, name, ssn, age, gender, login, loginId, loginPw;
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setPw(String pw){
		this.pw=pw;
	}
	public String getPw(){
		return pw;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setAge(){
		int year=Integer.parseInt(ssn.substring(0,2));
		char ch = ssn.charAt(7);
		if(17-year>=0){
			this.age=String.valueOf(2017-(year+2000));
		}else{
			this.age=String.valueOf(2017-(year+1900));
		}
	}
	public String getAge(){
		return age;
	}
	public void setGender(){
		char ch = ssn.charAt(7);
		switch (ch){
			case '1': case '3':
				this.gender="male";
			break;
			case '2': case '4':
				this.gender="female";
			break;
			case '5': case '6':
				this.gender="foreigner";
			break;
			default : 
				this.gender="wrong id number";
		}
	}
	public String getGender(){
		return gender;
	}
	public void setLoginId(String loginId){
		this.loginId=loginId;
	}
	public String getLoginId(){
		return loginId;
	}
	public void setLoginPw(String loginPw){
		this.loginPw=loginPw;
	}
	public String getLoginPw(){
		return loginPw;
	}
	public void setLogin(String loginId, String loginPw){
		if(loginId.equals(id)){
			if(loginPw.equals(pw)){
				this.login =toString();
			}else{
				this.login="비밀번호가 다릅니다.";
			}	
		}else{
			this.login="존재하지 않는 아이디입니다.";
		}
	}
	public String getLogin(){
		return login;
	}
	public String toString(){
		return "welcome" + name + "("+gender+","+age+"세"+")";
	}
}

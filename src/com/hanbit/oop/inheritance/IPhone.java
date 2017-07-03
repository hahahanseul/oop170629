package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone{
	protected String data;
	//KIND 는 스마트폰으로 오버라이딩
	public final static String BRAND="아이폰";
	public final static String KIND="스마트폰";
	public void setData(String data){
		super.setPortable(true);
		this.data = data;
	}
	public String getData(){
		return data;
	}
	@Override
	public String toString(){
		//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010번호로
		//아이폰을 사용해서 안녕이라고 문자를 전송했다. 
		return String.format("%s이기 때문에 %s 상태로 %s에게 %s번호로 %s을 사용해서 %s라고 문자했다."
				,KIND,super.move,super.name, super.phoneNo,KIND,data);
	}
}

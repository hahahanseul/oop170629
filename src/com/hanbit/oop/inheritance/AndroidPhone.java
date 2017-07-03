package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone {
	//BLAND 갤럭시노트
	public final static String BLAND="갤럭시";
	private String size, appl;
	public void setSize(String size){
		this.size = size;
		super.setPortable(true);
	}
	public String getSize(){
		return size;
	}
	public void setAppl(String appl){
		this.appl = appl;
	}
	public String getAppl(){
		return appl;
	}
	@Override
	public String toString(){
		//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010번호로
		//갤럭시를 6인치를 사용해서 안녕이라고 카톡을 전송했다. 
		return String.format("%s이기 때문에 %s 상태로 %s에게 %s번호로 %s을 %s인치를 사용해서 %s라고 %s을 전송했다."
				,KIND,move,name, phoneNo,KIND,size, data, appl);
	}
}

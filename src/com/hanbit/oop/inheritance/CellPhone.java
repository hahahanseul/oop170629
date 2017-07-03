package com.hanbit.oop.inheritance;

public class CellPhone extends Phone {
	protected boolean portable;
	protected String move;
	public final static String KIND="휴대폰";
	public void setMove(String move){
		this.move=move;
	}
	public String getMove(){
		return move;
	}
	public void setPortable(boolean portable){
		if(portable){
			this.setMove("이동가능");
		}else{
			this.setMove("이동불가능");
		}
		this.portable=portable;
	}
	public boolean isPortable(){
		return portable;
	}
	@Override
	public String toString(){
		return String.format("%s이기 때문에 %s 상태로 %s에게 %s번호로 %s집전화기를 사용해서 %s라고 통화했다.",KIND,move,super.name, super.phoneNo,KIND,super.call);
	}
	
}

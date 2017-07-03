package com.hanbit.oop.controller;
import javax.swing.*;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args) {
		Phone phone = new Phone();
		CellPhone nokia = new CellPhone();
		IPhone iphone = new IPhone();
		AndroidPhone android = new AndroidPhone();
		while(true){
			switch(JOptionPane.showInputDialog("0. 종료 1.통화 2.휴대전화 3.아이폰 4.안드로이드")){
			case "0": 
				JOptionPane.showMessageDialog(null,"통화를 종료합니다");
				return;
			case "1":
				phone.setName(JOptionPane.showInputDialog("이름?"));
				phone.setPhoneNo(JOptionPane.showInputDialog("번호?"));
				phone.setCall(JOptionPane.showInputDialog("통화내역?"));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case "2":
				nokia.setPortable(true);
				nokia.setName(JOptionPane.showInputDialog("이름?"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("번호?"));
				nokia.setCall(JOptionPane.showInputDialog("통화내역?"));
				JOptionPane.showMessageDialog(null,nokia.toString());
				break;
			case "3":
				
				iphone.setName(JOptionPane.showInputDialog("이름?"));
				iphone.setPhoneNo(JOptionPane.showInputDialog("번호?"));
				iphone.setData(JOptionPane.showInputDialog("문자내역?"));
				JOptionPane.showMessageDialog(null,iphone.toString());
				break;
			case "4":
				
				android.setName(JOptionPane.showInputDialog("이름?"));
				android.setPhoneNo(JOptionPane.showInputDialog("번호?"));
				android.setData(JOptionPane.showInputDialog("메시지내역?"));
				android.setSize(JOptionPane.showInputDialog("사이즈?"));
				android.setAppl(JOptionPane.showInputDialog("어플설치?"));				
				JOptionPane.showMessageDialog(null,android.toString());
				break;	
			
			}
		}
	}
}

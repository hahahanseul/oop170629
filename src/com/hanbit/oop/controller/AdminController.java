package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		AdminService service = new AdminServiceImpl();
		MemberBean member = null;
		while(true){
			switch(JOptionPane.showInputDialog("0.exit 1.add 2.count 3.list 4.findById 5.findByName 6.update 7.delete")){
			case "0":
				return;
			case "1":
				member = new MemberBean();
				String[] arr = JOptionPane.showInputDialog("NAME/ID/PASSWORD/SSN").split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null, "회원가입 성공");			
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;
				
			case "3":
				MemberBean[] list = service.getMembers();
				String sList="";
				for(int i=0;i<service.countMembers();i++){
					sList+=list[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, "리스트\n"+sList);
				break;
			case "4":
				JOptionPane.showMessageDialog(null,service.findById(JOptionPane.showInputDialog("검색할 Id를 입력하세요")).toString());
				break;
			case "5":
				String name = JOptionPane.showInputDialog("검색할 이름을 입력하세요");
				MemberBean[] members = service.findByNamse(name);
				String result = "";
				if(members.length == 0){
					result= "조회하는 이름이 없습니다.";
				}else{
					for(int i=0;i<members.length;i++){
						result+=members[i].toString() + "\n";
					}
				}
				JOptionPane.showMessageDialog(null,result);
				break;
			case "6":
				String[] idPw = JOptionPane.showInputDialog("아이디/비밀번호").split("/");
				member = new MemberBean();
				member.setId(idPw[0]);
				member.setPw(idPw[1]);
				service.updatePw(member);
				JOptionPane.showMessageDialog(null, "수정완료");
				break;
			case "7":
				service.deleteId(JOptionPane.showInputDialog("삭제할 아이디를 입력하세요"));
				JOptionPane.showMessageDialog(null, "삭제완료");
				break;
			}
		}
	}
}
package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService {
	int count;
	MemberBean member;
	MemberBean[] list;

	public AdminServiceImpl(int limit) {
		count=0;
		member = new MemberBean();
		list = new MemberBean[limit];
		
	} // i는 처음 입력받은 회원수, 총 회원수는 count에 담겨서 그 숫자만큼 MemberBean의 공간이 생성됨

	@Override
	public void addMember(MemberBean member) {
		list[count]=member;
		for(int i=0; i<(count+1);i++){
			System.out.println(list[i].toString());
		}
		count++;
	}
	
	@Override
	public MemberBean[] getMembers() {
		return list;
	}

	@Override
	public int countMembers() {
		return count;
	}

	@Override
	public MemberBean findById(String id) {
		member = new MemberBean();
		for(int i=0;i<list.length;i++){
			if(id.equals(list[i].getId())){
				member = list[i];
				break;
			}
		}
		return member;
	}

	@Override
	public MemberBean[] findByNamse(String name) {
		int x = 0;
		for(int i=0;i<list.length;i++){
			if(name.equals(list[i].getName())){
				x++;
			}	
		}
		MemberBean[] members = new MemberBean[x];
		int j=0;
		for(int i=0;i<list.length;i++){
			if(name.equals(list[i].getName())){
				members[j] = list[i];
				j++;
			}
			if(x==j){
				break;
			}
		}
		return members;
	}

	@Override
	public void updatePw(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
}
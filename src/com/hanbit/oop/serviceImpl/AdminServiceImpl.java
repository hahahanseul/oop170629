package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService {
	int count;
	MemberBean member;
	MemberBean[] list;

	public AdminServiceImpl() {
		count=0;
		member = new MemberBean();
		list = new MemberBean[count];
		
	} // i는 처음 입력받은 회원수, 총 회원수는 count에 담겨서 그 숫자만큼 MemberBean의 공간이 생성됨

	@Override
	public void addMember(MemberBean member) {
		if(count==list.length) {
			MemberBean[] temp = new MemberBean[count+1];
			System.arraycopy(list, 0, temp, 0, count);
			list=temp;
		}
		list[count++]=member;
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
	public void updatePw(MemberBean param) {
		member = findById(param.getId());
		member.setPw(param.getPw());
		
	}

	@Override
	public void deleteId(String id) {
	for(int i=0;i<count;i++){
			if(id.equals(list[i].getId())){
				list[i]=list[count-1];
				list[count-1]=null;
				count--;
				break;
			}
		}
	}
}
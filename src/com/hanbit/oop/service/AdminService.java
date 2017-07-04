package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface AdminService {
	public void addMember(MemberBean member);
	public MemberBean[] getMembers();
	public int countMembers();
	public MemberBean findById(String id);
	public MemberBean[] findByNamse(String name);
	public void updatePw(MemberBean member);
	//MemberBean[] list=new MemberBean[4];
}

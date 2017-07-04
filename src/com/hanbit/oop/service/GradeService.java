package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public interface GradeService {
	public int getTotal(GradeBean g);
	public int getAvg(int total);
	public String getGrade(int avg,GradeBean g);
}

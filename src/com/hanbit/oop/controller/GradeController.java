package com.hanbit.oop.controller;
import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;
import javax.swing.*;

public class GradeController {
	public static void main(String[] args) {
		GradeService gs=new GradeService();
		GradeBean gb= new GradeBean();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.성적계산")) {
				case "0":
					JOptionPane.showInputDialog("0. 종료");
					return;
				case "1":
					gb.setName(JOptionPane.showInputDialog("이름?"));
					gb.setMajor(JOptionPane.showInputDialog("전공?"));
					gb.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수?")));
					gb.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수?")));
					gb.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수?")));
					JOptionPane.showMessageDialog(null,gs.getGrade(gs.getAvg(gs.getTotal(gb)),gb));
					break;
			}
		}
	}
}
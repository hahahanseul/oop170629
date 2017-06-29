package com.hanbit.oop.controller;
import java.util.Scanner;

import com.hanbit.oop.service.BMIService;
import com.hanbit.oop.service.CalService;
import com.hanbit.oop.service.GradeService;
import com.hanbit.oop.service.SSNService;
import com.hanbit.oop.service.TaxCalculatorService;
import com.hanbit.oop.service.TimeService;
import com.hanbit.oop.service.TopRankingService;

public class Controller {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BMIService b=new BMIService();
		CalService s2=new CalService();
		TaxCalculatorService t=new TaxCalculatorService();
		TopRankingService s4=new TopRankingService();
		TimeService s5=new TimeService();
		SSNService s6=new SSNService();
		GradeService g=new GradeService();
		while (true) {
			System.out.println("0.종료 1.BMI 2.tax 3.성적계산 4.- 5.TopRanking 6.Time 7.SSN 8.* 9./");
			switch (s.next()) {
				case "0":
					System.out.println("0. 종료");
					return;
				case "1":
					System.out.print("BMI=weight/(height*height)\n");
					System.out.print("Enter your height. (m)\n");
					double height=s.nextDouble();
					b.setHeight(height);
					System.out.print("Enter your weight. (kg)\n");
					double weight=s.nextDouble();
					b.setWeight(weight);
					b.setBMI();
					b.setResult();
					System.out.println(String.format("당신의bmi는%f, %s입니다.", b.getBMI(),b.getResult()));
					break;
				case "2":
					System.out.print("이름을 입력해주세요\n");
					String name=s.next();
					t.setName(name);
					System.out.print("연봉을 입력해주세요\n");
					double salary=s.nextInt();
					t.setSalary(salary);
					t.setTax();
					System.out.print("*******************************************\n");
					System.out.print("  이름   |    연봉    |   세율   | 납부할 세금\n");
					System.out.print("-------------------------------------------\n");
					System.out.print(String.format(" %s |  %d만원  |  %f  | %d 만원\n",name,t.getSalary(),t.getTaxrate(),t.getTax()));
					System.out.print("*******************************************\n");
					break;	
				case "3":
					System.out.println("이름?");
					String name2 = s.next();
					g.setName(name2);
					System.out.println("전공?");
					String major=s.next();
					g.setMajor(major);
					System.out.println("국어점수?");
					int kor=s.nextInt();
					g.setKor(kor);
					System.out.println("영어점수?");
					int eng=s.nextInt();
					g.setEng(eng);
					System.out.println("수학?");
					int math=s.nextInt();
					g.setMath(math);
					g.setGrade();
					System.out.println(g.toString());
					break;
				case "4":
		
					break;	
				case "5":
					int[] arr = {0,0,0,0,100};    //학생수, 합계, 평균, 최대, 최소
					System.out.print("1반의 총 학생 수는 몇 명?\n");
					arr[0]=s.nextInt();
					int[] avgs = new int[arr[0]];
					for(int i=0;i<avgs.length;i++){
						System.out.print("학생의 평균 점수 입력하세요(100점 만점)\n");
						avgs[i]=s.nextInt();
					}
					s4.execute(arr, avgs);
					System.out.print("1반의 평균점수는 " + arr[2]+"\n");
					System.out.print("최대 점수는 " + arr[3]+"\n");
					System.out.print("최소 점수는 " + arr[4]+"\n");
					break;		
				case "6":
					System.out.print("초를 입력하세요.\n");
					int rawSec=s.nextInt();
					int[] time=s5.execute(rawSec);
					System.out.print(String.format("%d초 = %d시간 %d분 %d초\n", rawSec, time[0], time[1],time[2]));
					break;
				case "7":
					System.out.println("이름을 입력하세요.");
					String name3=s.next();
					System.out.println("주민등록번호를 입력하세요.");
					String ssn=s.next();
					String result2=s6.execute(name3, ssn);
					String[] finRst=result2.split(",");
					System.out.print("***********************\n"); 
					System.out.println("  이름      나이     성별  \n");
					System.out.println("-----------------------\n");
					System.out.println(String.format(" %s    %s\n",name3,finRst[0],finRst[1]));
					System.out.println("************************");	
					break;
				case "8":
					break;
				case "9":
					break;
			}
		}
	}
}
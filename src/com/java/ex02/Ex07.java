package com.java.ex02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
				
		System.out.println("====== 강의실 안내 =======");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬");
		System.out.print("과목을 선택하세요 : ");
		
		int cd=sc.nextInt();
		
		switch(cd) {
			case 1 :
				System.out.println("101호");          
				break;                                               //break가 없으면 다음 case 과정을 진행한다. break가 나올때까지 쭉--
				
			case 2 :
				System.out.println("102호");
				break;				
		
			case 3 :
				System.out.println("103호");
				break;				
		
			case 4 :
				System.out.println("104호");
				break;
				
		   default :
			    System.out.println("상담원에게 문의하세요.");
				break;
		}
		
		
		sc.close();
		
	}
}
// if의 조건식이 모두 '==' 로만 이루어져 있을 때 switch 문을 쓴다.
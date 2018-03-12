package com.java.ex02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("1. 자바   2. C  3. C++  4. 파이썬");
		System.out.println("과목 번호 : ");
		
		int num=sc.nextInt();
		
		if (num==1) { 
			System.out.println("R101호 입니다.");
		}
		
		else if (num==2) {
			System.out.println("R102호 입니다.");
		}
	
		else if (num==3) {
			System.out.println("R103호 입니다.");
		}
	
		else if (num==4) {
			System.out.println("R104호 입니다.");
		}
		
		else { 
			System.out.println("상담원에게 문의하세요.");
		}
	
		sc.close();
		
	}
}

// else if 대신 전부 if 로 구성하면 내가 num으로 입력한 값이 모든 if의 입력값으로 들어가게 됨 (시행횟수가 4회가 됨)
// 마지막에 있는 else는 (num==4)의 else로 소속됨
// 들여쓰기 잘하자. 클래스-메소드 괄호 들여써서 맞추고(Tap키)
// if 와 else도 병렬관계 인것 끼리 들여쓰기 맞춘다.
// if문이 여러개일 경우 해당 if문에 소속된 else문은 바짝 붙여쓴다. 

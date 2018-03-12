package com.java.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);           // 키보드 입력과 메모리를 이어주는 선언
	
	System.out.print("숫자를 입력하세요 : ");
	int num =sc.nextInt();                        // 키보드로 입력된 숫자를 변수에 대입시키는 선언
	System.out.println("입력하신 숫자는 " + num +" 입니다.");
	
	sc.close();
	
		
	
	}

}

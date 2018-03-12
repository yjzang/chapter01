package com.java.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	  System.out.print("점수를 입력하세요 : ");
	  int point = sc.nextInt();
	  
	  if(point>=60) {
		  System.out.println("=================");
		  System.out.println("          합격입니다.");
		  System.out.println("=================");

	  
	  }
	  
		  
	 else {
		  System.out.println("불합격입니다.");
	  }
	
	 sc.close();
	 
	}

}

package com.java.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.print(" 숫자를 입력하세요 :  ");
	   
	   int num= sc.nextInt();
	   
	   
	   if(num<0) {
		   System.out.println("음수");
		   
		  	   }
	   
	   else if(num==0) { 
		   System.out.println("0 입니다.");
	   }
	   
	   else if((num%2)==1 ) {
		   System.out.println("홀수");	   }
	   
	   else {
			System.out.println("짝수");	   }
	   
	   
	   sc.close();
	   
	   
	}

}

package com.java.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int jum= sc.nextInt();
		
		
		if (jum>0) { 
		System.out.println(" \n 양수 입니다. ");
		
	    }
		
		else if(jum==0) {
			
			System.out.println(" \n 0 입니다. "); }
			
			else {
				
				System.out.println(" \n음수 입니다.");
			}
			
			
		sc.close();
		
	}
	
}

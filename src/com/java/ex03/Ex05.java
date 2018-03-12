package com.java.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

	
		Scanner sc=new Scanner(System.in);
		
			
		while(true) {                                        // while(true) 꿀조합-- 무한루프!
		
			System.out.println("숫자를 입력하세요:");
			int num=sc.nextInt();
			
			
			if(num==0) {
				
				System.out.println("종료");
				break;
			}
			
			else if(num%3==0) {
				
				System.out.println("3의 배수 입니다.");
			}
			
			else {
				System.out.println("3의 배수가 아닙니다.");

			}
					
		}
		
		sc.close();
			
	
	}

}

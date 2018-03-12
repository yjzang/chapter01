package com.java.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

	
		Scanner sc=new Scanner(System.in);
		
			
		int i=1;
		
		for(i=1;i<=20;i++) {
		
					
			if(i==20) {
				
				break;                                   //for문에서 continue와 break는 권장하지 않는다. 대부분 없이 짠다.
			} 											//break는 switch문에서는 꼭 쓰는 것을 권장
			
			if(i%3==0||i%2==0) {
			}
			
			else {
				System.out.println(i);
			}
		}
					
			
		sc.close();
			
	
	}

}

// 반복의 횟수를 알 수 있을 때는 for문,  알 수 없을 때는 while문 추천
package com.java.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("몇 단?");
		int i=1;
		int d=sc.nextInt();
		
		
		for(i=1;i<=9;i++) {
			
					
				System.out.println(d+"x"+i +"="+ d*i );
			
			}
		    
					
			
		
		
		sc.close();
		
		
	}
}

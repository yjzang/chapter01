package com.java.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("몇 단?");
		
		int i=1;
		int d=sc.nextInt();
		
			
			while(i<=9) {
				
				
				System.out.println(d+"x"+i +"="+ d*i );
				i++;
		}
				
			
		
		sc.close();
		
		
	}
}

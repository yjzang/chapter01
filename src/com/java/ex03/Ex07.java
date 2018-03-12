package com.java.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

	
		Scanner sc=new Scanner(System.in);
		
			
		int i=1;
		
		while(true) {
		
			
			if(i%6==0&&i%14==0) {
				
				System.out.println(i);
				break;
			}
			
			i++;
			
			
		}
		
	
		
			
		sc.close();
			
	
	}

}


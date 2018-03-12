package com.java.ex01;

public class Ex04 {

	public static void main(String[] arges) {
		
		char ch01 = 'A';
		char ch02 = '곽' ;
		System.out.println(ch01);
		System.out.println(ch02);
		
		char ch03 = 65;
		System.out.println(ch03);
		
		String ch04 = "안녕하세요" ;
		System.out.println(ch04);
		
		final double pi = 3.14 ;
		double result = pi * 5 * 5 ;
		System.out.println(result);
		
		// pi= 3.1415 ;     final을 자료형 앞에 적어주면 해당 변수는 값을 바꿀 수 없다. 
		                    //final이 들어간 선언문에 직접 가서 바꿔야한다.  
		result = pi*5*5;
		System.out.println(result);
		
			
		
	}
}

package com.java.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		int a = 5 ; 
		int b = 7 ;
		
		                                  //관계연산자는 boolean 지정 안해도 결과값이 t or f로 나온다.
		System.out.println(a>b && a<b);  // and 연산자는 모두가 t이어야 결과가 t로 나온다.
		System.out.println(a<b && a<b); 
		
		System.out.println("====================");
		
		System.out.println(a>b || a<b);  // or 연산자는 하나라도 t면 결과가 t이다.
		
		System.out.println("====================");
		
		System.out.println(a>b ^ a<b);  // xor 연산자는 두 결과값이 다르면 t 같으면 f이다.
	}
}

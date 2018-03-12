package com.java.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 3;
		float c=3.0f;
		
		System.out.println(a/b);
		System.out.println(a/c);
		
		//꿀팁 : 계산의 결과를 int형으로 바꾸고 싶다면..!
		System.out.println((int)(a/c));
		
		
		//자동 형변환(묵시적)
		double dVar01 = 2 + 3.5 ;
		System.out.println(dVar01);
		
		//강제 형변환(명시적)
		int i=(int)12.8;
		System.out.println(i);
		
		//확대 변환 : int를 double로 변환? 변환으로서 의미는 없지만 굳이 써줌 
		// --> 표현을 더 명확히 해주기 위해서 --> 우변은 double이다. 명시가 되어버리니까 안 헷갈림
		double dVar02 = (double)100;
		System.out.println(dVar02);
		
	}
}

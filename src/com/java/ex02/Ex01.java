package com.java.ex02;

public class Ex01 {

	public static void main(String[] args) {

		String str= "굿모닝";
		int i=2345 ;
		double d= 3.14;
		
		char c= '한' ;   // 많이 하는 실수 c="한" 작은 따옴표 써야하는데 큰따옴표 쓰는 실수
				
		String name= "곽영주";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		
		System.out.println("안녕");
		System.out.println("하세요");
		
		System.out.print("안녕"); 			  // print는 바로 옆에 이어쓰기됨
		System.out.println("하세요");          // println은  줄바꿈 후 써짐
		
		System.out.println(str+" "+str+"!");   // + "  " + 을 넣어주면 한칸 띄워줄 수 있음  
		
		System.out.println(str+" "+i);
		
		System.out.println(str+" "+d);
		System.out.println(i+" "+d);
		System.out.println(i+d);        // 글자끼리는 +로 이어주면 옆에 이어쓰기가 되지만 숫자일 경우 더해버림
		
		
		System.out.println(c);
		System.out.println(c+c);        // char형 노답 -- char는 숫자도 받을 수 있기때문에 글자인지 숫자인지 혼동함 
		
        System.out.println("제 이름은 " + name + " 입니다."); 	
	
        System.out.println("==========================");
        System.out.println("안녕 \n 하세요");
        System.out.println("안녕 \t 하세요");
        
        System.out.println("쿠쿠 \"하\" 세요");
        System.out.println("쿠쿠 \'하\' 세요");
        System.out.println("쿠쿠 \\하\\ 세요");
         
	}

}

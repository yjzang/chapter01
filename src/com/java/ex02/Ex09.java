package com.java.ex02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mon = sc.nextInt();

		switch (mon) {
		case 2:
			System.out.println("28일");
			break;

		case 4:

		case 6:

		case 9:

		case 11:
			System.out.println("30일");
			break;

		default:
			System.out.println("31일");
			break;
		}

		sc.close();

	}

}

//이렇게 짤수도 있지만 되도록이면 각 case마다 break를 걸어주는 것을 권장한다. 
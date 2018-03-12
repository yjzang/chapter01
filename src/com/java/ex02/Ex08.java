package com.java.ex02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("해당하는 월을 입력하세요 : ");

		int mon = sc.nextInt();

		if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {

			System.out.println("31일");
		}

		else if (mon == 2) {

			System.out.println("28일");
		}

		else if (mon > 12) {

			System.out.println("잘못 입력하셨습니다.");
		}

		else {
			System.out.println("30일");
		}

		sc.close();

	}

}

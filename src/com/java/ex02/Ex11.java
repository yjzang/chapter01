package com.java.ex02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요 : ");

		int point = sc.nextInt();

		if (point > 90) {

			System.out.println("A등급");
		}

		else if ((80 <= point) && (point < 90)) {

			System.out.println("B등급");
		}

		else if (70 <= point && point < 80) {

			System.out.println("C등급");
		}

		else if (60 <= point && point < 70) {

			System.out.println("D등급");
		}

		else if (point < 60) {

			System.out.println("F등급");
		}

		sc.close();

	}

}

package com.java.ex02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		int jum = sc.nextInt();

		if ((jum % 3) == 0) {

			System.out.println(jum + "은 3의 배수 입니다.");

		} else {

			System.out.println(jum + "은 3의 배수가 아닙니다.");

		}

		sc.close();

	}

}
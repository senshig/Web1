package com.kr.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요(영어) : ");
		String str = sc.nextLine();
		
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
		
		
//		for(int i = 0; i < str.length(); i++){
//			System.out.println(i +"번째 문자 : " + str.charAt(i));
//		}
		
		sc.close();
	}
}

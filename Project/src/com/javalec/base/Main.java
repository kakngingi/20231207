package com.javalec.base;

import java.util.*;

import com.javalec.function.Add;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1을 입력하세요 : ");
		int num1 = sc.nextInt();

		System.out.print("숫자 2을 입력하세요 : ");
		int num2 = sc.nextInt();

		System.out.print("숫자 3을 입력하세요 : ");
		int num3 = sc.nextInt();

		System.out.print("숫자 4을 입력하세요 : ");
		int num4 = sc.nextInt();

		Add add = new Add();
		add.num1 = num1;
		add.num2 = num2;
		add.num3 = num3;
		add.num4 = num4;

		System.out.println(">>>Feild를 사용");
		System.out.println(num1 + "과 " + num2 + "의 숫자 합은 " + add.addResult() + "입니다.");

	}

}

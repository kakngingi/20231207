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

		System.out.println(">>> Feild를 사용");
		System.out.println("1. " + num1 + "과 " + num2 + "의 숫자 합은 " + (add.num1 + add.num2) + "입니다.");
		System.out.println("2. " + num1 + "과 " + num3 + ", " + num4 + "의 *덧셈 뺄셈 곱셈 나눗셈* 의 결과는 " + "\n덧셈 : "
				+ (add.num1 + add.num3 + add.num4) + "\n뺄셈 : " + (add.num1 - add.num3 - add.num4) + "\n곱셈 : "
				+ (add.num1 * add.num3 * add.num4) + "\n나눗셈 : " + (double) (add.num1 / add.num3 / add.num4));

		System.out.println(">>> Constuctor를 사용");
		System.out.println("1. " + num3 + "과 " + num4 + "번의 *덧셈, 뺄셈, 곱셈* 의 결과는 덧셈 : " + add.Add(num3, num4));
		System.out.println("2. " + num1 + ", " + num2 + ", " + num3 + "의 *뺄셈과 곱셈* 의 결과는 뺄셈 : ");

		System.out.println(">>> Method를 사용");
		System.out.println(
				"1. " + num1 + "," + num2 + "," + num4 + "의 *덧셈, 뺄셈, 곱셈, 나눗셈, 나머지*의 결과는 덧셈: " + add.addResult());
		System.out.println("2. " + num2 + "번과 " + num4 + "번의 *뺄셈과 나눗셈* 의 결과는 뺄셈 : ");

	}

}

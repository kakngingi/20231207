package com.javalec.function;

public class AddSubMulDiv extends AddSubMul {

	/*
	 * Description : AddSubMul로부터 상속받아 덧셈 + 뺼셈 + 곱셈 + 나눗셈을 출력하는 프로그램 Date :
	 * 23.12.07.Thursday Version : 1.0 Author : Woody Jo
	 */

	// Field

	int div;

	// Constructor
	public AddSubMulDiv() {
		// TODO Auto-generated constructor stub
	}

	// Method
	public void div(int n1, int n2, int n4) {
//		super.mul();
		if (n1 > Integer.MIN_VALUE)
			div = n1 / n2 / n4;
		else
			div = n2 / n4;
		System.out.println(div);

	}

}
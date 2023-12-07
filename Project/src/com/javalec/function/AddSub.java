package com.javalec.function;

public class AddSub extends Add {

	// Field

	// Constructor

	public AddSub() {

	}

	public AddSub(int num1, int num2) {
		int sub1 = num1 - num2;
		System.out.println(sub1);
	}

	public int AbbSub(int num1, int num2, int num3) {

		int sub2 = num1 - num2 - num3;
		return sub2;

	}

	// Method

	public int AddSubResult1() {
		return num1 - num2 - num3;
	}

	public int AddSubResult2() {
		return num1 - num2;
	}

}
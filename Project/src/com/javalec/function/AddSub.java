package com.javalec.function;

import com.javalec.function.Add;

public class AddSub extends Add{
	
  	// Field
	
		 
			

	
	 // Constructor
	 
	 public AddSub() {
		 
	 }
	
	 public AddSub(int num1, int num2) {
		 int sub1 = num1-num2;
		 System.out.println(sub1);
	 }
	 
	 public AbbSub(int num1, int num2, int num3) {
		 
		 int sub2 = num1 - num2 - num3;
		 System.out.println(sub2);
	 
	 }
	 
		
	// Method
	
	 public void AddSubResult1( ) {
		 return num1- num2 -num3;
	 }
	 public void AddSubResult2() {
		 return num1 -num2;
	 }
	 

}
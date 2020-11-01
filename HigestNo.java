package com.acad.basic;

import java.util.Scanner;

public class HigestNo {
public static void main(String[] args) {
	System.out.println("please enter three number");
	Scanner s=new Scanner(System.in);

	int num1=s.nextInt();
	int num2=s.nextInt();
	int num3=s.nextInt();
	
	if(num1>num2){
		if(num1>num3){
			System.out.println("num1 :"+num1+" is highest ");
		}
		else{
			System.out.println("num3 :"+num3+" is highest ");
		}
	else if{
		if(num2>num3){
			System.out.println("num2 :"+num2+" is highest ");
		}
		else{
			System.out.println("num3 :"+num3+" is highest ");
		}
	}
	else{
		//This block helps if num1=num2 or num2=num3 or num1=num3 or num1=num2=num3
		System.out.println("Please enter different numbers");
	}
}
}

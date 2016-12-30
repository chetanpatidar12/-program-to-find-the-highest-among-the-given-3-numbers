package com.acad.basic;

import java.util.Scanner;

public class HigestNo {
public static void main(String[] args) {
	System.out.println("please enter three number");
	Scanner s=new Scanner(System.in);

	int num1=s.nextInt();
	int num2=s.nextInt();
	int num3=s.nextInt();
	
	if(num1>num2 &&num1>num3){
	System.out.println("num1 :"+num1+" is highest ");	
	}
	if(num2>num3 &&num2>num1){
		System.out.println("num2 :"+num2+" is highest ");	
		}
	if(num3>num2 &&num3>num1){
		System.out.println("num3 :"+num3+" is highest ");	
		}
}
}

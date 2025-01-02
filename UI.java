package day9;

import java.util.Scanner;

public class UI {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Calculator calci= new Calculator();
		System.out.println("enter the first number : ");
		int firstNum=sc.nextInt();
		System.out.println("enter the second number : ");
		int secondNum=sc.nextInt();
		
		System.out.println("addition : " + calci.add(firstNum, secondNum));
		System.out.println("subtraction : " + calci.sub(firstNum, secondNum));
		System.out.println("multiply : " + calci.multiply(firstNum, secondNum));
		System.out.println("divide : " + calci.divide(firstNum, secondNum));
		System.out.println("modulus : " + calci.modulus(firstNum, secondNum));
		
		
		
		
		
		
	}
}

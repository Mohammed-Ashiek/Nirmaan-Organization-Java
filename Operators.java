package day1;

import java.util.Scanner;

public class Operators {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args) {
		
		
		System.out.println("Enter the number1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter the number2 : ");
		int num2=sc.nextInt();
		
		//arithmetic operator
		System.out.println("\n--- Arithmetic Operators ---");
		System.out.println("addition - "+(num1+num2));
		System.out.println("subtraction - "+(num1-num2));
		System.out.println("multiplication - "+(num1*num2));
		System.out.println("division - "+(num1/num2));
		System.out.println("modulus - "+(num1%num2));
		
		
		//relational operator
		System.out.println("\n--- Relational Operators ---");
		System.out.println(num1+">"+num2+ (num1>num2));
		System.out.println(num1+"<"+num2+ (num1<num2));
		System.out.println(num1+">="+num2+ (num1>=num2));
		System.out.println(num1+"<="+num2+ (num1<=num2));
		System.out.println(num1+"=="+num2+ (num1==num2));
		System.out.println(num1+"!="+num2+ (num1!=num2));
		
		//logical operator
		System.out.println("\n--- Logical Operators ---");
		boolean condition1 = (num1 > 10) && (num2 < 50);
        boolean condition2 = (num1 < 5) || (num2 > 100);
        System.out.println("num1 > 10 AND num2 < 50: " + condition1);
        System.out.println("num1 < 5 OR num2 > 100: " + condition2);
		
		
		
		//assignment operator
        System.out.println("\n--- Assignment Operators ---");
        int variable = 10;
        System.out.println("Initial value of variable: " + variable);
        variable += num1;
        System.out.println("After += : " + variable);
        variable -= num1;
        System.out.println("After -= : " + variable);
        variable *= num1;
        System.out.println("After *= : " + variable);
        variable /= num1;
        System.out.println("After /= : " + variable);
        variable %= num1;
        System.out.println("After %= : " + variable);
		
        //unary operator
        System.out.println("\n--- Unary Operators ---");
        System.out.println("Value before increment: " + num1);
        System.out.println("Post-increment: " + (num1++));
        System.out.println("Value after increment: " + num1);
        System.out.println("Pre-decrement: " + (--num1));
        System.out.println("Value after decrement: " + num1);
        
       //Conditional (Ternary) Operator
        System.out.println("\n--- Ternary Operators ---");
        String result = (num1 % 2 == 0) ? "even" : "odd";
        System.out.println("The first number (" + num1 + ") is " + result);

		
		
		
	}

}

package abstractionEx1;

import java.util.Scanner;

public class calci implements calculator{

	@Override
	public void add(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("addition : "+(num1+num2));
		
	}

	@Override
	public void sub(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("subtraction : "+(num1-num2));
		
	}

	@Override
	public void mul(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("multiplication : "+(num1*num2));
		
	}

	@Override
	public void div(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("division : "+(num1/num2));
		
	}
	
	
	static Scanner sc= new Scanner(System.in); 
	public static void main(String[] args) {
		calci c= new calci();
		System.out.println("enter the number 1 :");
		int num1=sc.nextInt();
		System.out.println("enter the number 2 :");
		int num2=sc.nextInt();
		
		c.add(num1,num2);
		c.sub(num1,num2);
		c.mul(num1,num2);
		c.div(num1,num2);
	}

}

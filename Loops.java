package day4;

import java.util.Iterator;
import java.util.Scanner;

public class Loops {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		/*for (int i = 0; i<=100; i++) {
			
			if (i%5==0) {
				System.out.println("Ashiek");
			} else {
				System.out.println(i);

			}
		}
		
		System.out.println("enter the the table :");
		int n = sc.nextInt();
		for (int j = 0; j <=10 ; j++) {
			
			System.out.println(n+"x"+j+"="+j*n);
		}*/
		
		
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
		
		
	}
	
	

}

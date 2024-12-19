package day3;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class IfElse {
	static Scanner sc = new Scanner(System.in);

	 public static void main(String[] args) {

		/*System.out.println("Enter your mark"); 
		int mark = sc.nextInt();

		if (mark > 0 && mark <= 100) {
			if (mark >= 90 && mark <= 100) {
				System.out.println("Grade A");

			}

			else if (mark >= 80 && mark <= 90) {
				System.out.println("Grade B");
			} else {
				System.out.println("Grade C");
			}

		} else {
			System.out.println("invalid mark");
		}*/
		 
		 
		 //Switch case
		 System.out.println("1 for addition");
		 System.out.println("2 for subtraction");
		 System.out.println("3 for multiplication");
		 System.out.println("4 for division");
		 System.out.println("5 for modulos");
		 System.out.println("enter the number : ");
		 int key = sc.nextInt();
		 
		 
		 switch (key) {
		case 1: {
			System.out.println("enter the first number : ");
			 int fnum = sc.nextInt();
			System.out.println("enter the second number : ");
			 int snum = sc.nextInt();
			System.out.println("Addition :"+(fnum+snum));
			break;
			
		}
		case 2: {
			System.out.println("enter the first number : ");
			 int fnum = sc.nextInt();
			System.out.println("enter the second number : ");
			 int snum = sc.nextInt();
			System.out.println("Subtraction : "+(fnum-snum));
			break;
			
		}
		case 3: {
			System.out.println("enter the first number : ");
			 int fnum = sc.nextInt();
			System.out.println("enter the second number : ");
			 int snum = sc.nextInt();
			System.out.println("Multiplication : "+(fnum*snum));
			break;
			
		}
		case 4: {
			System.out.println("enter the first number : ");
			 int fnum = sc.nextInt();
			System.out.println("enter the second number : ");
			 int snum = sc.nextInt();
			System.out.println("Division : "+(fnum/snum));
			break;
			
		}
		case 5: {
			System.out.println("enter the first number : ");
			 int fnum = sc.nextInt();
			System.out.println("enter the second number : ");
			 int snum = sc.nextInt();
			System.out.println("Modulos : "+(fnum%snum));
			break;
			
		}
		default:
			System.out.println("invalid number");
			break;
		}
		 

	}
}

package day13;

import java.util.Scanner;

public class UiEx {

	static Scanner sc= new Scanner(System.in);
public static void main(String[] args) {
			book b1 = new book();
	
			boolean isWork= true;
			while (isWork) {
				System.out.println("*******************************************************************************");
				System.out.println("1 for add ");
				System.out.println("2 for update ");
				System.out.println("3 for show ");
				System.out.println("4 for exit ");
				System.out.println("*******************************************************************************");
				System.out.println("enter the your choice :");
				int key=sc.nextInt();
				
				if (key==1) {
					System.out.println("enter the id : ");
					int id=sc.nextInt();
					System.out.println("enter the name : ");
					String name=sc.nextLine();
					sc.nextLine();
					System.out.println("enter the price : ");
					double price = sc.nextDouble();
					sc.nextLine();
					System.out.println("enter the author : ");
					String author=sc.nextLine();
					
					
					b1 = new book(id, name, price, author);
					
				} 
				else if(key==2){
					System.out.println("enter the id : ");
					int id=sc.nextInt();
					b1.setId(id);
					System.out.println("enter the name : ");
					String name=sc.nextLine();
					sc.nextLine();
					b1.setName(name);
					System.out.println("enter the price : ");
					double price = sc.nextDouble();
					b1.setPrice(price);
					sc.nextLine();
					System.out.println("enter the author : ");
					String author=sc.nextLine();
					b1.setAuthor(author);
					

				}
				else if(key==3) {
					System.out.println(b1);
					
				}else if(key==4) {
					System.out.println("thank you");
					isWork=false;
					
				}else {
					System.out.println("enter the correct choice ! ");
				}
				

				
				
				
			}
		}

}

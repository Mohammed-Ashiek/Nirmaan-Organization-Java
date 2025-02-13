package book;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		book bk = new book();
		boolean isWork = true;
		ArrayList<book> arr = new ArrayList<book>();

		while (isWork) {

			System.out.println("*******************************************************************************");
			System.out.println("1 for add book ");
			System.out.println("2 for update book ");
			System.out.println("3 for show  ");
			System.out.println("4 for remove ");
			System.out.println("5 for exit ");
			System.out.println("*******************************************************************************");
			System.out.println("enter the your choice :");
			int key = sc.nextInt();

			if (key == 1) {
				System.out.println("enter the book id : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("enter the name : ");
				String name = sc.nextLine();
				System.out.println("enter the author : ");
				String author = sc.nextLine();
				System.out.println("enter the price : ");
				double price = sc.nextDouble();

				arr.add(bk = new book(id, name, author, price));
				System.out.println("successfully added!!!!");
			}

			else if (key == 3) {
				System.out.println(arr);
			}

			else if (key == 2) {
				System.out.println("enter the student ID");
				int id = sc.nextInt();
				sc.nextLine();
				 boolean isThere = false;
				for (book book : arr) {
					if (book.getId() == id) {
						System.out.println("enter the name : ");
						String name = sc.nextLine();
						book.setName(name);
						System.out.println("enter the author : ");
						String author = sc.nextLine();
						book.setAuthor(author);
						System.out.println("enter the price : ");
						double price = sc.nextDouble();
						book.setPrice(price);
						System.out.println("updated successfully....");

					} 
				}
				if(!isThere) {
					System.out.println("Invalid ID");
				}
			}

			else if (key == 4) {
				System.out.println("enter the student ID");
				int id = sc.nextInt();
				sc.nextLine();
				boolean isThere = false;
				for (book book : arr) {
					if (book.getId() == id) {
						arr.remove(book);
						isThere = true;
						System.out.println("removed sucessfully....");
						break;

					}

				}
				
				if(!isThere) {
					System.out.println("Invalid ID");
				}

			}

			else if (key == 5) {
				System.out.println("thank you...");
				isWork = false;
			} else {
				System.out.println("enter the correct choice.....");
			}
		}

	}

}

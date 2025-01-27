package school;

import java.util.Scanner;

public class StudentUi {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		
		boolean isWork= true;
		while (isWork) {
			System.out.println("*******************************************************************************");
			System.out.println("student");
			System.out.println("1 for add ");
			System.out.println("2 for update ");
			System.out.println("3 for show ");
			System.out.println("4 for exit ");
			System.out.println("*******************************************************************************");
			System.out.println("enter the your choice :");
			int key=sc.nextInt();
			switch(key) {
			
			case 1 : 
				System.out.println("enter the id : ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the name : ");
				String name=sc.nextLine();
				sc.nextLine();
				System.out.println("enter the phone number : ");
				long phno = sc.nextLong();
				sc.nextLine();
				System.out.println("enter the email : ");
				String email=sc.nextLine();
				
				
				s1 = new Student(id, name, phno, email);
				break;
			
			
			
			case 2 : {
				
				System.out.println("1 for change id  ");
				System.out.println("2 for change name ");
				System.out.println("3 for change phone number ");
				System.out.println("4 for change email ");
				int a = sc.nextInt();
				
				if(a==1) {
				System.out.println("enter the id : ");
				int id1=sc.nextInt();
				s1.setId(id1);
				System.out.println("updated successfully");
				}
				else if(a==2) {
				System.out.println("enter the name : ");
				String name1=sc.nextLine();
				sc.nextLine();
				s1.setName(name1);
				System.out.println("updated successfully");
				}
				else if(a==3) {
				System.out.println("enter the phone number : ");
				long phno1 = sc.nextLong();
				s1.setPhno(phno1);
				sc.nextLine();
				System.out.println("updated successfully");
				}
				else if(a==4) {
				System.out.println("enter the email : ");
				String email1 = sc.nextLine();
				s1.setEmail(email1);
				System.out.println("updated successfully");
				}
				else {
					System.out.println("enter the correct choice !");
				}
			
				
			}
			
			case 3 : 
				System.out.println(s1);
			    break;
				
			case 4 : 
				System.out.println("thank you");
				isWork=false;
				break;
				
			default : 
				System.out.println("enter the correct choice ! ");
				break;
			
			
			}//switch
			

			
			
			
		}

		
		
		
	}

}

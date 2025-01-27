package school;

import java.util.Scanner;


public class TeacherUi {
	static Scanner sc = new Scanner (System.in);
public static void main(String[] args) {
	
	Teacher t1= new Teacher(1, "JD" , 987654321l, 40000.00);
	
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
			sc.nextLine();
			System.out.println("enter the name : ");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("enter the phone number : ");
			long phno = sc.nextLong();
			sc.nextLine();
			System.out.println("enter the salary : ");
			double salary=sc.nextDouble();
			
			
			t1 = new Teacher(id, name, phno, salary);
			
		} 
		
		else if (key == 2) {
			System.out.println("press 1 for change id");
			System.out.println("press 2 for change name");
			System.out.println("press 3 for change phoneNumber");
			System.out.println("press 4 for change salary");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Enter id : ");
				int id = sc.nextInt();
				t1.setId(id);
				sc.nextLine();
				break;
			case 2:
				System.out.println("Enter name : ");
				String name = sc.next();
				t1.setName(name);
				break;
			case 3:
				System.out.println("Enter phoneNumber : ");
				long phno = sc.nextLong();
				t1.setPhno(phno);
				break;
				  
			case 4:
				System.out.println("Enter salary : ");
				double salary = sc.nextDouble();
				t1.setSalary(salary);
				break;	
				

			default:
				break;
			}
		}
		
		
		else if(key==3) {
			System.out.println(t1);
			
		}else if(key==4) {
			System.out.println("thank you");
			isWork=false;
			
		}else {
			System.out.println("enter the correct choice ! ");
		}
		

		
		
		
	}
}
}

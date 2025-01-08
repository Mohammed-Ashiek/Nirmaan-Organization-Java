package day12;

import java.util.Set;

class bank{
	private int id;
	private String name ;
	private double balance;
	private long phNum;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
		}
	
	public String getName() {
		return name;
		}
	
	
	
	public void setBalance(double balance) {
		this.balance=balance;
		}
	
	public double getBalance() {
		return balance;
		}
	
	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}
	
	public long getPhNum() {
		return phNum;
	}
	
	public String toString() {
		return "bank name : "+ name +"\nbank id : "+ id +"\nbank balance : "+ balance + "\n phone number : "+ phNum ;
	}
	
}

public class AccessSpecifier {
	
public static void main(String[] args) {
	bank b1= new bank();
	
	b1.setId(1);
//	System.out.println("bank Id : "+b1.getId());
	b1.setName("Ashiek");
	//System.out.println("Name : "+b1.getName());
	
	b1.setBalance(800000);
	//System.out.println("bank balance : "+b1.getBalance());
	
	b1.setPhNum(987456123l);
	//System.out.println("phone number : "+b1.getPhNum());
	System.out.println(b1);
	
	System.out.println("*******************************************************************************************************************************");
	bank b2= new bank();
	b2.setId(2);
	System.out.println("bank Id : "+b2.getId());
	
	b2.setName("irfan");
	System.out.println("Name : "+b2.getName());
	
	b2.setBalance(1000000);
	System.out.println("bank balance : "+b2.getBalance());
	
	b2.setPhNum(987456193l);
	System.out.println("phone number : "+b2.getPhNum());
	
	System.out.println("*******************************************************************************************************************************");
	bank b3= new bank();
	b3.setId(3);
	System.out.println("bank Id : "+b3.getId());
	
	b3.setName("rizwan");
	System.out.println("Name : "+b3.getName());
	
	b3.setBalance(700000);
	System.out.println("bank balance : "+b3.getBalance());
	
	b3.setPhNum(987456123l);
	System.out.println("phone number : "+b3.getPhNum());
}


}

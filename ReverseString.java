package day7;

public class ReverseString {
public static void main(String[] args) {
	//String Reverse
	/*String myName="ashiek";
	String rev="";
	
	for (int i = 5; i >=0; i--) {
		rev=rev+myName.charAt(i);
	}
	//Upper case
	String up=rev.toUpperCase();
	System.out.println(up);*/
	
	
	
	        // Implicit Type Casting 
	        int num = 100;
	        double doubleNum = num;  // int to double
	        System.out.println("Implicit Casting (int to double): " + doubleNum);

	        // Explicit Type Casting 
	        double decimalNumber = 99.99;
	        int intNum = (int) decimalNumber;  // double to int
	        System.out.println("Explicit Casting (double to int): " + intNum);

	        // Example of data loss during narrowing
	        int largeNumber = 150;
	        byte smallNumber = (byte) largeNumber;  
	        System.out.println("Data Loss Example (int to byte): " + smallNumber);
	        
	        
	        //array 
	        String []fruits= {"apple","orange","banana"};
	        
	        for (int i = 0; i < fruits.length; i++) {
	        	System.out.println(fruits[i]);
	    	    
			}
	

}
}

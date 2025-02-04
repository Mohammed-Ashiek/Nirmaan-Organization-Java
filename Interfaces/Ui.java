package Interfaces;



public class Ui implements Calculator1,Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ui u=new Ui();
		u.add(10, 25);
		Calculator1.display();
		u.display2();
	

	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}
	
	


}

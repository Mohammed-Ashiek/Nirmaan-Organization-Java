package Abstract;

abstract class LeoDas{
	abstract void name () ;
}

public class DasAndCo extends LeoDas {
	
	@Override
	 void name() {
		// TODO Auto-generated method stub
		System.out.println("im leo das");
		
	}

	public static void main(String[] args) {
		DasAndCo dc= new DasAndCo();
		dc.name();
			
			
		
		
	}
}

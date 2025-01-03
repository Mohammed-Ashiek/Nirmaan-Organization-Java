package day10;

public class ConstructorEx {
String name;
int modelNum;
double price;

ConstructorEx() {
	
}
ConstructorEx(String name,int modelNum,double price) {
	this.name=name;
	this.modelNum=modelNum;
	this.price=price;
}

public static void main(String[] args) {
	ConstructorEx car= new ConstructorEx("innova",1001,1000000);
	ConstructorEx car1= new ConstructorEx();
	System.out.println("car name : "+ car.name);
	System.out.println("car model number : "+ car.modelNum);
	System.out.println("car price : "+ car.price);
	
	car1.name= "toyota";
	car1.modelNum=1002;
	car1.price=800000;
	System.out.println("********************************************************************************************");
	System.out.println("car name : "+ car1.name);
	System.out.println("car model number : "+ car1.modelNum);
	System.out.println("car price : "+ car1.price);


}

}

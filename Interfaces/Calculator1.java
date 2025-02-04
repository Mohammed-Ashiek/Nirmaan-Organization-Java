package Interfaces;

public interface Calculator1 {
void add(int a,int b);
void sub(int a,int b);
//can use directly
static void display() {
	System.out.println("hi im display1");
}
//create object and use
default void display2() {
	System.out.println("hi im display2");
}
}

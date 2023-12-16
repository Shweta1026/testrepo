package day4oct.selenium;
class c{
	c(double d){
		System.out.println("I am cons. of class c "+d);
	}
	
}
class A extends c{
	A(int i){
		super(20.20d);
		System.out.println("I am cons. of class A "+i);
	}
	
}
public class B extends A{
	B(){
		super(20);
		System.out.println("I am cons. of class B");
	}
	
public static void main(String[] args) {
		B ref =new B();

	}

}

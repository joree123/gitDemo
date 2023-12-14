package oop5;

public class q5 extends Polymorph{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Polymorph p1=new q5();
 p1.display();
 //static polymorphism-method overloading
 p1.add(3, 7);
 p1.add(5, 6, 7);
 
	}
	//dynamic polymorphism -method overriding 
	public void display() {
		System.out.println("child class");
	}

}

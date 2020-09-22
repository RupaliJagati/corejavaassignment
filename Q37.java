//34.Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of r­adius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
import java.util.*;
class person{
	private String name;
	private int age =18 ;
	person(){
		age=55;
		name="raju";
	}
	public void display(){
		System.out.println("name is: "+name);
				System.out.println("age is: "+age);

	}
	
	
}
class Q37{
	public static void main(String a[]){
	   person p=new person();
	   p.display();
	}
}
//34.Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of r­adius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
import java.util.*;
class circle{
	private int r;
	private double area;
	private double pi=3.14;
	
	public void init(){
		 Scanner sc= new Scanner(System.in);
	    System.out.println("enter Radius");
		 r= sc.nextInt();
		
	}
	public void calculateArea(){
		area= pi*r*r;
         
	}
	public void display(){
		System.out.println("area of a circle is = "+area);
         
	}
	
}
class Q34{
	public static void main(String a[]){
	   
	   circle c = new circle();
	   c.init();
	   c.calculateArea();
	  
	   c.display();
	}
}
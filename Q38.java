//38
import java.util.*;
class Employee{
	static int empid=0;
	private int salary;
	static int totalsal;
	Employee(int sal){
		empid+=1;
		this.salary=sal;
		totalsal+=sal;
	}
	void display(){
		System.out.println("total imp are "+empid);
		System.out.println("total sal are "+totalsal);
		System.out.println("======================");
	}
	
}
class Q38{
	public static void main(String a[]){
	   Employee e=new Employee(500);
	   e.display();
	    Employee e1=new Employee(1500);
	   e1.display();
	}
}
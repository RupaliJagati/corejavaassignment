//33.Write a program to demonstrate functionalities of this keyword in java. 
import java.util.*;
class my33{
	private int a;
	private int b;
	
	public void setData(int a,int b){
		this.a=a;
		this.b=b;
		
	}
	public void showData(){
		System.out.println("A= "+a);
		System.out.println("B= "+b);

	}
}
class Q33{
	public static void main(String a[]){
	   
	   my33 m=new my33();
	   m.setData(100,300);
	   m.showData();
	}
}
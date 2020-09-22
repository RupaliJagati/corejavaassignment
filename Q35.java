//35. addition,multiply,subtract,power,using static method
import java.util.*;
import java.lang.Math; 
class MathOperation{
	
	public static int add(int x,int y){
	    
		
	
	  return x+y;
	}
	public static int subtract(int x,int y){
	   
		return x-y;
	
	}
	public static int multiply(int x,int y){
	    
		return x*y;
	
	}
	public static double power(int x,int y){
	    
		return (Math.pow(x, y));
	
	}
	
	
}
class Q35{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number");
     int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
       int addition= MathOperation.add(a,b);
		System.out.println("Sum of two numbers  "+addition);
      int Sub= MathOperation.subtract(a,b);
		System.out.println("sub of two numbers  "+Sub);
		int Mul= MathOperation.multiply(a,b);
		System.out.println("multiplication of two numbers  "+Mul);
		double pow= MathOperation.power(a,b);
		System.out.println("power of two numbers  "+pow);
		
		
		}

}
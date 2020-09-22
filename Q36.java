//36.  MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
import java.util.*;
import java.lang.Math; 
class MathOperation{
	
	public void multiply(int a,int b){
     System.out.println("multiplication of two numbers  "+(a*b));
    }
	public void multiply(float a,float b,float c){
     System.out.println("multiplication of three numbers  "+(a*b*c));
    }
	public void multiply(int a,double b){
    System.out.println("multiplication of two numbers  "+(a*b));
	}
	//}public void multiply(int a,int b){
    //System.out.println("multiplication of two numbers  "+(a+b));

	//}
	double multiply(int []a){
		int mul=1;
		for(int i=0;i<a.length;i++){
			mul*=a[i];
		}
		return mul;
	}
	
}
class Q36{
	public static void main(String args[]){
	  MathOperation m=new MathOperation();
	  m.multiply(2,4);
	  m.multiply(1.2f,1.2f,1.2f);
	  	  m.multiply(2,10.0);
int []a={1,2,3};
	      System.out.println("multiplication of array numbers  "+ m.multiply(a));

  }

}
//46
import java.util.*;

class shape{
	int length;
	int height;
	shape(){
		
	}
	shape(int length,int height){
		this.length=length;
		this.height=height;
	}
	void display(){
		System.out.println("length="+length+"height="+height);
	}
	void area(){}
	
}
class rectangle extends shape{
	rectangle(){}
	rectangle(int length,int height)
	{
		super(length,height);
	}
	void area(){
		super.display();
		System.out.println("area :"+(length*height));
	}
	void diagonal(){
		System.out.println("diagonal :"+(Math.sqrt(length^2 + height^2)));
	}
	
	
}
class triangle extends shape{
	triangle(){}
	triangle(int length,int height)
	{
		super(length,height);
	}
	void area(){
		super.display();
		System.out.println("area :"+(0.5 * length * height));
	}
}

public class Q46{

	public static void main(String[] args) {
		 shape sarr[]={new rectangle(30,40),new triangle(10,20)};
		 sarr[0].area();
		 sarr[1].area();
		 rectangle r=(rectangle)sarr[0];
		 r.diagonal();
		 
	    
	    
	}
}

package co4;
import java.util.Scanner;

//create interfaces
interface area{}

//create class
class Rectangle implements area{
	double l,b;
	double area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		System.out.println("Enter the breadth:");
		l=sc.nextDouble();
		b=sc.nextDouble();
		return l*b;
	}
}
class Triangle implements area{
	double l,b,h;
	double area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		System.out.println("Enter the breadth:");
		System.out.println("Enter the breadth:");
		l=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();
		return l*b*h*.5;
	}
}
class Square implements area{
	double a;
	double area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		a=sc.nextDouble();
		return a*a;
	}
}
class Circle implements area{
	double r;
	double area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		r=sc.nextDouble();
		return 3.14*r*r;
	}
}
public class qn1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rectangle obj1=new Rectangle();
		Triangle obj2=new Triangle();
		Square obj3=new Square();
		Circle obj4=new Circle();
		
		System.out.println("Area of rectangle is:"+obj1.area());
		System.out.println("Area of triangle is:"+obj2.area());
		System.out.println("Area of square is:"+obj3.area());
		System.out.println("Area of circle is:"+obj4.area());
	

	}

}

package sample;
import java.util.Scanner;
class product
{
	int pcode;
	String pname;
	int price;
}
public class samplefile {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	product obj1=new product();
	product obj2=new product();
	product obj3=new product();
	System.out.println("Enter the pcode:");
	obj1.pcode=sc.nextInt();
	System.out.println("Enter the pname:");
	obj1.pname=sc.next();
	System.out.println("Enter the price:");
	obj1.price=sc.nextInt();
	System.out.println("Enter the pcode:");
	obj2.pcode=sc.nextInt();
	System.out.println("Enter the pname:");
	obj2.pname=sc.next();
	System.out.println("Enter the price:");
	obj2.price=sc.nextInt();
	System.out.println("Enter the pcode:");
	obj3.pcode=sc.nextInt();
	System.out.println("Enter the pname:");
	obj3.pname=sc.next();
	System.out.println("Enter the price:");
	obj3.price=sc.nextInt();
	if(obj1.price<obj2.price && obj1.price<obj3.price)
	{
		System.out.printf("First product price is lowest %d,%S,%d",obj1.pcode,obj1.pname,obj1.price);
	}
	else if(obj2.price<obj1.price && obj2.price<obj3.price)
	{
		System.out.printf("Second product price is less %d,%S,%d",obj2.pcode,obj2.pname,obj2.price);
	}
	else
	{
		System.out.printf("Third product price is less %d,%S,%d",obj3.pcode,obj3.pname,obj3.price);
	}
	sc.close();
	}
	}



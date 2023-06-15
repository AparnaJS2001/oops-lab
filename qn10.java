package co4;
import java.util.*;
public class qn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> obj=new ArrayList<String>();
obj.add("Aparna");
obj.add("Aravind");
obj.add("sreekala");

System.out.println("The arraylist is:"+obj);


System.out.println("Enter the string:");
Scanner sc=new Scanner(System.in);
String T=sc.next();
if(obj.contains(T)) {
	System.out.println(obj+"Element found!!");
}
else {
	System.out.println("NOT found!!");
}

obj.remove("Aparna");
System.out.println("The updated Arraylist is:"+obj);

int size=obj.size();
System.out.println("The size of the arraylist is:"+size);


	}

}

package co4;
import java.util.Stack;
import java.util.Scanner;
public class qn12 {
    public static void main(String[] args) {
        // Create a stack to hold the objects
        Stack<String> stack = new Stack<>();

        // Push some objects onto the stack
        stack.push("Object 1");
        stack.push("Object 2");
        stack.push("Object 3");
        stack.push("Object 4");
        stack.push("Object 5");
        // Print the current stack contents
        System.out.println("Current stack: " + stack);
Scanner sc=new Scanner(System.in);
System.out.println("Enter the position:");
int positions=sc.nextInt();
stack.remove(positions);
      

        // Print the updated stack contents
        System.out.println("Updated stack: " + stack);
    }
}
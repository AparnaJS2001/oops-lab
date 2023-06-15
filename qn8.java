
package co4;
import java.util.ArrayList;
import java.util.Scanner;

class Stack<T> {

    ArrayList<T> A;
    int top = -1;
    int size;

    Stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T x) {
        if (top + 1 == size) {
            System.out.println("Stack is full!");
        } else {
            top++;
            A.add(x);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Deleted element is: " + A.get(top));
            A.remove(top);
            top--;
        }
    }

    void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(A.get(i) + " ");
            }
            System.out.println();
        }
    }
}

public class qn8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> obj1 = new Stack<>(3);
        obj1.push(10);
        obj1.push(2);
        obj1.push(8);
        obj1.printStack();

        obj1.pop();
        obj1.printStack();
    }
}
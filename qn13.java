package co4;
import java.util.*;

public class qn13 {
    public static void main(String[] args) {
        // Create a priority queue
        Queue<String> queue = new PriorityQueue<>();

        // Get the number of elements from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Get the elements from the user
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.next();
            queue.offer(element);
        }

        // Print the queue elements
        System.out.println("Queue elements: " + queue);

        // Close the scanner
        scanner.close();
    }
}
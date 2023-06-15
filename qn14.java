package co4;
import java.util.*;

public class qn14 {
    public static void main(String[] args) {
        // Create a deque
        Deque<String> deque = new ArrayDeque<>();

        // Get the number of elements from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Add elements to the front of the deque
        System.out.println("Enter " + numElements + " elements to add at the front:");
        for (int i = 0; i < numElements; i++) {
            String element = scanner.next();
            deque.addFirst(element);
        }

        // Add elements to the end of the deque
        System.out.println("Enter " + numElements + " elements to add at the end:");
        for (int i = 0; i < numElements; i++) {
            String element = scanner.next();
            deque.addLast(element);
        }

        // Print the deque elements
        System.out.println("Deque elements: " + deque);

        // Remove elements from the front of the deque
        System.out.print("Enter the number of elements to remove from the front: ");
        int numRemoveFront = scanner.nextInt();
        for (int i = 0; i < numRemoveFront; i++) {
            deque.removeFirst();
        }

        // Remove elements from the end of the deque
        System.out.print("Enter the number of elements to remove from the end: ");
        int numRemoveEnd = scanner.nextInt();
        for (int i = 0; i < numRemoveEnd; i++) {
            deque.removeLast();
        }

        // Print the updated deque elements
        System.out.println("Updated deque elements: " + deque);

        // Close the scanner
        scanner.close();
    }
}
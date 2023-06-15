package co4;
import java.util.LinkedList;
import java.util.Scanner;

public class qn11 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Add elements to the linked list
        System.out.print("Enter the number of elements to add: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < count; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            linkedList.add(element);
        }

        // Display the original linked list
        System.out.println("Original linked list:");
        System.out.println(linkedList);

        // Remove all elements from the linked list
        linkedList.clear();

        // Display the updated linked list
        System.out.println("Linked list after removing all elements:");
        System.out.println(linkedList);

        scanner.close();
    }
}
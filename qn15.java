package co4;
import java.util.*;

public class qn15
{
    public static void main(String[] args) {
        // Create a LinkedHashSet
        Set<String> set = new LinkedHashSet<>();

        // Get the number of elements from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Get the elements from the user
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.next();
            set.add(element);
        }

        // Print the set elements
        System.out.println("Set elements: " + set);

        // Close the scanner
        scanner.close();
    }
}
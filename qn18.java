package co4;
import java.util.*;

public class qn18 {
    public static void main(String[] args) {
        // Create a HashMap to hold key-value pairs
        Map<String, Integer> hashMap = new HashMap<>();

        // Get the number of elements from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Add elements to the HashMap
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter key " + (i + 1) + ": ");
            String key = scanner.nextLine();

            System.out.print("Enter value " + (i + 1) + ": ");
            int value = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            hashMap.put(key, value);
        }

        // Print the initial HashMap
        System.out.println("Initial HashMap: " + hashMap);

        // Convert HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Close the scanner
        scanner.close();
    }
}
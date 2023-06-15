package co4;
import java.util.*;

public class qn16 {
    public static void main(String[] args) {
        // Create two hash sets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Get the number of elements for the first set from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements for the first set: ");
        int numElements1 = scanner.nextInt();

        // Get the elements for the first set from the user
        System.out.println("Enter elements for the first set:");
        for (int i = 0; i < numElements1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            set1.add(element);
        }

        // Get the number of elements for the second set from the user
        System.out.print("Enter the number of elements for the second set: ");
        int numElements2 = scanner.nextInt();

        // Get the elements for the second set from the user
        System.out.println("Enter elements for the second set:");
        for (int i = 0; i < numElements2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            set2.add(element);
        }

        // Compare the sets
        boolean isEqual = set1.equals(set2);

        // Print the comparison result
        if (isEqual) {
            System.out.println("The two sets are equal.");
        } else {
            System.out.println("The two sets are not equal.");
        }

        // Close the scanner
        scanner.close();
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    // Method to check if the array is already sorted
    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // If any element is smaller than the previous one, the array is not sorted
            }
        }
        return true; // If loop completes, array is sorted
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] arr = new int[size];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array is sorted
        if (isSorted(arr)) {
            System.out.println("The array is already sorted.");
        } else {
            System.out.println("The array is not sorted. Sorting the array...");
            Arrays.sort(arr); // Sorting the array using Arrays.sort()
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}

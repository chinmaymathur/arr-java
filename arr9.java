import java.util.Scanner;

public class arr9 {
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0]; // Initialize the first element

        // Start loop from 1 to avoid negative index
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i]; 
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input array:");
        printArray(arr);
        int[] pref = makePrefixSumArray(arr);
        System.out.println("Prefix sum array:");
        printArray(pref);
    }
}

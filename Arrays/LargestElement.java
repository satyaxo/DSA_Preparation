package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = { 1, 0, 7, 10, 2 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int n = sc.nextInt();
        // System.out.println(largestElement(n, sc));
        System.out.println(SortArray(n, arr));

    }

    static int largestElement(int n, Scanner sc) {

        int[] arr = new int[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements in an array");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max element in an array: ");
        return max; // TC: O(N), SC:O(1)

    }

    static int SortArray(int n, int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1]; // TC: O(N logN), SC:O(1)
    }

}

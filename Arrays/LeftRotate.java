package Arrays;

import java.util.Scanner;

public class LeftRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter elements for an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        LeftRotate.leftRotateByOne(n, arr);

    }

    static void leftRotateByOne(int n, int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = firstElement;

        System.out.print("Left Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

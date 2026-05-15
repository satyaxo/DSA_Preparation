package Arrays;

import java.util.Scanner;

public class array_creation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        // Create_array.createIntegerArray(n, sc);
        // Create_array.createCharacterArray(n, sc);
        // Create_array create_array = new Create_array();
        // create_array.createStringArray(n, sc);
        Create_array.createFloatArray(n, sc);

    }
}

class Create_array {

    static void createIntegerArray(int n, Scanner sc) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of an arrays: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void createCharacterArray(int n, Scanner sc) {

        char[] arr1 = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of an arrays: ");
            arr1[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

    }

    void createStringArray(int n, Scanner sc) {
        String[] arr2 = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of an array: ");
            arr2[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    static void createFloatArray(int n, Scanner sc) {
        float[] arr3 = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of an array: ");
            arr3[i] = sc.nextFloat();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestAndSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        // printSecond(n, sc);
        // secondMethod(n, sc);
        // secondLargest(n, sc);
        int secondSmallest = secondSmallest(n, sc);
        System.out.println("Second Smallest: "+secondSmallest);

    }

    static void printSecond(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int secMin = arr[1];
        int secMax = arr[arr.length - 2];
        System.out.println("Second max in an array: " + secMax);
        System.out.println("Second min in an array: " + secMin);

    }

    static void secondMethod(int n, Scanner sc) {
        int[] arr = new int[n];
        System.out.println("Enter the elements for an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr.length < 2) {
            System.out.println(-1 + " " + -1);
        }

        int max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, sec_min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > sec_max && arr[i] != max) {
                sec_max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < sec_min && arr[i] != min) {
                sec_min = arr[i];
            }
        }

        System.out.println("sec_max:" + sec_max + " " + "sec_min" + sec_min); // TC:)O(N), SC:O(1)

    }

    static void secondLargest(int n, Scanner sc) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int large = arr[0];
        int sec_large = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                sec_large = large;
                large = arr[i];
            } else if (arr[i] < large && arr[i] > sec_large) {
                sec_large = arr[i];
            }
        }
        System.out.println("Second largest: " + sec_large);

    }

    static int secondSmallest(int n, Scanner sc) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;

    }

}

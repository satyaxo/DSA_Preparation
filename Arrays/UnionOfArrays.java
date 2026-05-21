package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array1: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of an array2: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // System.out.println(UnionOfArrays.union(n, arr1, arr2));
        List<Integer> result = UnionOfArrays.twoPointer(n, m, arr1, arr2);

        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    static List<Integer> union(int n, int[] arr1, int[] arr2) {

        Set<Integer> set = new TreeSet<Integer>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        return new ArrayList<Integer>(set);

    }

    static List<Integer> twoPointer(int n, int m, int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {
                if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != arr1[i]) {
                    arrayList.add(arr1[i]);
                }
                i++; // ✅ always increment
            } else if (arr2[j] < arr1[i]) {
                if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != arr2[j]) {
                    arrayList.add(arr2[j]);
                }
                j++; // ✅ always increment
            } else {
                if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != arr1[i]) {
                    arrayList.add(arr1[i]);
                }
                i++;
                j++; // ✅ both move
            }
        }

        // Remaining elements of arr1
        while (i < n) {
            if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != arr1[i]) {
                arrayList.add(arr1[i]);
            }
            i++; // ✅ always increment
        }

        // Remaining elements of arr2
        while (j < m) {
            if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != arr2[j]) {
                arrayList.add(arr2[j]);
            }
            j++; // ✅ always increment
        }

        return arrayList;
    }

}

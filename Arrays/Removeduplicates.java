package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Removeduplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Removeduplicates.removeDupliactes(arr);
        // int k =Removeduplicates.twoPointer(n, arr);
        int k = Removeduplicates.arrayList(n, arr);
        System.out.print("The array without duplicates: ");
        for(int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("The no of unique elements: "+k);

    }

    static void removeDupliactes(int[] arr) {
        Set<Integer> set = new LinkedHashSet<Integer>();

        for (int num : arr) {
            set.add(num);
        }

        int i = 0;
        for (int val : set) {
            arr[i++] = val;
        }

        for (int j = 0; j < set.size(); j++) {
            System.out.print(+arr[j] + " ");
        }
        System.out.println("Number of Unique elements:" + set.size());

    }

    static  int twoPointer(int n, int[] arr) {

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }

        }
        return i+1;
    }

    static int arrayList(int n, int[] arr){
        List<Integer> list = new ArrayList<Integer>();

        for(int num : arr){
            if(!list.contains(num)){
                list.add(num);
            }
        }

        for(int i =0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        return list.size();
    }
    

}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZerosToEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements for an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(ZerosToEnd.movezeros(n, arr)));
        ZerosToEnd.methodTwo(n, arr);

    }

    static int[] movezeros(int n, int[] arr) {

        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (arr[start] == 0 && arr[end] != 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (arr[start] != 0 && arr[end] == 0) {
                end--;
                int temp1 = arr[start];
                arr[start] = arr[end];
                arr[end] = temp1;
                start++;
            } else if (arr[start] != 0 && arr[end] != 0) {
                start++;
            }

        }
        return arr;
    }

    static void methodTwo(int n , int[] arr){
        int[] temp = new int[n];
        int j =0;
        int count =0;
        for(int i =0; i<n; i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }else if(arr[i]==0){
                count++;
            }
        }

        System.out.println("Number of zeros: "+count+" "+Arrays.toString(temp));

    }

    

}

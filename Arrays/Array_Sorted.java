package Arrays;

import java.util.Scanner;

public class Array_Sorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }

       // ArrayCreation arrayCreation = new ArrayCreation();
        //boolean b = arrayCreation.arraySortCheck(n, arr);
        //if(b) System.err.println("sorted"); else System.out.println("unsorted");
        System.out.println(ArrayCreation.methodTwo(n, arr) ? "sorted" : "unsorted");
        
    }
    

}

class ArrayCreation{
    boolean arraySortCheck(int n, int[] arr){
        
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean methodTwo(int n, int[] arr){
        for(int i =1; i<n; i++){
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }
} 


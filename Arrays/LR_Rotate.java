package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LR_Rotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter k no of rotations: ");
        int k = sc.nextInt();
        System.out.println("Enter rotation type right or left: ");
        String type = sc.next();
        int[] arr = new int[n];
        System.out.print("Enter elements for an array: ");
        for(int i = 0;i<n; i++){
            arr[i]=sc.nextInt();
        } 

        // LR_Rotate.rightRotate(n, k, arr);
        // LR_Rotate.leftRotate(n, k, arr);
        LR_Rotate.rotateArray(arr, k, type);
        System.out.println(Arrays.toString(arr));
    }


    static void rightRotate(int n, int k, int arr[]){

        if(n==1) return;

        k = k%n;

        int[] temp = Arrays.copyOfRange(arr, n-k, n);

        for(int i = n-k-1; i>=0; i--){
            arr[i+k]= arr[i];
        }

        for( int i=0; i<k ; i++){
            arr[i] = temp[i];
        }

    }

    static void leftRotate(int n , int k , int arr[]){
        k = k%n;

        int[] temp = Arrays.copyOfRange(arr,0,k);

        for(int i = k ; i<n; i++){
            arr[i-k]=arr[i];
        }

        for(int i =0; i<k; i++){
            arr[n-k+i]=temp[i];
        }
    }

    static void reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static int[] rotateArray(int[] arr, int k, String type){
        int n = arr.length;
        if(n ==0 || n ==1) return arr;

        k = k % n;

        if(type.equals("right")){
            // Full array reverse
            reverseArray(arr, 0, n-1);
            //reverse first k elements
            reverseArray(arr, 0, k-1);
            //reverse remaining n-k elements
            reverseArray(arr, k, n-1);

        }else if(type.equals("left")){
            //reverse first k elements
            reverseArray(arr, 0, k-1);
            //reverse remaining n-k elements
            reverseArray(arr, k, n-1);
            //reverse entire array
            reverseArray(arr, 0, n-1);
        }
        return arr;
    }


    
}

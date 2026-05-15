package Patterns;

import java.util.Scanner;

public class pattern_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        // for(int i =0; i< num; i++){
        //     for(int j =0; j <= i ; j++){
        //         int value = (i + j)%2;
        //         System.out.print(value);
        //     }
        //     System.out.println();
        // }

        switchPattern(num);

        
    }

    static void switchPattern(int n){
        int num =n;
        int start = 1;
        for(int i =0; i < num; i ++){
            System.out.print(start);
            start = (start - 1);
        }
    }
    
}



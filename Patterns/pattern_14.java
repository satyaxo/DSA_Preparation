package Patterns;

import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int inis=0;

        for(int i =0; i<num; i++){
            for(int j =1; j<=num-i; j++){
                System.out.print("*");
            }
            for(int j = 0; j<inis; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=num-i; j++){
                System.out.print("*");
            }
            inis+=2;
            System.out.println();
        
        }
    }
    
}

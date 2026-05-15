package Patterns;

import java.util.Scanner;

public class pattern_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int n = 1;
        for(int i =0; i <= num ; i++){
            for(int j = 0; j < i; j++ ){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        
    }
    
}

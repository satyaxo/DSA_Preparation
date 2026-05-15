package Patterns;

import java.util.Scanner;

public class pattern_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        sc.close();
        int n = num;
        char ch = 'A';
        for(int i = 0; i <= num ; i++){
            for(int j = 0 ; j < n ; j++ ){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
            n--;
            ch='A';
        }
    }
    
}

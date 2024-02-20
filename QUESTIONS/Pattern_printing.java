package QUESTIONS;

import java.util.Scanner;

//Input : n = 5
//Output:
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
public class Pattern_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int pattern = sc.nextInt();
        for (int i = 1; i <=pattern ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

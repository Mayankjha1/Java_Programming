package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int fact = 1;
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            fact*=i;
        }
        System.out.println("Factorial : " + fact);
        sc.close();

    }

}

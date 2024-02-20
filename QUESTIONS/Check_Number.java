package QUESTIONS;

import java.util.Scanner;

public class Check_Number {
    public static void main(String[] args) {
        // checking the number is +ve or -ve

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println(num + " is Positive");
        }
        else {
            System.out.println(num + " is negative");
        }
        sc.close();
    }
}

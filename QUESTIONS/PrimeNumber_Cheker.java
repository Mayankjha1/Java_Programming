package QUESTIONS;

import java.util.Scanner;

public class PrimeNumber_Cheker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not !!! ");
        int number = sc.nextInt();
        if(number%2==1){
            System.out.println(number + " This is not a Prime Number !!! ");
        }
        else {
            System.out.println(number + " This is a Prime Number");
        }

    }
}

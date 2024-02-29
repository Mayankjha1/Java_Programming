package QUESTIONS;

import java.util.Scanner;

public class Print_Fuzz_Buzz {
    public static void main(String[] args) {
        //If Number is divisible by 3 print fuzz otherwise print buzz
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int num =  sc.nextInt();
        if( num%3 == 0 && num%5 == 0){
            System.out.println("This Number is divisible by both " + "Woooooooo");
        } else if (num%5 == 0 && num%3 != 0 ) {
            System.out.println("This Number is divisible by 5 " + "Buzz");

        }
        else if (num%3 == 0 && num%5 != 0) {
            System.out.println("This Number is divisible by 3 " );

        }
        else {
            System.out.println("This is Divisible by some other Number ");
        }
        sc.close();
    }
}

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

    public static class Swap_Values {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first Number !!!");
            int num = sc.nextInt();
            System.out.println("Enter the Second Number !!!");
            int num2 = sc.nextInt();

            int temp = num;
            num=num2;
            num2 = temp;

            System.out.println(num);
            System.out.println(num2);

        }
    }
}

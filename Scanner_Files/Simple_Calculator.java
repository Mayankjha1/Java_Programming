package Scanner_Files;

import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
//        using if and else we are going to Implement a Simple calculator that includes +,-,*,/
        Scanner sc = new Scanner(System.in);
        System.out.println("1. +\n"+"2. -\n"+"3. *\n"+"4. /\n");
        System.out.println("Please select a Arthematic operation");
        int op = sc.nextInt();
        if(op == '+' || op == 1 || op == 1.){
            System.out.println("Please Enter first Number\n");
            int a = sc.nextInt();
            System.out.println("Please Enter Second Number\n");
            int b = sc.nextInt();
            int add = a + b ;
            System.out.println("Addition is :" + add);
        }
        if(op == '-' || op == 2 || op == 2.){
            System.out.println("Please Enter first Number\n");
            int a = sc.nextInt();
            System.out.println("Please Enter Second Number\n");
            int b = sc.nextInt();
            int add = a - b ;
            System.out.println("Substration is :" + add);
        }
        if(op == '*' || op == 3 || op == 3.){
            System.out.println("Please Enter first Number\n");
            int a = sc.nextInt();
            System.out.println("Please Enter Second Number\n");
            int b = sc.nextInt();
            int add = a * b ;
            System.out.println("Multiplication is :" + add);
        }
        if(op == '/' || op == 4 || op == 4.){
            System.out.println("Please Enter first Number\n");
            int a = sc.nextInt();
            System.out.println("Please Enter Second Number\n");
            int b = sc.nextInt();
            int add = a / b ;
            System.out.println("Division is :" + add);
        }
   else{
       System.out.println("You have entered wrong input !!!");

        }





    }
}

package Scanner_Files;

import java.util.Scanner;

public class First_Take_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Please Enter the Second Number");
        int b = sc.nextInt();
        int add = a+b;
        System.out.println("The addition is : " + add);
    }
}

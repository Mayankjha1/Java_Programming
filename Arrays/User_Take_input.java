package Arrays;

import java.util.Scanner;

public class User_Take_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many number you want to enter in a array");
        int arr = sc.nextInt();
        int [] int_arry = new int[arr];
        for (int i = 0; i < arr; i++) {
            int_arry[i] = sc.nextInt();
        }
        for (int i = 0; i < arr; i++) {
            System.out.println(int_arry[i]);
        }
        sc.close();
    }
}

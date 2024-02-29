package Arrays;

import java.util.Scanner;

public class User_Input_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int[] num = new int[]{sc.nextInt()};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}

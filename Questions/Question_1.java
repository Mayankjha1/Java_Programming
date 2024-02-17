package Questions;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        // We have to calculate the formula for this one
        // 1/3(x^2 + y^2 + |z|)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of x");
        double x = sc.nextDouble();
        System.out.println("Enter the Value of y");
        double y = sc.nextDouble();
        System.out.println("Enter the Value of z");
        int z = sc.nextInt();

        double result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println("The Result is : " + result);

        sc.close();

    }
}

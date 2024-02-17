package Scanner_Files;

import java.util.Scanner;

public class Taking_input_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name !!!");
        String Name = sc.next();
        System.out.println("Enter your age !!!");
        int age = sc.nextInt();
        System.out.println("Enter your Salary !!!");
        int salary = sc.nextInt();

        System.out.println("Your Name is : " + Name +"\n" + "Your age is : "+ age +"\n"+ "Your Salary is : "+ salary);



    }
}

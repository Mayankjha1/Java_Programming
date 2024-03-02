package Arrays;

import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Eter you String Value");
        String Name = sc.next();
        String temp = "";
        for (int i = Name.length()-1; i >=0 ; i--) {
                temp = temp+Name.charAt(i);
        }
        System.out.println(temp);
    }
}

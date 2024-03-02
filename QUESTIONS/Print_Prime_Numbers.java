package QUESTIONS;

public class Print_Prime_Numbers {
    public static void main(String[] args) {
        //Print Prime Numbers from 1 to 100
        //Number is divisible by 1 and itself is called Prime Number
        for (int i = 1; i <=100 ; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }

        }
    }
}

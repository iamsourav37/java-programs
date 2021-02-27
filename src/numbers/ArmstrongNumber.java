package numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter a number : ");
        int number = sc.nextInt();

        int temp = number;
        int number2 = 0;
        int count = ArmstrongNumber.countDigit(number);

        while(temp>0){
            int lastDigit = temp % 10;
            number2 += Math.pow(lastDigit,count);

            temp /= 10;
        }

        if(number == number2){
            System.out.println("Its an armstrong number");
        }else{
            System.out.println("Its not an armstrong " +
                    "number");
        }


    }

    static int countDigit(int n){
        int counter = 0;

        while(n>0){
            counter++;
            n /= 10;
        }
        return counter;
    }
}


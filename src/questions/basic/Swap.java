package questions.basic;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("----------After " +
                "swapping------------");

        System.out.println("Number 1 : "+num1);
        System.out.println("Number 2 : "+num2);

    }
}

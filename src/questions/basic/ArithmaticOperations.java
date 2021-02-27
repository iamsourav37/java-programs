package questions.basic;

import java.util.Scanner;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
public class ArithmaticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int mul = num1 * num2;
        int subs = num1 - num2;
        int div = num1 / num2;
        int rem = num1 % num2;

        System.out.println("Summation : "+sum);
        System.out.println("Substruction : "+subs);
        System.out.println("Multiplication : "+mul);
        System.out.println("Division : "+div);
        System.out.println("Remainder : "+rem);

    }
}

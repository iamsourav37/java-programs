package questions.basic;

//Write a Java program that takes two numbers as input and display the product of two numbers

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();

        int product = num1 * num2;

        System.out.println("Product is : "+product);
    }
}

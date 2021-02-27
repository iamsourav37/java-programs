package questions.basic;

import java.util.Scanner;

//Write a Java program to print the sum of two numbers. Go to the editor
//        Test Data:
//        74 + 36
//        Expected Output :
//        110
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is : "+sum);

    }
}

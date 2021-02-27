package questions.basic;

import java.util.Scanner;
//Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        for (int i =1; i<=10; i++)
            System.out.println(num+" * "+i+" = "+ num*i);




    }
}

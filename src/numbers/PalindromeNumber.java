package numbers;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int reverse = 0;
        int temp = number;

        while(temp>0){
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }

        if(number == reverse){
            System.out.println("Its a palindrome number");

        }else{
            System.out.println("Its not a palindrome " +
                    "number");
        }

    }
}

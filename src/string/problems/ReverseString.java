package string.problems;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I am a Java Programmer";

//        reversing the string way 1
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse.concat(String.valueOf(str.charAt(i)));
        }
        System.out.println("Reverse : "+ reverse);

//        way2
        char[] ch = str.toCharArray();
        int length = ch.length;
        for(int i=0; i<length/2; i++){
            char temp = ch[i];
            ch[i] = ch[length-1-i];
            ch[length-1-i] = temp;
        }
        String reverse2 = String.valueOf(ch);
        System.out.println("Reverse way 2 : "+ reverse2);

    }
}

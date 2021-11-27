package array_questions;

import java.util.Scanner;

public class SearchingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayElements = new int[5];
        int length = arrayElements.length;

        for(int i=0; i<length; i++){
            System.out.println("Enter next value : ");
            arrayElements[i] = sc.nextInt();
        }

        System.out.println("Enter search element : ");
        int key = sc.nextInt();

        int index = search(arrayElements, key);

        if(index == -1){
            System.out.println(key+" is not present in the array");
        }else{
            System.out.println("Index of "+key+" is "+index);
        }

    }
    public static int search(int[] elements, int key){

        for(int i=0; i<elements.length; i++)
            if(elements[i] == key)
                return i;

        return -1;
    }
}

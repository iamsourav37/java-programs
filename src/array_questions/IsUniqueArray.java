package array_questions;

import java.util.ArrayList;

public class IsUniqueArray {
    public static void main(String[] args) {
        int[] elements = {12, 21, 12, 23, 34, 45, 54, 34};
        int[] elements2 = {23, 12, 21, 13, 33, 77, 3};

        System.out.println(isUnique(elements));
        System.out.println(isUnique(elements2));



    }

    public static boolean isUnique(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j])
                    return false;
            }
        }
        return true;
    }
}

package forfun;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println(0%10);

        ArrayList<Integer> index;

        int[] intArray = {13, 15, 8, 20, 17, 9};
        index = maxProduct(intArray);
        System.out.println(index);

    }
    public static ArrayList<Integer> maxProduct(int[] intArray) {
        int maxProduct = 0;
        ArrayList<Integer> pairs = new ArrayList<>(2);
        int[] index = new int[2];
        for (int i = 0; i<intArray.length; i++) {
            for (int j = i+1; j<intArray.length; j++) {
                if (intArray[i]*intArray[j]>maxProduct) {
                    maxProduct = intArray[i]*intArray[j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        pairs.add(index[0]);
        pairs.add(index[1]);
        return pairs;
    }

}

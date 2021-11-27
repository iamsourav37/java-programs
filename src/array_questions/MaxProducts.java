package array_questions;

// find maximum products of two element from an array and return the index

public class MaxProducts {
    public static void main(String[] args) {
        int[] arrayElements = {7, 8, 4, 6, 9, 1};
        int[] maxIndex = maxProductsIndex(arrayElements);

        String index = ""+ maxIndex[0]+", "+ maxIndex[1];
        System.out.println(index);

    }

    public static int[] maxProductsIndex(int[] intArray){
        int[] results = new int[2];

        int maxProducts = 0;
        for(int i=0; i<intArray.length; i++){
            for(int j=i+1; j<intArray.length; j++){
                int product = intArray[i] * intArray[j];

                if(product>maxProducts){
                    maxProducts = product;
                    results[0] = i;
                    results[1] = j;
                }
            }
        }

        return results;
    }
}

package string.problems;


public class ExtractFromString {
    public static void main(String[] args) {

        String strArray = "88,8, 12, 23, 32, 21, 23, 34, 43, 32, 7, 10, 22, 11, 27, 78, 87, 79";
        String[] str = strArray.split(",");
        int[] elements = new int[str.length];

        int i=0;
        for(String s : str){
            int temp = Integer.parseInt(s.trim());
            elements[i] = temp;
            i++;
        }
        bubbleSort(elements);
        for(int value : elements){
            System.out.print(value+" ");
        }

    }
    public static void bubbleSort(int[] elements){
        for(int i=0; i<elements.length; i++){
            boolean flag = true;
            for(int j=0; j<elements.length-1-i; j++){

                if(elements[j]>elements[j+1]){
                    flag = false;
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
            if(flag)
                break;
        }
    }
}

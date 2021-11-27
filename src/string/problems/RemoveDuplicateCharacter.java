package string.problems;

import java.util.ArrayList;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {

//         discard the duplicate character
        String str = "programmingprogramming";
        ArrayList<Character> chArray = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(!chArray.contains(ch)){
                if(str.indexOf(ch, str.indexOf(ch)+1)>0){
                    chArray.add(ch);
                }
            }
        }
        String uniqueStr = "";
        for(int i=0; i<str.length(); i++){
            if(!chArray.contains(str.charAt(i))){
                uniqueStr = uniqueStr.concat(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(uniqueStr);

//        way 2 ,  discard the duplicate character
        String s1 = "programmingprogramming";
        StringBuilder sb1 = new StringBuilder();

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            int index = s1.indexOf(ch, i+1);
            if(index == -1){
                sb1.append(ch);
            }
        }
        System.out.println(sb1);

//        way 3,  uniqueness in string
        String s2 = "programmingprogramming";
        StringBuilder sb2 = new StringBuilder();

        for(int i=0; i<s2.length(); i++){
            if(!String.valueOf(sb2).contains(String.valueOf(s2.charAt(i)))){
                sb2.append(s2.charAt(i));
            }
        }
        System.out.println(sb2);


    }
}

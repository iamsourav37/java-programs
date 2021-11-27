import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("java");
        s.append(3);
        s.append("hello");
        s.insert(0, "Python");
        System.out.println(s);
        System.out.println(String.valueOf(s).startsWith("Pyt"));

        StringBuilder sb = new StringBuilder();
        sb.append("builder");
        sb.append(" java");
        sb.delete(sb.indexOf("java"),sb.length()-1);
        sb.reverse();
        System.out.println(sb);

        String st = "Java Programmer";
        StringBuilder sbb = new StringBuilder(st).reverse();
        st = String.valueOf(sbb);
        sbb = null;
        System.out.println(st);




//        String s = null;
//        try{
//
//            System.out.println(s.length());
//        }catch(Exception e){
//            System.out.println(e);
//            System.out.println("error");
//
//        }

    }
}

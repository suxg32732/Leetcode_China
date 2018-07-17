import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test {

    static class A {
        int a;
        String b;

        public A(int a, String b) {
            this.a = a;
            this.b = b;
        }

//        @Override
//        public boolean equals(Object obj) {
//            return true;
//        }

        @Override
        public String toString() {
            return a + " " + b;
        }
    }

    public static void main(String[] args) {
        String a = "aBC";
        String b = "aBC";
        System.out.println(a.contentEquals(b));

//        List<String> a = Arrays.asList("a","b","c");
//        String b= a.toString();
//        System.out.println(a);
//        System.out.println(b);
    }

}

package lab6;

import java.util.function.Function;

public class Class {
    private static int number = 1;

    public static class Inner {

        public int getNumber() {
            return number;
        }

        public void print(String s) {
            System.out.println(s);
        }
    }

}

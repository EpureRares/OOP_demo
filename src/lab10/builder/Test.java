package lab10.builder;

import lab10.v2.BlurCommand;
import lab10.v2.Editor;
import lab10.v2.Image;
import lab10.v2.ResizeCommand;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("large", "thin")
                .cheeseCount(1)
                .pepperoniCount(1)
                .build();

        System.out.println(pizza);
    }
}

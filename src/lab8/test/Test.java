package lab8.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test {
    private final Calculator calculator = new Calculator();

    @BeforeEach
    public void setup() {
        calculator.setMax(0);
    }

    @AfterEach
    public void setBool() {
        if (Calculator.testFailed) {
            Calculator.testFailed = false;
        }
    }

    @org.junit.jupiter.api.Test
    public void test0() {
        assertEquals(4, Calculator.findMax(new int[]{1,3,4,2}));

        if (Calculator.getMax() != 4) {
            Calculator.testFailed = true;
        }
        assertNotEquals(0, Calculator.findMax(new int[]{-12,-1,-3,-4,-2}));

        if (Calculator.getMax() == 0) {
            Calculator.testFailed = true;
        }
    }

    @org.junit.jupiter.api.Test
    public void test1() {
        assertEquals(-1, Calculator.findMax(new int[]{-1,-3,-4,-5}));

        if (Calculator.getMax() != -1) {
            Calculator.testFailed = true;
        }
    }
}

package lab8.test;

public class Calculator {
    private static int max;
    public static boolean testFailed = false;

    public static int findMax(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int getMax() {
        return max;
    }

    public void setMax(int max) {
        Calculator.max = max;
    }
}

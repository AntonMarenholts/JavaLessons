package lesson24;

public class MatUtil {
    public static int sumIntegers(int... integers){
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        return sum;

    }
}

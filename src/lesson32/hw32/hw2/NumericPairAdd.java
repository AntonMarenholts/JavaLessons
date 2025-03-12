package lesson32.hw32.hw2;

public class NumericPairAdd {
    public static void main(String[] args) {

        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.6);
        System.out.println(doublePair.sum());
    }
}

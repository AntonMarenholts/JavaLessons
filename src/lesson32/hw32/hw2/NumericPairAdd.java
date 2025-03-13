package lesson32.hw32.hw2;

public class NumericPairAdd {
    public static void main(String[] args) {

        NumericPair<Integer,Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());

        NumericPair<Double, Double> doublePair = new NumericPair<>(5.5, 4.6);
        System.out.println(doublePair.sum());


        NumericPair<Integer, Double> doublePar2 = new NumericPair<>(4, 4.5);
        System.out.println(doublePar2.sum());
    }


}

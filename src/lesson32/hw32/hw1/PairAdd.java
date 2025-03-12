package lesson32.hw32.hw1;

public class PairAdd {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        }
    }


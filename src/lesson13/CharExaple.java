package lesson13;

public class CharExaple {
    public static void main(String[] args) {

        char a = 'A';

        char letter = 'A';
        letter++;
        System.out.println("Letter = " + letter);

        System.out.println("\n=====================\n");

        char digit = 48;
        digit += 5;

        System.out.println(digit);

        digit = (char) (digit + 3);
        System.out.println(digit);
    }
}

package Lesson12;

public class OverFlow {
    public static void main(String[] args) {
        byte byteVar = 127;
        System.out.println(byteVar);

        byteVar++;
        System.out.println(byteVar);

        byteVar--;
        System.out.println(byteVar);
    }
}

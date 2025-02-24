package Lesson12;

public class incrementExample {
    public static void main(String[] args) {

        int x = 5;
        x = x + 10;

        x++;
        x--;
        System.out.println(x);

        int var = 100;
        System.out.println("var = " + var);

        int var1 = 100;
        System.out.println("var1 = " + var1++);

        int var2 = 500;
        System.out.println("var2 = " + ++var2);
    }
}

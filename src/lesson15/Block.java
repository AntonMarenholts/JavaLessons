package lesson15;

public class Block {
    public static void main(String[] args) {

        int x = 10;

        // анонимный блок
        {
            int y = 5;
            x = x + y;
            System.out.println(x);
        }
        int y = 5;


    }
}

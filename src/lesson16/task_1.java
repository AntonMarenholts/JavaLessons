package lesson16;

import java.util.Random;

public class task_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int [] num = new int[10];
        int i = 0;
        System.out.print("[");
        while (i < num.length) {
            num[i] = random.nextInt(101);
            System.out.print(num[i] + ", ");
            i++;
        }
        System.out.println("]");
    }
}

package lesson15;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5) + 1; //генерация числа от 1 до 5
        switch (note) {
            case 5:
                money += 20;
                break;
            case 4:
                money += 10;
                break;
            case 2:
                money -= 20;
                break;
            case 1:
                money = 0;
        }
        System.out.println("Ребёнок получил оценку : " + note);
        System.out.println("У ребёнка сейчас денег : " + money);
    }
}

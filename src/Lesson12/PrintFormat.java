package Lesson12;

public class PrintFormat {
    public static void main(String[] args) {

        double result = 20.0 / 7;
        int age = 25;
        String name = "Алиса";
        System.out.println("Name:" + name + ", Age:" + age + ",score: " + result);

        System.out.printf("Name: %s, Age: %d, score: %f", name, age, result);



    }
}

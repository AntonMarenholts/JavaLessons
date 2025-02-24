package lesson13;

public class HomeWork_2 {
    public static void main(String[] args) {

        //Создайте строки:
        //"Java"
        //"is"
        //"a"
        //"powerful"
        //"language"
        //Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
        //Выведите на экран получившуюся строку и её длину.

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String offer = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Result: " + offer);
        System.out.println("Длинна: " + offer.length());

        String offer1 = String.join(" ",str1, str2, str3, str4, str5);
        System.out.println("Результат: " + offer1);
        System.out.println("Длинна: " + offer1.length());

        String offer2 = str1.concat(" ").concat(str2).concat(" ").concat(str3).concat(" ").concat(str4).concat(" ").concat(str5).concat(" ");
        System.out.println("Result: " + offer2);
        System.out.println("Длинна: " + offer2.length());

        String offer3 = String.format("%s %s %s %s %s", str1,str2,str3,str4,str5);
        System.out.println("Result: " + offer3);
        System.out.println("Длинна: " + offer3.length());

    }
}

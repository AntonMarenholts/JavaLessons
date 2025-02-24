package lesson13;

public class StringExample {
    public static void main(String[] args) {

        String greeting = "Hello Word!";
        System.out.println(greeting);

        int length = greeting.length();
        System.out.println(length);

        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());

        System.out.println("\n=====================\n");

        String str1 = "One";
        String str2 = " - ";
        String str3 = "hello";

        String concatStr = str1+str2+str3;
        System.out.println(concatStr);

        System.out.println(1 + 3 + ":" + 2 + 3);

        String concatStr2 = str1.concat(str2);
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat("!!!");
        System.out.println(concatStr3);

        String concatStr5 = String.join(" ", "Hello", "Word", "Test");
        System.out.println(concatStr5);

        System.out.println("\n==============================\n");

        int a = 1;
        int b = 2;
        String str = "Сумма a + b = " + (a + b);
        System.out.println("str" + str);

        String digits = "0123456789";
        System.out.println(digits.length());

        char symbol = digits.charAt(9);
        System.out.println(symbol);

        String subString2 = digits.substring(2,7);
        System.out.println(subString2);

        System.out.println("\n==============================\n");

        String string = "One World One";
        String replStr = string.replace("One","www");
        System.out.println(replStr);

        replStr = string.replaceFirst("One","www");
        System.out.println(replStr);








    }
}

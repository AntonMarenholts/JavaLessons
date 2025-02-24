package lesson14;

import java.util.Locale;
import java.util.Scanner;

public class ScanerLocal {
    public static void main(String[] args) {

        String data = "3,14 42,7";
        Scanner sc = new Scanner(data);

        sc.useLocale(Locale.GERMANY);
        System.out.println(data);

        String text = "42,Java,3.14,Hello";
        Scanner scanner = new Scanner(text);
        scanner.useLocale(Locale.US);
        //   scanner.useDelimiter("[;|]");
        scanner.useDelimiter("\\s*,\\s*");

        System.out.println(scanner.nextInt());
        String java = scanner.next();
        System.out.println(java);
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());








    }
}

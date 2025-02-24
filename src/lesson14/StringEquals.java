package lesson14;

public class StringEquals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        boolean b1 = str1 == str2;
        System.out.println(b1);
        System.out.println(str1 == str4);

        b1 = str1 == str4;
        System.out.println(b1);

        boolean b2 = str1.equals(str4);
        System.out.println(b2);





    }
}

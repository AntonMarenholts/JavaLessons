package lesson14;

public class Boolean {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;
        System.out.println(bol1);

        int x = 10;
        int y = 5;

        boolean b1 = x == y;
        System.out.printf("%s == %s -> %s\n",x,y,b1);

        b1 = x != y;
        System.out.printf("%s != %s -> %s\n",x,y,b1);

        b1 = x > y;
        System.out.printf("%s > %s -> %s\n",x,y,b1);

        b1 = x < y;
        System.out.printf("%s < %s -> %s\n",x,y,b1);

        b1 = x <= y;
        System.out.printf("%s <= %s -> %s\n",x,y,b1);

        String str = "Java is a best";
        boolean contains = str.contains("Java");
        System.out.println(contains);

        boolean startWith = str.startsWith("Ja");
        System.out.println(startWith);
        System.out.println("str.startsWith(\"ava\"):" + str.startsWith("ava"));

        boolean endsWith = str.endsWith(("best"));
        System.out.println(endsWith);

        System.out.println("\n============================\n");

        boolean b2 = !false;
        System.out.println(b2);

        b2 = true & true;
        System.out.println(b2);

        int input = 150;
        b2 = input >= 0 & input <= 100;
        System.out.println(b2);

        b2 = true | false;
        System.out.println(b2);

        b2 = true && true;
        System.out.println(b2);

        System.out.println("\n======================\n");

        int a = 10;
        int b = 2;
        boolean bol = a/b > 2;
        System.out.println(bol);

        int a1 = 10;
        int b3 = 0;
        boolean bol3 = (b3 != 0) && (a1/b3 > 2);
        System.out.println(bol3);

        b = 0;
        bol = true || (a/b > 2);
        System.out.println(bol);





    }
}

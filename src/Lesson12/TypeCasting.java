package Lesson12;

public class TypeCasting {
    public static void main(String[] args) {

        byte byteVal = 123;
        int intVal;
        intVal = byteVal;
        System.out.println("intVal = " + intVal);

        double doubleVal = intVal;
        System.out.println("doubleVal = " + doubleVal);

        System.out.println("\n__________________________\n");

        double doubleVal2 = 42.9;
        int int1 = (int) doubleVal2;

        System.out.println("doubleVal2 = " + doubleVal2);
        System.out.println("int1 = " + int1);

        int x = 20;
        int y = 7;
        double result;
        result = x / y;
        System.out.println(result);

        result = x / 7.0;
        System.out.println("result= " + result);


        result = x / y;
        System.out.println("result= " + result);

        result = (double) x / y;
        System.out.println("result= " + result);

        int varC = 25 / (2 % 5) * 3;
        System.out.println(varC);



    }
}

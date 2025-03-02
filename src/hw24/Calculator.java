package hw24;

import java.util.Scanner;

public class Calculator {


    public static double addition(double a, double b){
        return a + b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        if (b == 0) return 0;
        return a / b;
    }
}

package lesson25;

    // В Java константа переменная,изменить которую не может НИ ОДИН объект класса в котором он находится.
    // Такая переменная создаётся и инициализируется один раз для всех экземпляров класса.
    // В Java константой считается НЕ та переменная,которую нельзя изменить в рамках одного объекта

    // static - делает переменную единственную для всех экземпляров класса (единое значение)
    // final - делает её не изменяемой

public class ConstantDemo {

    public static final double PI = 3.141519; // Константа

    //не является константой , т.к. состояние объекта (значение в массиве) можно изменить
    public static final int[] ints = new int[5];



    //не константа, т.к. значение в массиве можно изменить
    public static final String[] colors = {"red", "biue", "green"};

    //константа,которую НЕ могу изменить
    public static final String MY_COUNTRY = "Germany";

    public ConstantDemo(){
        colors[0] = "wihte";
        // MY_COUNTRY = "USA"; // не могу изменить
    }


    public static double doublePiSqrt(){
        double result = 2 * PI * PI;
        return result;
    }

}

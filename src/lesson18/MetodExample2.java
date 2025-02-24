package lesson18;

public class MetodExample2 {
    public static void main(String[] args) {

        int temp = 55;
        changeMe(temp);
        System.out.println(temp); //55

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        printArray(numbers);
        changeMe(numbers);
        printArray(numbers);

        int[] link2 = numbers;
        link2[2] = -100000;

        System.out.print("numbers: ");
        printArray(numbers);
        System.out.print("link2: ");
        printArray(link2);

        //null - специальное значение указывающее, что ссылка не ссылается на объект - отсутствие значения в переменной
        // numbers[0] = 10; //Ошибка возникаетво время работы программы NullPointerException
        //нельзя взять 0-й элементу "ничего"
        //System.out.println(numbers.length); // тоже NPE - нельзя узнать длинну "ничего" (null)

        link2[9] = 0;
        printArray(link2);

        numbers = new int[]{10,20,30};
        System.out.print("numbers: ");
        printArray(numbers);

        System.out.println("\n========================\n");

        String hello = "Hello";
        changeMe(hello);
        System.out.println("hello main: " + hello);

        String str2 = hello.toUpperCase();
        System.out.println(str2);




    }//MetodArea

    public static void changeMe(String str){
        str = str + "!!!";
        System.out.println("str metod: " + str);
    }

    public static void changeMe(int[] array){
        array[0] = 1000;
        array[3] = -23;

    }

    public static void changeMe(int x){
        x = 100;

    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

}//End

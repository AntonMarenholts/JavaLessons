package lesson18;

public class HomeWork1 {
    public static void main(String[] args) {

        //Написать метод со следующим функционалом:
        //На вход метод принимает массив целых чисел и число - длину нового массива.
        // Метод должен создать и распечатать массив заданной в параметрах длинны.
        // В начало массива должны быть скопированы элементы из входящего массива:
        //{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
        //{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
        //Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода

        int[] array = {2, 3, 6, 9, 112, 13, 124};
        int number = 3;

        printArray(array);
        arrayOfNumberAndNumber(array,number);
    }//metodArea
    public static void arrayOfNumberAndNumber(int[] array, int number){
        System.out.print("[");
        for (int i = 0;i < number; i++ ){
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
        for (int i = array.length - 1;i <= 0; i++ ){
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
        System.out.print("]");
    }
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }


}//end

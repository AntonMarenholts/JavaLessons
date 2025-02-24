package lesson17;

public class HomeWork_2 {
    public static void main(String[] args) {
        //Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
        //{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
        //Перегрузить метод, если в него приходит массив + индекс, то часть массива слева до
        // этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
        //{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

        int[] arr = {1, 4, 3, 6, 7};
        printRevers(arr);

        printIndex(arr,2);

    }
    public static void printIndex(int[] arr, int index){
        for (int i = 0;i < index; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= index; i--){
            System.out.print(arr[i] + " ");
        }

    }


    public static void printRevers(int[] arr) {
        for (int i = arr.length - 1;i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

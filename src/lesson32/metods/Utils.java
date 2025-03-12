package lesson32.metods;

import lesson31.lists.MyList;

public class Utils {

    // Поменять местами два элемента массива с любым ссылочным типом данных
    public static <T> void swap(T[] array, int idx1,int idx2){
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    // Метод, который возвращает первый элемент в списке

}

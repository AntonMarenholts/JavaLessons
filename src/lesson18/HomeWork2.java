package lesson18;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        //Написать метод, принимающий на вход массив строк.
        // Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
        String[] strings = {"Клавдий","Афанасий","Печкин","Вася"};
        String[] result = find(strings);
        System.out.println(Arrays.toString(result));
    }//metodArea
    public static String[] find(String[] strings){
        if (strings == null || strings.length == 0){
            return new String[0];
        }
        String shortest = strings[0];
        String langest = strings[0];
        for (String str : strings){
            if (str.length() < shortest.length()){
                shortest = str;
            }
            if (str.length() > langest.length()){
                langest = str;
            }
        }
        return new String[] {shortest,langest};

    }



}//end

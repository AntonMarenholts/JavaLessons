package Lesson12;

public class HomeWork2 {
    public static void main(String[] args) {

        //Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).
        //
        //Вычислите среднюю температуру за неделю и выведите ее на печать.
        //P.S. - правильно выберите типы данных

        int montag = 3;
        int dinstag = -3;
        int mitwoch = -1;
        int donestag = 7;
        int freitag = 5;
        int samstag = 2;
        int sonnestag = -1;
        double week = (montag+dinstag+mitwoch+donestag+freitag+samstag+sonnestag) / 7.0;
        System.out.println("Средняя температура за неделю : " + week);
    }
}

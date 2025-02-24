package lesson18;

public class MetodReturn {
    public static void main(String[] args) {

        //Возвращаемое значение - это результат,который отправляет обратно вызывающему его (метод) коду как результат своей работы.
        //Это способ передать результат вычеслений метода в другие части программы

        //int sum = 10 + 5;
        calculateSum(10,5);
        int sum = calculateSum(30,44);

        powTwo(2);

        test(5);
        test(10);
        test(-3);




    }//metodArea

    //Написать метод,который печатает числа от 0 до х
    public static void test(int x){

        // НЕ печатать числа, если х = 3;
        if (x == 3){
            // Как-то прервать работу метода
            return;//прекращает работу метода.В Void методе прекратить работу
        }

        //печатает числа от 0 до х
        for (int i = 0;i < x; i++){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    //Написать метод,возвращающий 2 в степени х. х метод получает в качестве параметра.
    public static int powTwo(int x){
        // 2 ^ x
        // 2 ^ 3 = 2 * 2 * 2 = 8

        boolean isPositiv = x >= 0;
        //что если Х отрицательный - отбросить знак числа


        int result = 1;
        // x = 2;
        for (int i = 1;i <= x;i++){
            result = result * 2;

        }
        return result;



    }

    public static int calculateSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result; //return - оператор,заканчивающий работу метода и возвращающий значение
    }



}//end

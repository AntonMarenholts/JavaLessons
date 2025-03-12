package lesson31.lists;

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> integerMyList = new MagicArrayList<>();

        integerMyList.add(10);
        System.out.println(integerMyList);

        integerMyList.addAll(120, 1000, -100, -200);
        System.out.println(integerMyList);







    }
}

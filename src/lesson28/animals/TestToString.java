package lesson28.animals;

public class TestToString {
    private String tittle;

    public TestToString(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "test klass: " + tittle;
    }

    public static void main(String[] args) {
        TestToString test = new TestToString("test");

        /*У всех классов есть родитель Object
        -> у объекта любого класса есть метод toString(получен от Object)
        -> когда мы передаём ссылку на объект в место,где она должна быть преобразована
         в строку (sout или конкатенация String+ссылка)
        у объекта будет вызван метод .toString


         */
        System.out.println(test);

        String result = "Hello " + test;
        System.out.println(result);
    }
}

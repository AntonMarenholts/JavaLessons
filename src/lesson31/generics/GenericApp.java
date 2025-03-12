package lesson31.generics;

import lesson28.animals.Cat;

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hello");

        String value = box.getValue();
        System.out.println(value.toUpperCase());
        System.out.println(box.getValue().length());

        // Проверка типизации на уровне компиляции
        // box.setValue(1000);

        box.setValue("New valeu");
        System.out.println(box);

        System.out.println("\n=================\n");

        GenericBox<Cat> catBox = new GenericBox<>(new Cat());
        System.out.println(catBox.getValue());

        // Нельзя поместить другой тип данных
        // catBox.setValue("String");

        // Generic НЕ работают с примитивными типами
        // GenericBox<int> intBox = new GenericBox<>(5);

        // Классы обёртки, для хранения примитивов
        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);

        System.out.println(intBox);

        int sum = intBox.getValue() + intBox2.getValue();
        System.out.println(sum);

        // За счёт автоупаковки/распаковки я не беспокоюсь о необхождимости приведения типов
        int val = intBox.getValue();
        Integer integerVal = intBox.getValue();

    }
}

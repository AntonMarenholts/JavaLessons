package lesson31.generics;

// Мы создаём универсальный класс. И не указываем конкретный тип данных с которым он работает
// Мы хотим определить тип данных при создании каждого объекта

// Generic работают только с объектами, т.е. только со ссылочными типами данных
// Не работают с примитивными типами

public class GenericBox <T>{ // Символ заполнитель Т-type,E-element;K,V-key

    // <T> - означает,что вместо Т при создании объекта будет подставлен конкретный
    // тип данных
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}

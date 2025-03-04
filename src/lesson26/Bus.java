package lesson26;


// extends - наследование. Bus наследуется от Vehicle
// Smartfon is-a Vehicle -> НЕ верно. Применять наследование НЕЛЬЗЯ
// Bus is-a Vehicle -верно. Можно применить наследование.

public class Bus extends Vehicle{

    private int capacity;
    private int countPassengers;

//    public Bus(){
//        // Ключевое слово super - это обращение к родительскому классу
//        // super() - вызов конструктора родительского класса
//        super();
//    }


    public Bus(String model, int year, int capacity) {
        //нужно сначала создать объект родителя
        //если в потомке нет явноговызова конструктора родителя
        //то будет вызван пустой конструктор родителя
        super(model, year); // вызов родительского конструктора принисающего модель и год
        //вызов конструктора род. должен быть первой строкой кода
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassenger(){
        //Проверить есть ли свобоное место?
        // если есть - посадить - увеличить кол-во пассажиров в автобусе
        if (countPassengers < capacity){
            countPassengers++;
            // имею доступ в наследнике к полю родителя с модификатором protected
            System.out.println("Пассажир зашёл в автобус: " + model);
            return true;
        }
        //По сути и есть блок else. В эту строку я попаду,только если условие if выдаст fals.
        System.out.printf("В автобусе %s больше места нет. Сейчас %d пассажиров", model, countPassengers);
        return false;
    }

}

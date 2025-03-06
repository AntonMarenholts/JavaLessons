package hw27;


    /*

    Ассоциация - это связь,при которой один объект связан с другим объектом. Это наиболее общая форма связи

    Агрегация - это форма ассоциации, представляющая собой отношение " часть-целое",
    где часть может существовать независимо от целого

    Композиция - это более жёсткая форма агрегации(тоже отношение часть-целое),но где часть не может сущ. без целого
    Обычно часть создаётся вместе с целым. Если целое уничтожается, часть так же уничтожается. (жизненные циклы объекта)

    Ассоциации (в том числе и Агрегация,и Композиция) реализуется через создание ссылок в классе на другие объекты.
    Это значит,что класс содержит поля, которые ссылаются на объекты других классов.

    Ассоциация - это отношение между двуми классами,где один класс использует другой класс в качестве одного из полей

    Автобус содержит водителя. HAS-A. Агрегация. Водитель может существовать отдельно от автобуса

    Автобус содержит автопилот. HAS-A. Композиция. Автопилот является не отъемлимой частью автобуса
    Жёсткая / неразрывная связь. Часть создаётся вместе с целым.

    // Важные аспекты ассоциации.
       Направленность. Ассоциация может быть однонаправленная или двунаправленная.

       Кардинальность связи. Определяет,сколько объктов одного класса может быть ассоциированно с объектом
       One-to-one  (один к одному), One-to-Many(один ко многим) , Many-to-Many(многие к многим)

       1:1 -> Автобус и двигатель
       Каждый автобус может иметь ровно один двигатель.И на каждый двигатель приходится один автобус

       1:Many -> Автобус и список пассажиров. Один автобус может иметь множество пассажиров.
       Один пассажир не может быть во многих автобусах

       Many:Many -> Список автобусов и список пассажиров.
       Каждый автобус останавливается на множестве остановок.
       На каждой остановке может обслуживаться множество автобусов.



     */

public class Autobus {

    private static int counter = 1;

    //Уникальный идентификатор объекта
    private final int id;

    private BusDriver driver; // Агрегация (мягкая связь)
    private Autopilot autopilot; // Композиция

    private final int capacity;
    private int countPassenger;

    private final Passenger[] passengers;


    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.capacity = capacity;
        this.driver = driver;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Autobus: { id: ");
        sb.append(id).append("; capacity: ").append(capacity);
        sb.append("; ").append(driver.toString());
        sb.append("; ").append(autopilot.toString());
        sb.append("; passenger: ").append(countPassenger);
        sb.append(" }");

        return sb.toString();


//        return "Autobus{" +
//                "id=" + id +
//                ", driver=" + driver.toString() +
//                ", autopilot=" + autopilot.toString() +
//                ", capacity=" + capacity +
//                '}';
    }

    //Список пассажиров
    public void showListPassengers(){

        if (countPassenger == 0){
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassenger; i++){
            sb.append(passengers[i].toString());
            sb.append((i < countPassenger - 1) ? ", " : "]");

        }
        System.out.println(sb.toString());
    }

    //метод пасадки пассажиров
    public boolean takePassenger(Passenger passenger){
        if (passenger == null) return false;


        /*
        1. Надо проверить свободное место
        2. Надо проверить находится ли этот пассажир уже в автобусе
        3. Если есть место и пассажир ещё не в автобусе - садим на борт
          3.1 Добавляем его в список пассажиров
          3.2 Увеличиваем кол-во пассажиров
          3.3 Возвращаем true
        4. Иначе (3.3) - что-то пошло не так - выдаём сообщение об ошибке и возвращаем false

         */
        if (countPassenger < capacity){
            // Место есть
            // Надо проверить п.2
            if (isPassengerInBus(passenger) >= 0){
                //Метод вернул 0 или больше(т.е. валидный индекс), значит пассажир в автобусе
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n",
                        passenger.getId(), this.id);
                return false;
            }
            //Садим на борт пассажира
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир с id %d завершил посадку в автобусе с id %d\n",
                    passenger.getId(), this.id);
            return true;
        }
        // Свободного места нет
        System.out.printf("В автобусе с id %d свободных мест нет!\n",this.id);
        return false;
    }

    private int isPassengerInBus(Passenger passenger){
        for (int i = 0; i < countPassenger; i++){
            if (passengers[i].getId() == passenger.getId()){
                //id совпали - значит это один и тот же пассажир
                return i;
            }
        }

        // пассажира с таким id нет в массиве пассажиров
        return - 1;
    }

    public boolean dropPassenger(Passenger passenger) {
        /*
        1.Убедиться,что пассажир в автобусе
        2.Удалить его из массива ->
          2.1 Сдвинуть всех пассажиров справа от него
          2.2 Не забыть изменить кол-во пассажиров
          2.3 Вернуть true
         */
        if (passenger == null || countPassenger == 0) return false;

        int index = isPassengerInBus(passenger);

        if (index == -1) {
            // такого паасажира в автобусе нет
            System.out.printf("Пассажир с id %d в автобусе (%d) не найден!\n", passenger.getId(), this.id);
        }

        //Удаление пассажира из списка
        for (int i = index; i < countPassenger - 1; i++) {
            passengers[i] = passengers[i + 1];
            System.out.printf("Пассажир (%d) вышел из автобуса (%d) ", passenger.getId());
        }
        return false;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }
}

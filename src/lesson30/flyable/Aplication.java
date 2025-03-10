package lesson30.flyable;

public class Aplication {
    public static void main(String[] args) {

        Aeroplane aeroplane = new Aeroplane(50);
        Duck duck = new Duck();

        duck.fly();
        duck.swimm();

        System.out.println("\n===============\n");

        Flyable[] flyables = new Flyable[2];
        flyables[0] = duck;
        flyables[1] = aeroplane;

        for (int i=0; i < flyables.length; i++){
            Flyable flyable = flyables[i];
            flyable.fly();

            //ПРоверяем возможность приведения ссылки к типу интерфейса
            if (flyable instanceof Swimmable){
                System.out.println("Могу привести этот объект к Swimmable");
                Swimmable swimmable = (Swimmable) flyable;
                swimmable.swimm();
                System.out.println("======================\n");

            }
            //Проверяем возможность приведения ссылки к типу класса
           if (flyable instanceof Aeroplane) {
               System.out.println("Могу привести к классу Airplane");
               Aeroplane aeroplaneLink = (Aeroplane) flyable;
               System.out.println("вместимость: " + aeroplaneLink.capacity);
               aeroplaneLink.takePassenger();
               System.out.println("количество пассажиров: " + aeroplaneLink.amountPassenger);
           }
        }
    }
}

package lesson23;

public class Cat {
    private String name;
    private int age;
    private int weight;

    protected boolean isProtected;
    public boolean isDefault;

    public Cat(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Геттеры и сеттеры - это специальные публичные методы,дающие возможность получать или изменять значение поля

    //геттер для поля age
    public int getAge(){
        return age;
    }
    //геттер для поля name
    public String getName(){
        return name;
    }
    // сеттер для name
    public void setName(String name){
        if (name != null){
            this.name = name;
        }
    }


    //геттер для поля weight
    public int getWeight(){
        return weight;

    }
    // сеттер для поля weight
    public void setWeight(int weight){
        if (weight < 0){
            //если входящее не устраивает - я могу установить значение по умолчанию
            this.weight = 0;
            System.out.println("Текущий вес кота: " + this.weight);
            return;//работа метода прекращается. Дальнейшие проверки не проводятся
        }

        //В эту строку кода мы попадём с значением weight 0 или больше
        //если вес больше 50 кг - то делай блок кода
        if (!(weight > 50)){
            //код 1
            this.weight = weight;
        }
    }

    // сеттер для поля age ()
    public void setAge(int age){
        // 20 (20<0 || 2>30 -> false -> !false -> true
        //если возраст меньше 0 или больше 30, то делай код 1 ,иначе делай код 2.
        if (!(age < 0 || age > 30)){
            // если age подходит (изначальное условие выдаёт false)
            // которое мы инвертируем оператор ! в true
            this.age = age;
        }
    }


    public void sayMay(){
        System.out.println("Мяу" + name);
    }


    public String toString(){
        // System.out.printf("Сat: %s , age: %d, weight: %d", name,age,weight);
        String result = String.format("Сat: %s , age: %d, weight: %d", name, age, weight);
        return result;
    }
}

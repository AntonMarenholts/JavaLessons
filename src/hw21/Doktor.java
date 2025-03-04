package hw21;

public class Doktor {
    String name;
    String profession;
    int age;
    int work;

    public Doktor(String name, String profession, int age, int work){
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.work = work;
    }
    public void info() {
        System.out.printf("Меня зовут доктор %s, я по профессии %s, мне %d года и я работаю %d года",name, profession, age, work);
        System.out.println();
    }
    public void working(){
        System.out.println("Я люблю свою работу!");
    }
    public void lotWork(){
        System.out.println("Я устал.");
    }
}

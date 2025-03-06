package lesson28.hw28.vehicle;

public class Bicycle extends Vehicle{

    @Override
    public void startEngine(){
        System.out.println("У велосипеда нет двигателя! Просто могу поехать!");
    }
}

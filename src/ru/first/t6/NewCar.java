package ru.first.t6;

public class NewCar extends Car {
    public NewCar(String name) {
        super(name);
    }

    @Override
    public void showCar() {
        System.out.println("newCar");
    }
}

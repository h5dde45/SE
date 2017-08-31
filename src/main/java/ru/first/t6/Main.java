package ru.first.t6;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("");
        car.setName("123");
        Car car2 = new Car("");
        car2.setName("123");
        car=car2;

        System.out.println();
        System.out.println(car.hashCode());
        System.out.println(car.toString());
        System.out.println(car2.getClass());
        System.out.println(car2.hashCode());
        System.out.println(car2.toString());

    }
}

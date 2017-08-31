package ru.first.t29;

import ru.first.t6.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        arrayListExample();
        System.out.println("===============");
        linkedListExample();

    }

    public static void arrayListExample() {

        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("bmv");
        Car car2 = new Car("fiat");
        Car car3 = new Car("reno");
        Car car4 = new Car("reno");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(new Car("new"));

        System.out.println(cars.size());
        System.out.println(cars.contains(new Car("fiat")));
        System.out.println(cars.indexOf(car3));
        System.out.println(cars.get(4));
        System.out.println();


        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        cars.clear();
        System.out.println(cars.isEmpty());
//        System.out.println(cars.get(4));
    }

    public static void linkedListExample() {

        LinkedList<Car> cars = new LinkedList<>();

        Car car1 = new Car("bmv");
        Car car2 = new Car("fiat");
        Car car3 = new Car("reno");
        Car car4 = new Car("reno");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(new Car("new"));
        cars.addFirst(car2);

        Iterator<Car> iterator=cars.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

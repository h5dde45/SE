package ru.first.t27;

import ru.first.t6.Car;
import ru.first.t6.NewCar;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        hashSetExample();
        System.out.println("===============");
        treeSetExample();
        System.out.println("===============");
        linkedHashSetExample();
        System.out.println("================");
    }

    public static void hashSetExample() {

        Set<Car> cars = new HashSet<>();

        Car car1 = new Car("bmv");
        Car car2 = new Car("lada");
        Car car3 = new Car("reno");
        Car car4 = new Car("reno");
        Car car5 = new NewCar("reno");

        cars.add(car1);
        cars.add(car2);
        cars.add(car5);
        cars.add(car3);
        cars.add(car4);


        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            Car car =  iterator.next();
            System.out.println(car.getName());
            car.showCar();
        }

    }

    public static void treeSetExample() {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(21);
        treeSet.add(421);
        treeSet.add(251);
        treeSet.add(216);
        treeSet.add(621);
        treeSet.add(216);

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void linkedHashSetExample() {
        Set<Integer> treeSet = new LinkedHashSet<>();

        treeSet.add(21);
        treeSet.add(421);
        treeSet.add(251);
        treeSet.add(216);
        treeSet.add(621);
        treeSet.add(216);

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

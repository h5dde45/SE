package ru.first.t30;

import java.util.*;

public class Main {
    private static ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {

        Car car1 = new Car("dggh", 23);
        Car car2 = new Car("yh", 445);
        Car car3 = new Car("t5gfg", 756);
        Car car4 = new Car("hre", 3);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        System.out.println(cars.get(1).getName());
        Collections.sort(cars);
        print(cars);
        System.out.println(cars.get(1).getName());
        System.out.println("=============");
        Collections.sort(cars, new CarYearComparator());
        print(cars);
        System.out.println("==============");
        Collections.sort(cars,new CarNameComparator());
        print(cars);
        System.out.println("==============");

        TreeSet<Car> treeSet=new TreeSet<>();
        treeSet.add(car1);
        treeSet.add(car2);
        treeSet.add(car3);
        treeSet.add(car4);

        print(treeSet);
        System.out.println("==============3");

        TreeSet<Car> treeSet2=new TreeSet<>(new  CarYearComparator());
        treeSet2.add(car1);
        treeSet2.add(car2);
        treeSet2.add(car3);
        treeSet2.add(car4);

        print(treeSet2);
    }

    public static void print(Collection<Car> collection) {
        System.out.println();
        Iterator<Car> iterator = collection.iterator();

        while (iterator.hasNext()) {
            Car car=iterator.next();
            System.out.print(car.getName() + " = ");
            System.out.println(car.getYear());
        }
    }

}

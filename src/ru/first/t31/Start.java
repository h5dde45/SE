package ru.first.t31;

import ru.first.t6.Car;

import java.util.*;

public class Start {
    public static void main(String[] args) {

//        Queue<Car> cars=new ArrayBlockingQueue<Car>(5);
        Deque<Car> cars = new ArrayDeque<>();

        Car car1 = new Car("Ahgh");
        Car car2 = new Car("Mgbb");
        Car car3 = new Car("Ptg");
        Car car4 = new Car("Kdw");
        Car car5 = new Car("Ogtgd");
        Car car6 = new Car("Mtygg");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        System.out.println(cars.element());

        for (Car deque : cars) {
            System.out.println(deque.getName());
        }
        System.out.println(cars.remove());

        for (Car deque : cars) {
            System.out.println(deque.getName());
        }
//        cars.clear();
        System.out.println("===============");
        Queue lifo = Collections.asLifoQueue(cars);
        lifo.add(car1);
        lifo.add(car2);
        lifo.add(car3);
        for (Car deque : cars) {
            System.out.println(deque.getName());
        }
        System.out.println("===============");
        Stack<Car> stack = new Stack<>();
        stack.add(car1);
        stack.add(car2);
        stack.add(car3);
        for (Car car : stack) {
            System.out.println(car.getName());
        }
        stack.peek();
        stack.pop();
    }
}

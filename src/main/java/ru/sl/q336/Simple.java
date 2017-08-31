package ru.sl.q336;

import java.util.Arrays;

public class Simple {
    public static void main(String[] args) {
        Dog dog;
        dog=Dog.DOG_1;
        System.out.println(dog);
        dog=Dog.DOG_4;
        System.out.println(dog);

        switch (dog){
            case DOG_0:
                System.out.println("0");
                break;
            case DOG_1:
                System.out.println("1");
                break;
            case DOG_2:
                System.out.println("2");
                break;
            case DOG_3:
                System.out.println("3");
                break;
            case DOG_4:
                System.out.println("4");
                break;
            default:
                System.out.println("5");
        }

        Dog[]dogs=Dog.values();
        System.out.println(Arrays.toString(dogs));
        Dog d=Dog.valueOf("DOG_3");
        System.out.println(d);
        System.out.println(d.getClass().getSuperclass());

    }
}

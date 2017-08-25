package ru.sl.g40_g44;

class Animal {
    void doAnimal1(){}
    void doAnimal2(){}
}

public class Cat extends Animal{
    void doCat1(){}
    void doCat2(){}

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.doCat1();
        cat.doAnimal1();

        Animal catA=new Cat();// восходящее
        catA.doAnimal1();
//        catA.doCat1;

        int i=442;
        byte b= (byte) i;//нисходящее

    }

}

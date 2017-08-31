package ru.sl.q92;

public class CloneRunner {
    public static void main(String[] args) {
        Man man=new Man();
        System.out.println(man.getId());

        mutatation(man);
        System.out.println(man.getId());
    }
    private static void mutatation(Man man){
        try {
            man= (Man) man.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        man.setId(222);
        System.out.println(man.getId());
    }
}

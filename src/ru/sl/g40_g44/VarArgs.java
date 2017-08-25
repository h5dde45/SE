package ru.sl.g40_g44;

public class VarArgs {
    public static void main(String[] args) {
        fly(1,2,3);
        fly("asd",1,2,3,4,5);
        fly(new int[]{1,2,3,4});
        fly();
    }
    static void fly(int... ints){
        System.out.println(ints.length);
    }
    static void fly(String s,int... ints){
        System.out.println(ints.length);
    }

}

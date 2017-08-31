package ru.tk.oop.t5;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        K2 k2=new K2();
        k2.name="asd";

        if(Objects.equals(k2.getName(),"ttt")){
            getResult(k2.show1());
        }else{
            getResult(k2.show2());
        }

    }
    private static void getResult(String str){
        System.out.println(str);
    }
}

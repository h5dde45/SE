package ru.sl.g40_g44;

import java.io.IOException;

class SuperCl {
    protected void drive() {
    }

    public void swim() throws Exception {
    }

    public void swim2() throws IOException {
    }

    public void swim3() {
    }

    String getStr() {
        return "";
    }

    Number getNum() {
        return 1;
    }

    private void go() {
    }

    static void stat() {
        System.out.println("1");
    }
}

public class Ovveride extends SuperCl {

    public void drive() {
        System.out.println("===");
    }
//    void drive(){}
//   private void drive(){}


    @Override
    public void swim() throws IOException {
    }

//    @Override
//    public void swim() throws Throwable {
//        super.swim();
//    }


    @Override
    public void swim2() throws IOException {
    }

//    @Override
//    public void swim2() throws Exception {
//    }

    @Override
    public void swim3() {
    }
    //    @Override
//    public void swim3() throws Exception {
//    }

    @Override
    String getStr() {
        return "----";
    }
//    @Override
//    Integer getStr() {
//        return 2;
//    }

    @Override
    Double getNum() {
        return 1.;
    }

    public void go(){}//not override, hides

    static void stat() {
        System.out.println("1++++");
    }
}

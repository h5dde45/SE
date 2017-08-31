package ru.sl.q62_q69;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        System.out.println("**************************");
        outer.test2();
        System.out.println("**************************");
        Outer.Inner inner = new Outer().new Inner();
        inner.display();

    }
}

class Outer { //внешний класс
    int outerVar = 111;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //member inner class
    class Inner {//внутренний класс
        int innerVar = 99;
       final static int innerVar2 = 99;

        void display() {
            System.out.println("inner = " + outerVar);
        }
    }

    void test2() {
        for (int i = 0; i < 3; i++) {

            //local inner class
            class Inner2 {
                void display2() {
                    System.out.println("inner2 = " + outerVar);
                }
            }

            Inner2 inner2 = new Inner2();
            inner2.display2();
        }
    }

}

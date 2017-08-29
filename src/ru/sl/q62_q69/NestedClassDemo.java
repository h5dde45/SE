package ru.sl.q62_q69;

public class NestedClassDemo {
    public static void main(String[] args) {
        OuterNested.Nested.displayStat();
        System.out.println("***************");
        OuterNested.Nested nested=new OuterNested.Nested();
        nested.display();
    }
}

class OuterNested {
    int outerVar = 99;
    static int outerStatVar = 3333;

    static class Nested {
        void display() {
            OuterNested outerNested = new OuterNested();
            System.out.println(outerNested.outerVar);
            System.out.println(outerStatVar);
        }

        static void displayStat() {
            System.out.println("Method displaystat");
        }
    }

}

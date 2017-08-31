package ru.sl.g40_g44;

class Parent {
    void test(){
        System.out.println("Parent");
    }
}

public class Child extends Parent {
    @Override
    void test() {
        System.out.println("child");
    }

    void testSupp(){
        super.test();
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.test();

        Parent parent=new Parent();
        parent.test();

        parent=child;
        parent.test();

        child.testSupp();
//        parent.testSupp();
    }

}

package ru.sl.q163;

public class ExampleDemo {
    public static void main(String[] args) {

        Exam<Double> e1=new Exam<>("Math",75.95);
        Exam<Double> e2=new Exam<>("Math",75.75);

        System.out.println(e1.equalsMark(e2));

        Exam<Integer> i1=new Exam<>("Math",76);
        System.out.println(i1.equalsMark2(e2));
    }
}

class Exam<T extends Number> {
    private String name;
    private T mark;

    public Exam(String name, T mark) {
        this.name = name;
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }

    private int roundMark() {
        return Math.round(mark.floatValue());
    }

    public boolean equalsMark(Exam<T> exam) {
        return roundMark() == exam.roundMark();
    }


    public boolean equalsMark2(Exam<?> e2) {
        return roundMark() == e2.roundMark();
    }
}

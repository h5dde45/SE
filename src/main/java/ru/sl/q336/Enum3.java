package ru.sl.q336;

enum Day implements Runnable {
    DAY_7(7, "ok"),
    DAY_1(1, "hard"),
    DAY_2(2, "w"),
    DAY_3(3, "w"),
    DAY_4(4, "w"),
    DAY_5(5, "short"),
    DAY_6(6, "rest");

    int order;
    String descr;

    Day(int order, String descr) {
        this.order = order;
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Day{" +
                "order=" + order +
                ", descr='" + descr + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println(name() + " = " + toString());
    }
}

public class Enum3 {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            day.run();
        }
    }
}

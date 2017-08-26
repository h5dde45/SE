package ru.sl.q336;

enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Enum2 {
    public static void main(String[] args) {
        DayOfWeek d1=DayOfWeek.MONDAY;
        DayOfWeek d2=DayOfWeek.FRIDAY;
        DayOfWeek d3=DayOfWeek.MONDAY;

        for (DayOfWeek day:DayOfWeek.values()){
            System.out.println(day+" = "+day.ordinal());
        }
        System.out.println("==============");

        System.out.println(d1.compareTo(d2));
        System.out.println(d1.compareTo(d3));
        System.out.println("==============");

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d1==d3);



    }

}

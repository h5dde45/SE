package ru.first.t30;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return ((Integer)o1.getYear()).compareTo((Integer)o2.getYear());
    }
}

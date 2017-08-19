package ru.first.t30;

public class Car implements Comparable<Car>{

    private String name;
    private int year;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        return name != null ? name.equals(car.name) : car.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }


    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.getName());
    }
}

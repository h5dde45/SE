package ru.tk.oop.t2.p1;

public class NewClass implements Cloneable{
    String name;

    public NewClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewClass)) return false;

        NewClass newClass = (NewClass) o;

        return name != null ? name.equals(newClass.name) : newClass.name == null;
    }

    @Override
    protected NewClass clone() throws CloneNotSupportedException {
        return (NewClass) super.clone();
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "NewClass{" +
                "name='" + name + '\'' +
                '}';
    }
}

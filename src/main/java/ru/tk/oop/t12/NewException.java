package ru.tk.oop.t12;

public class NewException extends Exception {
    private int num;

    public NewException(String message,  int num) {
        super(message);
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

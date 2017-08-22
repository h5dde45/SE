package ru.tk.oop.t12;

public class Factorial {

    public static int f(int x) throws NewException {
        if (x < 0) throw new NewException(">0", x);
        int result = 1;
        for (; x > 0; result *= x--) ;
        return result;

    }
}

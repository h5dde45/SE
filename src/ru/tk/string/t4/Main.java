package ru.tk.string.t4;

public class Main {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("This is ");
        StringBuffer buffer2 = new StringBuffer("This is string for delete ");

        buffer.append("new string..");
        System.out.println(buffer);

        buffer2.delete(19,buffer2.length());
        System.out.println(buffer2);

        buffer2.insert(5," ************* ");
        System.out.println(buffer2);

        buffer2.replace(8,13,"++++");
        System.out.println(buffer2);
        System.out.println(buffer2.reverse());
    }
}

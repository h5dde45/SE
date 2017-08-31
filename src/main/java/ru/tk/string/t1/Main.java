package ru.tk.string.t1;

public class Main {
    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = new String(new char[]{'d', 'f'});

        System.out.println(s2.length());
        System.out.println(s2.concat(s1));

        String s3 = s1 + s2;
        System.out.println(s3);

        System.out.println(String.join("<=>", s3, s1, s2));
        System.out.println(s3.charAt(s3.length() - 2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == "asd");
        System.out.println(s1 == new String("asd"));
        System.out.println(s1.equals("asd"));
        System.out.println(s1.equals(new String("asd")));

        System.out.println("========================");
        System.out.println("========================");

        String s4 = "Ab";
        String s5 = "AC";
        System.out.println(s4.compareTo(s5));
        System.out.println(s4.compareToIgnoreCase(s5));
        System.out.println((int) 'C');
        System.out.println((int) 'c');
        System.out.println(s3.replace("d", "***"));
        String s6 = "  fr rtg   ";
        System.out.println(s6.trim());

    }
}

package ru.sl.q171_q175;

public class StringDemo {
    public static void main(String[] args) {
        String s1="   java   ";
        System.out.println(s1);
        System.out.println(s1.trim());
        System.out.println(s1);
        System.out.println("///////////////////////////");

        String s2="New.. java???";
        System.out.println(s2);
        System.out.println(s2.replace('.','*'));
        System.out.println(s2);
        System.out.println(s2.charAt(1));
        System.out.println("///////////////////////////");

        StringBuilder sb=new StringBuilder(s2);
        System.out.println(sb);
        sb.setCharAt(2,'D');
        System.out.println(sb);
        System.out.println("----------------==================");

        String s3="next";
        String s4=new String("next");
        String s5="next";
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));
        s4=s4.intern();
        System.out.println(s3==s4);

        String s="123 sdf rtyu";
        System.out.println(s.substring(5));
        System.out.println(s.substring(5,11));

    }
}

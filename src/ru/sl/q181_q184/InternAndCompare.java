package ru.sl.q181_q184;

public class InternAndCompare {
    public static void main(String[] args) {
        String sPool="java";
        String str=new String("java");
        StringBuffer sbf=new StringBuffer("java");
        StringBuilder sbd=new StringBuilder("java");

        System.out.println(sPool==str);
        str=str.intern();
        System.out.println(sPool==str);
        System.out.println("===============");
        System.out.println(str.equals(sbf));
        System.out.println(str.equals(sbf.toString()));
        System.out.println(sbf.equals(sbd));
        System.out.println(sbf.toString().equals(sbd.toString()));
        System.out.println(str.contentEquals(sbf));


    }
}

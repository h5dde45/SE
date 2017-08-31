package ru.sl.q181_q184;

public class SbfSbd {
    public static void main(String[] args) {

        StringBuffer sbf=new StringBuffer();
        System.out.println(sbf.length());
        System.out.println(sbf.capacity());
        sbf=new StringBuffer(20);
        sbf.append("java");
        System.out.println(sbf);
        System.out.println(sbf.length());
        System.out.println(sbf.capacity());
        sbf.append(" is a programming language");
        System.out.println(sbf);
        System.out.println(sbf.length());
        System.out.println(sbf.capacity());
        System.out.println("---------------");

        StringBuffer sbf2=new StringBuffer(48);
        sbf2.append("java is a programming language");
        System.out.println(sbf2);

        System.out.println(sbf.equals(sbf2));
        System.out.println(sbf.hashCode()==sbf2.hashCode());
        System.out.println(sbf.toString().contentEquals(sbf2));
        System.out.println("==============");
        System.out.println();

        StringBuffer a=new StringBuffer("abc");
        StringBuffer b=a.append("de");
        b=b.append("f").append("g");
        System.out.println(a);
        System.out.println(b);



    }
}

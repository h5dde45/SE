package ru.sl.q24q25;

public class Main {
    public static void main(String[] args) {
        String s="100";

        try {
            int value1=Integer.parseInt(s);
            int value2=Integer.valueOf(s);
            int value3=new Integer(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        int i=222;

        String s1=Integer.toString(i);
        String s2=String.valueOf(i);
        String s3=i+"";

        Integer integer=111;
        int i1=integer;
        Float  aFloat=5.f;
        Float  aFloat2= (float)5;
    }
}

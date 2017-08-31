package ru.sl.q164_q169;

public class RefString {
    public static void main(String[] args) {
        String s=new String("asd qwe");
        System.out.println(s);
        changeString(s);
        System.out.println(s);
        System.out.println("=======");
        StringBuffer sb=new StringBuffer("asd qwe");
        System.out.println(sb);
        changeStringBuff(sb);
        System.out.println(sb);

    }

    private static void changeString(String s) {
        s=s.concat("==")+"**--";
        System.out.println(s);
    }

    private static void changeStringBuff(StringBuffer stringBuffer) {
        stringBuffer.append("...");
        System.out.println(stringBuffer);
    }
}

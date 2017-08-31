package ru.sl.q170;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        String s="Cat see mouse";
        System.out.println("Original:  "+s);

        StringBuffer sbf=new StringBuffer(s);
        System.out.println("1.  "+sbf.reverse());

        char[]chars=s.toCharArray();
        System.out.print("2.  ");
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();

        StringBuilder builder=new StringBuilder();
        System.out.print("3.  ");
        for (int i = chars.length-1; i >=0 ; i--) {
            builder.append(chars[i]);
        }
        System.out.println(builder);

        System.out.println("4.  "+ recursiveReverse(s));
        System.out.println("5.  "+ reverseByStack(s));


    }

    private static String reverseByStack(String s) {
        Stack<Character> stack=new Stack<>();
        for(Character character:s.toCharArray()){
            stack.add(character);
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (stack.size()>0){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    private static String recursiveReverse(String s) {
        if(s==null||s.length()<=1){
            return s;
        }
        return recursiveReverse(s.substring(1))+s.charAt(0);
    }
}

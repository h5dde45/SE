package ru.sl.q35_q39;

import java.awt.*;

public class Overload_1 {

    public void doSmth(){}
    void doSmth(int i){}
    public void doSmth(String s){}
    public void doSmth(String s,int i){}
    public void doSmth(int i,String s){}
    public void doSmth(String s,int i,double v) throws Exception{}
    protected void doSmth(Object o){}
    static int doSmth(List list){return 2;}

    public static void main(String[] args) {

    }

}

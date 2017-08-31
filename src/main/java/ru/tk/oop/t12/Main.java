package ru.tk.oop.t12;

public class Main {
    public static void main(String[] args) {
        double[] doubles= new double[0];
        try {
            doubles = new double[11];
            doubles[1]=22;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        System.out.println("==============");

        try {
            int i=9;
            if (i<23){
                throw new Exception("9<23");
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage()+"========");
        }
        System.out.println("++++++++");

        try {
            System.out.println(f(3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("++++++++");

        try {
            System.out.println(Factorial.f(-3));
        } catch (NewException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNum());
        }
        System.out.println("++++++++");



    }
    private static int f(int x) throws Exception {
        if(x<0) throw new Exception(">0");
        int result=1;
        for(;x >0;result*=x--);
        return result;

    }
}

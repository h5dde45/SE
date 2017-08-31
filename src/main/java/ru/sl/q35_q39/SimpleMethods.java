package ru.sl.q35_q39;

public class SimpleMethods {
    public static void main(String[] args) {
        System.out.println("------");
        SimpleMethods simpleMethods=new SimpleMethods();
        simpleMethods.getString();
        simpleMethods.getStringWithPar("asd");

        System.out.println(multiply(2,4)+", "+
        SimpleMethods.multiply(3,3));

    }

    private void getString(){
        System.out.println("getString");
    }
    private void getStringWithPar(String s){
        System.out.println("getString "+s);
    }

    static int multiply(int x, int y){
        return x*y;
    }
}

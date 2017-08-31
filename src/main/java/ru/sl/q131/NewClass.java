package ru.sl.q131;

public class NewClass {

    public static void main(String[] args) {
NewClass.print();

    }

    public static void print(){

        for (int  i= 0;i  <=1000 ; i++) {
            int x=0;
            int j=i;
            do {
                x+=j%10;
                j/=10;
            }while (j>=1);


            if(i%3==0 & i%5!=0 & x<10){
                System.out.println(i);
            }
        }

    }
}

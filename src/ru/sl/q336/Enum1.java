package ru.sl.q336;

enum Dog1 {
    DOG_1(33),
    DOG_2(11),
    DOG_3(55),
    DOG_4;

    private int weigth;

    Dog1() {
        weigth = 77;
    }

    Dog1(int weigth) {
        this.weigth = weigth;
    }

    public int getWeigth() {
        return weigth;
    }
}

public class Enum1 {
    public static void main(String[] args) {
        Dog1 dog1;

        System.out.println(Dog1.DOG_2.getWeigth());
        for(Dog1 dog11:Dog1.values()){
            System.out.println(dog11+" = "+ dog11.getWeigth());
        }
    }
}

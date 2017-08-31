package ru.sl.q336;

enum Days{
    DAY_7(7, "okay"){
        @Override
        public String shortName() {
            return "ok";
        }
    },
    DAY_1(1, "hard"){
        @Override
        public String shortName() {
            return "ha";
        }
    },
    DAY_2(2, "w"){
        @Override
        public String shortName() {
            return "w";
        }
    },
    DAY_3(3, "w"){
        @Override
        public String shortName() {
            return "w";
        }
    },
    DAY_4(4, "w"){
        @Override
        public String shortName() {
            return "w";
        }
    },
    DAY_5(5, "short"){
        @Override
        public String shortName() {
            return "sh";
        }
    },
    DAY_6(6, "rest"){
        @Override
        public String shortName() {
            return "re";
        }
    };

    public abstract String shortName();

    int order;
    String descr;

    Days(int order, String descr) {
        this.order = order;
        this.descr = descr;
    }

}

public class Enum4 {
    public static void main(String[] args) {
for (Days day:Days.values()){
    System.out.println(day+" = "+day.descr+" = "+day.shortName());
}
    }
}

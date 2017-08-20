package ru.tk.lambda.t2;

//import static java.lang.System.out;

public class Program {

    public static void fire(Object o) {
        System.out.println("feedbwfeed");
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);
        switcher.addElectricityListener(
                new ElectricityConsumer() {

                    @Override
                    public void electricityOn(Object o) {
                        System.out.println("fire");
                        System.out.println("fire2");
                    }
                }
        );

        switcher.addElectricityListener(p -> {
                    System.out.println("fire");
                    System.out.println("fire2");
                }
        );

        switcher.addElectricityListener(Program::fire);

        switcher.switchOn();
    }
}

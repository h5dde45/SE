package ru.tk.lambda.t2;

public class Lamp implements ElectricityConsumer{
    public void lightOn(){
        System.out.println("Lamp light");
    }

    @Override
    public void electricityOn(Object o) {
        lightOn();
    }
}

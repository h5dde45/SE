package ru.tk.lambda.t2;

import java.util.ArrayList;

public class Switcher {

    private ArrayList<ElectricityConsumer> consumer=new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer consumer){
        this.consumer.add(consumer);
    }
    public void removeElectricityListener(ElectricityConsumer consumer){
        this.consumer.remove(consumer);
    }

    public void switchOn() {
        System.out.println("Включен");
        for(ElectricityConsumer c:consumer){
            c.electricityOn(this);
        }
    }
}

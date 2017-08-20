package ru.tk.lambda.t2;

public class Radio implements ElectricityConsumer{

    public void playMusic(){
        System.out.println("Radio play");
    }

    @Override
    public void electricityOn(Object o) {
        playMusic();
    }
}

package ru.sl.q62_q69;

public class AnanymousDemoClass {
    public static void main(String[] args) {
        new Thread((
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("**************");
                    }
                }
                )).start();
    }
}

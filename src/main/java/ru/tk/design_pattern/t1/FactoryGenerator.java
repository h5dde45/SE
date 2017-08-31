package ru.tk.design_pattern.t1;

public class FactoryGenerator {


    public static AbstractFactory getFactory(String s){
        if(s.equalsIgnoreCase("adIdas")){
            return new AdidasFactory();
        }
        if(s.equalsIgnoreCase("niKe")){
            return new NikeFactory();
        }
        return null;
    }
}

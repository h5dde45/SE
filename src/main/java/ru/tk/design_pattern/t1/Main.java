package ru.tk.design_pattern.t1;

import ru.tk.design_pattern.t1.adidas.AdidasProduct;
import ru.tk.design_pattern.t1.nike.NikeProduct;

public class Main {
    public static void main(String[] args) {
        AbstractFactory afactory = FactoryGenerator.getFactory("adidas");
        AdidasProduct adidasProduct=afactory.getAdidasProduct("Adidas shoes");
        adidasProduct.makeAdidasProduct();
        AbstractFactory nfactory = FactoryGenerator.getFactory("nike");
        NikeProduct nikeProduct=nfactory.getNikeProduct("nike outerwear");
        nikeProduct.makeNikeProduct();
    }
}

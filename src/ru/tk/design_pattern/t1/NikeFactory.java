package ru.tk.design_pattern.t1;

import ru.tk.design_pattern.t1.adidas.AdidasProduct;
import ru.tk.design_pattern.t1.nike.NikeOutwear;
import ru.tk.design_pattern.t1.nike.NikeProduct;
import ru.tk.design_pattern.t1.nike.NikeShoes;

public class NikeFactory extends AbstractFactory {

    @Override
    AdidasProduct getAdidasProduct(String s) {
        return null;
    }

    @Override
    NikeProduct getNikeProduct(String s) {
        if (s.equalsIgnoreCase("Nike outerwear")) return  new NikeOutwear();
        if (s.equalsIgnoreCase("Nike shoes")) return new NikeShoes();
        return null;
    }
}

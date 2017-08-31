package ru.tk.design_pattern.t1;

import ru.tk.design_pattern.t1.adidas.AdidasOuterwear;
import ru.tk.design_pattern.t1.adidas.AdidasProduct;
import ru.tk.design_pattern.t1.adidas.AdidasShoes;
import ru.tk.design_pattern.t1.nike.NikeProduct;

public class AdidasFactory  extends AbstractFactory {
    @Override
    AdidasProduct getAdidasProduct(String s) {
        if (s.equalsIgnoreCase("AdidaS outerwear")) return new AdidasOuterwear();
        if (s.equalsIgnoreCase("AdidaS shoes")) return new AdidasShoes();
        return null;
    }

    @Override
    NikeProduct getNikeProduct(String s) {
        return null;
    }
}

package ru.tk.design_pattern.t1;

import ru.tk.design_pattern.t1.adidas.AdidasProduct;
import ru.tk.design_pattern.t1.nike.NikeProduct;

public abstract class AbstractFactory {
    abstract AdidasProduct getAdidasProduct(String s);
    abstract NikeProduct getNikeProduct(String s);
}

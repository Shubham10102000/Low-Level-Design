package com.lld.structural.decorator;

public class ExtraCheese extends ToppingDecorator {
    private final BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 10;
    }
}

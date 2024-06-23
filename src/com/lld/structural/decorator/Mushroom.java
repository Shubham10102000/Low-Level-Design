package com.lld.structural.decorator;

public class Mushroom extends ToppingDecorator {
    private final BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 15;
    }
}

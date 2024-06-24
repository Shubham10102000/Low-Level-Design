package com.lld.creational.factory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
    }
}

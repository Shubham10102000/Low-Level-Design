package com.lld.structural.composite.prob2;

public class Number implements ArithmeticExpression{
    int value;

    public Number(int value){
        this.value = value;
    }

    public int evaluate(){
        System.out.println("Number value is :" + value);
        return value;
    }
}


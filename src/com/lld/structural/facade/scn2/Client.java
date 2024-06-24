package com.lld.structural.facade.scn2;

public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
    }
}

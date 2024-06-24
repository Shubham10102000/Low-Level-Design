package com.lld.structural.bridge.implementor;

public class WaterBreatheImplementor implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Absorbs oxygen through water and exhales carbon dioxide");
    }
}

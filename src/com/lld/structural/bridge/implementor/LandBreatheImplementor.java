package com.lld.structural.bridge.implementor;

public class LandBreatheImplementor implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Inhales Oxygen through air and Exhales Carbon dioxide");
    }
}

package com.lld.structural.bridge.abstracted;

import com.lld.structural.bridge.implementor.BreatheImplementor;

public class Fish extends LivingThings {
    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}

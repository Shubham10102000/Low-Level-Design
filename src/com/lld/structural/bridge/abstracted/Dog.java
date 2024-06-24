package com.lld.structural.bridge.abstracted;

import com.lld.structural.bridge.implementor.BreatheImplementor;

public class Dog extends LivingThings {
    Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}

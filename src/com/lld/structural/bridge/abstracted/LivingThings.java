package com.lld.structural.bridge.abstracted;

import com.lld.structural.bridge.implementor.BreatheImplementor;

public abstract class LivingThings {
    public final BreatheImplementor breatheImplementor;

    LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract public void breatheProcess();
}

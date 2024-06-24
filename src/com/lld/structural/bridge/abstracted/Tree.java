package com.lld.structural.bridge.abstracted;

import com.lld.structural.bridge.implementor.BreatheImplementor;

public class Tree extends LivingThings {
    Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}

package com.lld.structural.bridge;

import com.lld.structural.bridge.abstracted.Fish;
import com.lld.structural.bridge.abstracted.LivingThings;
import com.lld.structural.bridge.implementor.WaterBreatheImplementor;

public class Client {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreatheImplementor());
        fish.breatheProcess();
    }
}

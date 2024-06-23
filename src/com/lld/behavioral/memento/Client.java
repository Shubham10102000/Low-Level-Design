package com.lld.behavioral.memento;

import com.lld.behavioral.memento.caretaker.ConfigurationCareTaker;
import com.lld.behavioral.memento.memento.ConfigurationMemento;
import com.lld.behavioral.memento.orignator.ConfigurationOrignator;

public class Client {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        ConfigurationOrignator orignator = new ConfigurationOrignator(13,14);

        // save snapshot 1
        ConfigurationMemento snapshot1 = orignator.createMemento();

        // add it to history
        careTaker.addMemento(snapshot1);

        // change state
        orignator.setHeight(12);
        orignator.setWidth(11);

        // save snapshot 2
        ConfigurationMemento snapshot2 = orignator.createMemento();

        // add it to history
        careTaker.addMemento(snapshot2);

        // change state
        orignator.setHeight(9);
        orignator.setWidth(12);

        // undo
        ConfigurationMemento lastSnapShot = careTaker.undo();
        orignator.restoreMemento(lastSnapShot);

        System.out.println(orignator);
    }
}

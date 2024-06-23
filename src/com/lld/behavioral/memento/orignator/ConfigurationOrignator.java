package com.lld.behavioral.memento.orignator;

import com.lld.behavioral.memento.memento.ConfigurationMemento;

public class ConfigurationOrignator {
    private int height;
    private int width;

    public ConfigurationOrignator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMemento () {
        return new ConfigurationMemento(height, width);
    }

    public void restoreMemento(ConfigurationMemento configurationMemento) {
        this.height = configurationMemento.getHeight();
        this.width = configurationMemento.getWidth();
    }

    @Override
    public String toString() {
        return "ConfigurationOrignator{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}

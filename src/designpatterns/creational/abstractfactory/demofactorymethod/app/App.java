package designpatterns.creational.abstractfactory.demofactorymethod.app;

import designpatterns.creational.abstractfactory.demofactorymethod.guifactory.GUIFactory;

public class App {
    public void paint(GUIFactory factory) {
        factory.createButton().paint();
        factory.createCheckbox().paint();
    }
}

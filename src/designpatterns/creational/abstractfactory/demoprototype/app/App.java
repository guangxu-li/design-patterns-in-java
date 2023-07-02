package designpatterns.creational.abstractfactory.demoprototype.app;

import designpatterns.creational.abstractfactory.demoprototype.uicomponentfactory.UIComponentFactory;

public class App {
    public void paint(UIComponentFactory factory) {
        factory.createDropdownComponent().paint();
        factory.createTextboxComponent().paint();
    }
}

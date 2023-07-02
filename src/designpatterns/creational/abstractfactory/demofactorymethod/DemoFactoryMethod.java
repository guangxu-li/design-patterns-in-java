package designpatterns.creational.abstractfactory.demofactorymethod;

import designpatterns.creational.abstractfactory.demofactorymethod.app.App;
import designpatterns.creational.abstractfactory.demofactorymethod.guifactory.GUIFactory;
import designpatterns.creational.abstractfactory.demofactorymethod.guifactory.LinuxGUIFactory;
import designpatterns.creational.abstractfactory.demofactorymethod.guifactory.MacOSGUIFactory;

public class DemoFactoryMethod {
    public static void main(String[] args) {
        System.out.println("prepare App");
        App app = new App();

        System.out.println("paint with linux GUI factory");
        GUIFactory linuxGUIFactory = new LinuxGUIFactory();
        app.paint(linuxGUIFactory);

        System.out.println("paint with macOS GUI factory");
        GUIFactory macOSGUIFactory = new MacOSGUIFactory();
        app.paint(macOSGUIFactory);
    }
}

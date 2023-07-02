package designpatterns.creational.abstractfactory.demofactorymethod.button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}

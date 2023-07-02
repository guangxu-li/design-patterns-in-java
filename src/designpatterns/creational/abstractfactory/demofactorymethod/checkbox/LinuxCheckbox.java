package designpatterns.creational.abstractfactory.demofactorymethod.checkbox;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created LinuxCheckbox.");
    }
}

package designpatterns.creational.abstractfactory.demofactorymethod.guifactory;

import designpatterns.creational.abstractfactory.demofactorymethod.button.Button;
import designpatterns.creational.abstractfactory.demofactorymethod.button.LinuxButton;
import designpatterns.creational.abstractfactory.demofactorymethod.checkbox.Checkbox;
import designpatterns.creational.abstractfactory.demofactorymethod.checkbox.LinuxCheckbox;

public class LinuxGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

}

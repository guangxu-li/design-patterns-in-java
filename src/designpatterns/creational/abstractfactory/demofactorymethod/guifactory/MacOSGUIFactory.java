package designpatterns.creational.abstractfactory.demofactorymethod.guifactory;

import designpatterns.creational.abstractfactory.demofactorymethod.button.Button;
import designpatterns.creational.abstractfactory.demofactorymethod.button.MacOSButton;
import designpatterns.creational.abstractfactory.demofactorymethod.checkbox.Checkbox;
import designpatterns.creational.abstractfactory.demofactorymethod.checkbox.MacOSCheckbox;

public class MacOSGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

package designpatterns.creational.abstractfactory.demofactorymethod.guifactory;

import designpatterns.creational.abstractfactory.demofactorymethod.button.Button;
import designpatterns.creational.abstractfactory.demofactorymethod.checkbox.Checkbox;

public interface GUIFactory {
    public Button createButton();

    public Checkbox createCheckbox();
}

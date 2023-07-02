package designpatterns.creational.abstractfactory.demoprototype.uicomponentfactory;

import designpatterns.creational.abstractfactory.demoprototype.dropdowncomponent.DropdownComponent;
import designpatterns.creational.abstractfactory.demoprototype.textboxcomponent.TextboxComponent;

public class UIComponentFactory {
    private DropdownComponent dropdownComponentPrototype;
    private TextboxComponent textboxComponentPrototype;

    public UIComponentFactory(DropdownComponent dropdowComponent,
            TextboxComponent textboxComponent) {
        this.dropdownComponentPrototype = dropdowComponent;
        this.textboxComponentPrototype = textboxComponent;
    }

    public DropdownComponent createDropdownComponent() {
        return ((DropdownComponent) dropdownComponentPrototype.clone());
    }

    public TextboxComponent createTextboxComponent() {
        return ((TextboxComponent) textboxComponentPrototype.clone());
    }
}

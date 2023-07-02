package designpatterns.creational.abstractfactory.demoprototype;

import designpatterns.creational.abstractfactory.demoprototype.app.App;
import designpatterns.creational.abstractfactory.demoprototype.dropdowncomponent.LinuxDropdownComponent;
import designpatterns.creational.abstractfactory.demoprototype.dropdowncomponent.MacOSDropdownComponent;
import designpatterns.creational.abstractfactory.demoprototype.textboxcomponent.LinuxTextboxComponent;
import designpatterns.creational.abstractfactory.demoprototype.textboxcomponent.MacOSTextboxComponent;
import designpatterns.creational.abstractfactory.demoprototype.uicomponentfactory.UIComponentFactory;

public class DemoPrototype {
        public static void main(String[] args) {
                System.out.println("prepare App");
                App app = new App();

                System.out.println("paint with linux UI component factory");
                UIComponentFactory linuxUIComponentFactory = new UIComponentFactory(
                                new LinuxDropdownComponent(), new LinuxTextboxComponent());
                app.paint(linuxUIComponentFactory);

                System.out.println("paint with macOS UI component factory");
                UIComponentFactory macOSUIComponentFactory = new UIComponentFactory(
                                new MacOSDropdownComponent(), new MacOSTextboxComponent());
                app.paint(macOSUIComponentFactory);
        }
}

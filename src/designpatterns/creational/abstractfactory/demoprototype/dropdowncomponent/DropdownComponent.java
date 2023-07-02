package designpatterns.creational.abstractfactory.demoprototype.dropdowncomponent;

public abstract class DropdownComponent implements Cloneable {
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException: " + e.getMessage());
            return null;
        }
    }

    public void paint() {};
}

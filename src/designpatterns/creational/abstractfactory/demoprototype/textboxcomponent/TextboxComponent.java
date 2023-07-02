package designpatterns.creational.abstractfactory.demoprototype.textboxcomponent;

public abstract class TextboxComponent implements Cloneable {
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

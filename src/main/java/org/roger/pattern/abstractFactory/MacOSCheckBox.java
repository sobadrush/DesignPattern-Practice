package org.roger.pattern.abstractFactory;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("...建立「MacOS」核取方塊...");
    }
}

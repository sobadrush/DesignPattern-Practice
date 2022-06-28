package org.roger.pattern.abstractFactory;

public class WindowsOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("...建立「WindowsOS」核取方塊...");
    }
}

package org.roger.pattern.abstractFactory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("...建立「MacOS」按鈕...");
    }
}

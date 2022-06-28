package org.roger.pattern.abstractFactory;

public class WindowsOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("...建立「WindowsOS」按鈕...");
    }
}

package org.roger.pattern.abstractFactory;

public class Demo {

    public static void main(String[] args) {

        MainGuiFactory mainGuiFactory = new MainGuiFactory(new MacOSFactory());
        mainGuiFactory.createUIComponent();

        System.out.println("====================================================");

        mainGuiFactory = new MainGuiFactory(new WindowsOSFactory());
        mainGuiFactory.createUIComponent();

    }

}

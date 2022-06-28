package org.roger.pattern.abstractFactory;

/**
 * 工廠實例 - implements 「抽象工廠」介面：GuiFactory
 */
public class MacOSFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }

}

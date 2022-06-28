package org.roger.pattern.abstractFactory;

/**
 * 工廠實例 - implements 「抽象工廠」介面：GuiFactory
 */
public class WindowsOSFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsOSCheckBox();
    }

}

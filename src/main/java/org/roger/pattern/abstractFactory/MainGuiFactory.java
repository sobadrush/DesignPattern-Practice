package org.roger.pattern.abstractFactory;

/**
 * @author RogerLo
 * @date 2022/6/28
 */
public class MainGuiFactory {

    private Button button;
    private CheckBox checkBox;

    public MainGuiFactory(GuiFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void createUIComponent() {
        this.button.paint();
        this.checkBox.paint();
    }

}

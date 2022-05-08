package org.roger.pattern.simpleFactory;

/**
 * @author RogerLo
 * @date 2022/5/8
 */
public class App {

    public static void main(String[] args) {
        ShapeFactory.getShape("Heart").draw();
        ShapeFactory.getShape("Diamond").draw();
        ShapeFactory.getShape("Spade").draw();
    }

}

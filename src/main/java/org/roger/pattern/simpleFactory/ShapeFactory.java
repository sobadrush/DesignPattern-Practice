package org.roger.pattern.simpleFactory;

/**
 * @author RogerLo
 * @date 2022/5/8
 */
public class ShapeFactory {

    public static Shape getShape(String shapeKey) {
        if (shapeKey.isEmpty()) {
            return null;
        }

        switch (shapeKey) {
            case "Heart":
                return new Heart();
            case "Spade":
                return new Spade();
            case "Diamond":
                return new Diamond();
            default:
                break;
        }
        return null;
    }

}

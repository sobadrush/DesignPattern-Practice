package org.roger.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RogerLo
 * @date 2022/5/8
 */
public class PrototypeManager {

    private static Map<String, Shape> PROTOTYPE_MAP = new HashMap<>();

    static {
        PrototypeManager.addPrototype("circle", new Circle());
        PrototypeManager.addPrototype("square", new Square());
    }

    public static void addPrototype(String key, Shape shape) {
        PROTOTYPE_MAP.put(key, shape);
    }

    public static Shape getShape(String key) {
        return (Shape) PROTOTYPE_MAP.get(key);
    }

}

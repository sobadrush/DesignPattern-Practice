package org.roger.pattern.decoratorPattern;

/**
 * @author RogerLo
 * @date 2022/5/8
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("... Drawing Rectangle ...");
    }
}

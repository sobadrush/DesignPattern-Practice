package org.roger.pattern.decoratorPattern;

/**
 * @author RogerLo
 * @date 2022/5/8
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("... Drawing Circle ...");
    }
}
